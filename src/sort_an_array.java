import java.util.Arrays;

public class sort_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Convert the string to a char array
//	    String myStr = "Hello";
//
//	    char[] myArray = myStr.toCharArray();
//	    
//	    for (char i : myArray) {
//	      System.out.println(i);
//	    }
	    
	    
	    
	    
	    
	    
	    
	    //Sort a string array
	    String[] cars = {"Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi"};
	    Arrays.sort(cars);
	    
	    for (String car : cars) {
	      System.out.println(car);
	    }
	    
	    for (int j=0;j<cars.length;j++) {
	    	System.out.println(j);
	    	System.out.println(cars[j]);
	    }

	    

	    
	  //Sort an array
	    int arr[] = {20, 3, 18, 9, 21, 26, 5, 4};
	    Arrays.sort(arr);
	    
	    System.out.println(Arrays.toString(arr));
	    
	    for (int a : arr) {
		      System.out.println(a);
		    }
	    
	    
	    
	    
	    
	    
	    
	    //Sum of smallest and largest
	    int ages[] = {20, 3, 18, 9, 21, 26, 5, 4};
	    Arrays.sort(ages);
	    
	    int smallest = ages[0];
	    int largest = ages[ages.length-1];
	    
	    int sum = smallest + largest;
	    
	    System.out.println(sum);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	 
	    
	    
	}

}
