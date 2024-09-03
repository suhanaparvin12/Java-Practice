package StatementsJava;
import java.util.*;
public class EvenOdd {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a numbers: ");
            int x = sc.nextInt();
            if (x % 2 == 0){
                System.out.println("It is an Even Number");
            }
            else{
                System.out.println("It is an Odd Number");
            }
        }
    }
}
