
public class average_of_int_array {

	public static void main(String[] args) {
		
		int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

		float sum = 0;

		for (int age : ages) {
		  sum += age;
		}
	
		float avg;	
		avg = sum / ages.length;
		System.out.println("The average age is: " + avg);
		
		
		System.out.println("Random number: " + (Math.random()*100));
	
	}
	
}
