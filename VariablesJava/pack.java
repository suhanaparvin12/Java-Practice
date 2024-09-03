import java.util.*;
public class pack{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your name: ");
            String name;
            name = sc.nextLine();
            System.out.println("Enter your age: ");
            int age;
            age = sc.nextInt();
            System.out.println("The name is: " + name);
            System.out.println("The age is: " + age);
        }
    }
}
