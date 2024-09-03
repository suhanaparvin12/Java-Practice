import java.util.*;
class Node{
    public int data;
    public Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList{
    private Node head;
    public SinglyLinkedList(){
        head= null;
    }

    public void insertAtStart(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        } else{
            newNode.next = head;
            head = newNode;
        }
        System.out.println("Node inserted!!");
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        } else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Node inserted!!");
    }

    public void insertAtMiddle(int data, int search){
        boolean flag = false;
        Node temp = head;
        while(temp != null){
            if(temp.data == search){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(!flag){
            System.out.println("Node not found!!");
        } else{
            Node newNode = new Node(data);
            Node nextNode = temp.next;
            temp.next = newNode;
            newNode.next = nextNode;
            System.out.println("Node inserted!!");
        }
    }

    public void show(){
        if(head == null){
            System.out.println("Empty Linked List!!");
        } else{
            System.out.println("Linked List :");
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public void deleteAtStart(){
        if(head == null){
            System.out.println("No nodes available to delete!!");
        } else{
            Node temp = head;
            head = temp.next;
            temp.next = null;
            System.out.println("Node deleted!!");
        }
    }

    public void deleteAtEnd(){
        if(head == null){
            System.out.println("No nodes available to delete!!");
        } else{
            Node temp = head;
            Node previousNode = null;
            while (temp.next != null) {
                previousNode = temp;
                temp = temp.next;
            }
            previousNode.next = null;
            System.out.println("Node deleted!!");
        } 
    }

    public void deleteAtMiddle(int node){
        boolean flag = false;
        Node previousNode = null, nexNode = null;
        Node temp = head;
        while(temp != null){
            if(temp.data == node){
                flag = true;
                break;
            }
            previousNode = temp;
            temp = temp.next;
        }
        if(!flag){
            System.out.println("Node not found!!");
        } else{
            nexNode = temp.next;
            previousNode.next = nexNode;
            System.out.println("Node deleted!!");
        } 
    }
}
public class SinglyLinkedListExample {
    public static void main(String[] args) {
        SinglyLinkedList obj = new SinglyLinkedList();
        Scanner sc = new Scanner(System.in);
        int ch, search, data;
        while (true) {
            System.out.println("1. INSERT AT START");
            System.out.println("2. INSERT AT END");
            System.out.println("3. INSERT AT MIDDLE");
            System.out.println("4. SHOW");
            System.out.println("5. DELETE AT START");
            System.out.println("6. DELETE AT END");
            System.out.println("7. DELETE AT MIDDDLE");
            System.out.println("0. EXIT");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            if(ch == 1){
                System.out.print("Enter node: ");
                data = sc.nextInt();
                obj.insertAtStart(data);
            }
            else if(ch == 2){
                System.out.print("Enter node: ");
                data = sc.nextInt();
                obj.insertAtEnd(data);
            }
            else if(ch == 3){
                System.out.print("Enter node: ");
                data = sc.nextInt();
                System.out.println("Enter search element: ");
                search = sc.nextInt();
                obj.insertAtMiddle(data, search);
            }
            else if(ch == 4){
                obj.show();
            }
            else if(ch == 5){
                obj.deleteAtStart();
            }
            else if(ch == 6){
                obj.deleteAtEnd();
            }
            else if(ch == 7){
                System.out.println("Enter element to delete: ");
                int val = sc.nextInt();
                obj.deleteAtMiddle(val);
            }
            else if(ch == 0){
                break;
            }
        }
    }
}
