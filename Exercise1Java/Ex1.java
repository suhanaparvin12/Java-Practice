package Exercise1Java;
import java.util.*;
public class Ex1 {
    public static int num(int a, int b, int c){
        int avg = (a + b + c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();
        int avg = num(a, b, c);
        System.out.println("The average number is: " + avg);
    }
}
