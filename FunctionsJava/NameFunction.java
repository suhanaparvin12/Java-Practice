package FunctionsJava;
import java.util.*;
public class NameFunction {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter yor name: ");
        String name = sc.nextLine();
        System.out.println("My name is:" +name);
    }
}
