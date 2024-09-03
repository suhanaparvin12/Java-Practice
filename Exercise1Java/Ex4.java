package Exercise1Java;
import java.util.*;
public class Ex4 {
    public static double circumference(double radius){
        double circumference = 2* Math.PI * radius;
        return circumference;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double radius = sc.nextDouble();
        double calculate = circumference(radius);
        System.out.println("The circumference of the circle is: " + radius);
    }
}

