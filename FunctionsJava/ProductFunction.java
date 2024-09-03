package FunctionsJava;
import java.util.*;
public class ProductFunction {
    public static int mutli(int a, int b){
        int product = a * b;
        return product;
        //return a * b;//second process
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        int product = mutli(a, b);
        System.out.println("The product of two number is:" + product);
    }
}
