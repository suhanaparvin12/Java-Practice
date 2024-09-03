package StatementsJava;
import java.util.*;
public class Age {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            if(age>18){
               System.out.println("Adult"); 
            }
            else{
                System.out.println("Not Adult");
            }
        }
    }
}
