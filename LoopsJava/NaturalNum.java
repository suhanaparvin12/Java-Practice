package LoopsJava;
import java.util.*;
public class NaturalNum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n value: ");
            int n = sc.nextInt();
            int i;
            int sum = 0;
            for (i = 0; i < n; i++){
                sum = sum + i;
            }
            System.out.println(sum);
        }

    }
}
