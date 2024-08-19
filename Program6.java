//import stuff here!
import java.util.Scanner;
//Your code here
public class Program6 {
    public static void main(String[] args) {
        final double pi = 3.14159;
        double radius = 0.0;
        double diameter = 0.0;
        double circumference = 0.0;
        double area = 0.0;
        Scanner scanText = new Scanner(System.in);
        
        System.out.println("Enter the radius of the circle:");
        
        radius = scanText.nextDouble();
        diameter = 2 * radius;
        circumference = diameter * pi;
        area = pi * (radius * radius);
        
        System.out.println();
        System.out.print("The circle's diameter is ");
        System.out.format("%.3f", diameter);
        System.out.println();
        System.out.print("The circle's circumference is ");
        System.out.format("%.3f", circumference);
        System.out.println();
        System.out.print("The circle's area is ");
        System.out.format("%.3f", area);
        System.out.println();
        
        
    }
}
//Paste console output below:
/*

Enter the radius of the circle:
3.712

The circle's diameter is 7.424
The circle's circumference is 23.323
The circle's area is 43.288
*/
