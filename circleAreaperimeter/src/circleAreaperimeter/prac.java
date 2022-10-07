package circleAreaperimeter;
import java.util.*;
public class prac {

	public static void main(String[] args) {
	 
		Scanner are = new Scanner(System.in);
	  
	  System.out.println("Input the radius of the circle: ");
	  
	  double radius = are.nextDouble();
	 
	  System.out.println("Area is = " + (Math.PI * radius * radius));
	  System.out.println("Perimeter is = " + (2 * radius * Math.PI));
	 
	


	}
}