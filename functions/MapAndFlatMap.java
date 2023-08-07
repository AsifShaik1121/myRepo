package functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Institute{
	
	private String college;
	
	private List<String> locations;

	public Institute(String college, List<String> locations) {

		this.college = college;
		this.locations = locations;
	}
	

	public String getCollege() {
		return college;
	}

	public List<String> getLocations() {
		return locations;
		
		
	}
	
	
}

public class MapAndFlatMap {

	public static void main(String[] args) {
		
		
		List<Institute> instituteList = new ArrayList<>();
        
		instituteList.add(new Institute("IIM", Arrays.asList("Bangalore", "Ahmedabad", "Kozhikode", "Lucknow")));
		instituteList.add(new Institute("IIT", Arrays.asList("Delhi", "Mumbai", "Kharagpur")));
		instituteList.add(new Institute("NIFT", Arrays.asList("Hyderabad", "Mumbai", "Patna", "Bangalore")));
		
		//using map function
		
		instituteList.stream().map(Institute::getCollege).collect(Collectors.toList()).forEach(n->System.out.println(n));
		
		//using flatmap
		Set<String> allLocations = instituteList.stream().flatMap(institute->institute.getLocations().stream()).collect(Collectors.toSet());
		
		System.out.println(allLocations);


	}

}
