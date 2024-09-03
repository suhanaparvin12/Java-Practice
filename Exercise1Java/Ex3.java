package Exercise1Java;
import java.util.*;
public class Ex3 {
    public static int numbers(int num1, int num2){
        if(num1 > num2){
            return num1;
        }
        else{
            return num2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        int greater = numbers(num1, num2);
        System.out.println("The greater number is: " + greater);
    }
}
