import java.util.*;
class StackOp{
    int arr[] = new int[100];
    int size, top;
    public StackOp(){
        top = -1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        size = sc.nextInt();
    }
    public void push(int val){
        if(top==size-1){
            System.out.println("Stack is Overflow!!");
        }else{
            top++;
            arr[top] = val;
        }
    }
    public int pop(){
        if(top==-1){
            return -404;
        }else{
            int temp = arr[top];
            top--;
            return temp;
        }
    }
    public int peek(){
        if(top==-1){
            return -404;
        }else{
            return arr[top];
        }
    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }else{
            return false;
        }
    }
    public void show(){
        if(top==-1){
            System.out.println("Stack is Empty!!");
        }else{
            System.out.print("The stack is: ");
            for(int i=0;i<=top;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
public class StackExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackOp obj = new StackOp();
        while(true){
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. PEEK");
            System.out.println("4. CHECK EMPTY");
            System.out.println("5. SHOW");
            System.out.println("0. EXIT");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            if(ch==0){
                break;
            }
            else if(ch==1){
                System.out.print("Enter element: ");
                int val = sc.nextInt();
                obj.push(val);
                System.out.println("Element pushed!!");
            }
            else if(ch==2){
                if(obj.pop() == -404){
                    System.out.println("Stack is Underflow!!");
                }else{
                    System.out.println("Element popped!!"+ obj.pop());
                }
            }
            else if(ch==3){
                System.out.println("Element peeked!!"+ obj.peek());
            }
            else if(ch==4){
                System.out.println("Element is empty: "+ obj.isEmpty());
            }
            else if(ch==5){
                obj.show();
            }
        }
    }
}
