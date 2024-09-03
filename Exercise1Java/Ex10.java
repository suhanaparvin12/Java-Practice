package Exercise1Java;
import java.util.*;
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print(a + " ");
        if(n > 1){
            //find nth term
            for(int i=2; i<n; i++){
                System.out.print(b + " ");
                // the concept below is called swapping
                int temp = b;
                b = a + b;
                a = temp;
            }
            System.out.println();
        }
    }
}
