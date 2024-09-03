package Exercise1Java;
import java.util.*;
public class Ex2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numbers: ");
        int n = sc.nextInt();
        int sum = Ex2(n);
        System.out.println("The sum of all odd numbers from 1 to " + n + " is: " + sum);
    } 
    public static int Ex2(int n){
        int totalSum = 0;
        // loop through numbers from 1 to n
        for(int i=0; i<=n; i++){
            // check if teh number is odd
            if(i % 2 != 0){
                // add the odd numbers to the sum
                totalSum += i;
            }
        }
        return totalSum;
    }
}
