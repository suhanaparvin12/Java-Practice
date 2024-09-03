import java.util.*;

class Node {
    public int data;
    public Node prev;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    private Node head;

    public DoublyLinkedList() {
        head = null;
    }

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        System.out.println("Node inserted at the beginning!!");
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
        System.out.println("Node inserted at the end!!");
    }

    public void insertAtMiddle(int data, int search) {
        boolean flag = false;
        Node temp = head;
        while (temp != null) {
            if (temp.data == search) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (!flag) {
            System.out.println("Node not found!!");
        } else {
            Node newNode = new Node(data);
            Node nextNode = temp.next;
            temp.next = newNode;
            newNode.prev = temp;
            if (nextNode != null) {
                nextNode.prev = newNode;
                newNode.next = nextNode;
            }
            System.out.println("Node inserted in the middle!!");
        }
    }

    public void showForward() {
        if (head == null) {
            System.out.println("Empty Linked List!!");
        } else {
            System.out.println("Linked List (Forward):");
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public void showBackward() {
        if (head == null) {
            System.out.println("Empty Linked List!!");
        } else {
            System.out.println("Linked List (Backward):");
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            while (temp != null) {
                System.out.print(temp.data + " <- ");
                temp = temp.prev;
            }
            System.out.println("null");
        }
    }

    public void deleteAtStart() {
        if (head == null) {
            System.out.println("No nodes available to delete!!");
        } else {
            Node temp = head;
            head = temp.next;
            if (head != null) {
                head.prev = null;
            }
            temp.next = null;
            System.out.println("Node deleted from the beginning!!");
        }
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("No nodes available to delete!!");
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node prevNode = temp.prev;
            if (prevNode != null) {
                prevNode.next = null;
            } else {
                head = null;
            }
            temp.prev = null;
            System.out.println("Node deleted from the end!!");
        }
    }

    public void deleteAtMiddle(int node) {
        boolean flag = false;
        Node temp = head;
        while (temp != null) {
            if (temp.data == node) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (!flag) {
            System.out.println("Node not found!!");
        } else {
            Node prevNode = temp.prev;
            Node nextNode = temp.next;
            if (prevNode != null) {
                prevNode.next = nextNode;
            } else {
                head = nextNode;
            }
            if (nextNode != null) {
                nextNode.prev = prevNode;
            }
            temp.prev = null;
            temp.next = null;
            System.out.println("Node deleted from the middle!!");
        }
    }
}

public class DoublyLinkedListExample {
    public static void main(String[] args) {
        DoublyLinkedList obj = new DoublyLinkedList();
        Scanner sc = new Scanner(System.in);
        int ch, search, data;
        while (true) {
            System.out.println("1. INSERT AT START");
            System.out.println("2. INSERT AT END");
            System.out.println("3. INSERT AT MIDDLE");
            System.out.println("4. SHOW (FORWARD)");
            System.out.println("5. SHOW (BACKWARD)");
            System.out.println("6. DELETE AT START");
            System.out.println("7. DELETE AT END");
            System.out.println("8. DELETE AT MIDDDLE");
            System.out.println("0. EXIT");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            if (ch == 1) {
                System.out.print("Enter node: ");
                data = sc.nextInt();
                obj.insertAtStart(data);
            } else if (ch == 2) {
                System.out.print("Enter node: ");
                data = sc.nextInt();
                obj.insertAtEnd(data);
            } else if (ch == 3) {
                System.out.print("Enter node: ");
                data = sc.nextInt();
                System.out.println("Enter search element: ");
                search = sc.nextInt();
                obj.insertAtMiddle(data, search);
            } else if (ch == 4) {
                obj.showForward();
            } else if (ch == 5) {
                obj.showBackward();
            } else if (ch == 6) {
                obj.deleteAtStart();
            } else if (ch == 7) {
                obj.deleteAtEnd();
            } else if (ch == 8) {
                System.out.println("Enter element to delete: ");
                int val = sc.nextInt();
                obj.deleteAtMiddle(val);
            } else if (ch == 0) {
                break;
            }
        }
    }
}
