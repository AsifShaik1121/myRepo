package org.kafka.demo;

import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

public class ProducerDemoWithCallback {

    private static final Logger log= LoggerFactory.getLogger(ProducerDemoWithCallback.class.getSimpleName());
    public static void main(String[] args) {
        log.info("I am Kafka Producer");

        //create producer properties
        Properties properties=new Properties();
        //properties.setProperty("key","value");
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"127.0.0.1:9092");

        //properties.setProperty("key.serializer","");
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        //properties.setProperty("value.serializer","");
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,StringSerializer.class.getName());

        //create a producer
        KafkaProducer<String,String> producer=new KafkaProducer<>(properties);

        for(int i=0;i<10;i++) {

            //create producer record
            ProducerRecord<String, String> producerRecord = new ProducerRecord<>("demo_java", "hello kafka" +i);

            //send data
            producer.send(producerRecord, new Callback() {
                @Override
                public void onCompletion(RecordMetadata metadata, Exception e) {

                    if (e == null) {

                        log.info("Received new metadata/ \n " +
                                "Topic:  " + metadata.topic() + "\n" +
                                "Partition  " + metadata.partition() + "\n" +
                                "offset :  " + metadata.offset() + "\n" +
                                "timestamp:  " + metadata.timestamp()
                        );
                    } else {

                        log.error("error while producing ", e);
                    }

                }
            });
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        // flush data - synchronous
        producer.flush();

        //flush and close producer
        producer.close();
    }
}