package LoopsJava;
import java.util.*;
public class Tables {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n value: ");
            int n = sc.nextInt();
            for (int i = 1; i<=10; i++){
                System.out.println(i*n);
            }
        }
    }
}
