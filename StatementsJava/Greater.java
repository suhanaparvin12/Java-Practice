package StatementsJava;
import java.util.*;
public class Greater {
   public static void main(String args[]){
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter a value: ");
        int a = sc.nextInt();
        System.out.print("Enter b value: ");
        int b = sc.nextInt();
        if (a == b){
            System.out.println("Equal");
        }
        else{
            if(a>b){
                System.out.println("a is greater");
            }
            else{
                System.out.println("a is lesser");
            }
        }
    }
   } 
}
