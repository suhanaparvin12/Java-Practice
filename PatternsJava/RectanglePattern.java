package PatternsJava;
import java.util.*;
public class RectanglePattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int row = 4;
            int col = 5;
            for (int i = 1; i<=row; i++){
                for (int j = 1; j<=col; j++){ 
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
        }
    }
}
