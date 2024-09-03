package StatementsJava;
import java.util.*;
public class Button {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter button numbers: ");
            int button = sc.nextInt();
            if (button == 1) {
                System.out.println("Hello");
            }
            else if (button == 2) {
                System.out.println("Namaste");
            }
            else if (button == 3) {
                System.out.println("Bonjour");
            }
            else{
                System.out.println("Invalid button");
            }
        }
    }
}
