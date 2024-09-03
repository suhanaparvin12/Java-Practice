package Exercise1Java;
import java.util.Scanner;
public class Ex5 {
    public static boolean isEligible(int age) {
        if(age >= 18){
            return true;
        }
        return false;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int age = sc.nextInt();
        System.out.println(isEligible(age));
    }
}
