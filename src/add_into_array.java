import java.util.ArrayList;

public class add_into_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    for (String car : cars) {
		      System.out.println(car);
		    }
		   
		    
		    System.out.println();
		    
		    
		    String[] bikes = {"Yamaha", "BMW", "Hero"};
		    for (String bike : bikes) {
			      System.out.println(bike);
			    }
		    
		    
		    
	}

}
