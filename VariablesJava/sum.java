import java.util.*;
public class sum {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of a: ");
            int a = sc.nextInt();
            System.out.print("Enetr the value of b: ");
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println("The sum is: " + sum);
        }
    }
}
