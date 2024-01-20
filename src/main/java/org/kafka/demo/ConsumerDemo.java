package org.kafka.demo;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;

public class ConsumerDemo {

    private static final Logger log= LoggerFactory.getLogger(ConsumerDemo.class.getSimpleName());
    public static void main(String[] args) {
        log.info("I am kafka consumer!");

        String bootstrapServers ="127.0.0.1:9092";
        String groupID="my-second-application";
        String topic="java_demo";

        //create Consumer config
        Properties properties= new Properties();
        properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapServers);
        properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,StringDeserializer.class.getName());
        properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG,groupID);
        properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG,"earliest");

        //create consumer
        KafkaConsumer<String, String> consumer=new KafkaConsumer<>(properties);

        //subscribe consumer to our topic(s)
        consumer.subscribe(Arrays.asList(topic));

        //poll for new data

        while(true){

            log.info("polling");

            ConsumerRecords<String,String> records=
                    consumer.poll(Duration.ofMillis(1000));

            for(ConsumerRecord<String, String> record : records){

                log.info("key: "+record.key()+"  value: "+record.value());
                log.info("partition :  "+record.partition()+" offset : "+record.offset());
            }
        }
    }
}