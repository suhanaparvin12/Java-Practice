package FunctionsJava;
import java.util.*;
public class SumFunction {
    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        int sum = calculateSum(a,b);
        System.out.println("The sum is: " + sum);
    }
}
