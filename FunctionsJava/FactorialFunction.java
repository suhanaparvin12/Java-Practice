package FunctionsJava;
import java.util.*;
public class FactorialFunction {
    public static void printFactorial(int n){
        //if a number is negative then apply condition
        if(n < 0){
            System.out.println("Invalid number!!");
            return;
        }
        //loops
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printFactorial(n);
    }
}
