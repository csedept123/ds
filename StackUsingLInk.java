import java.util.Scanner;

public class StackUsingLInk {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head = null;
    int size = 0;

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        // if (newNode == null) {
        // System.out.println("Overflow");
        // }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void pop() {
        if (head == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Popped element is " + head.data);
        head = head.next;
        size--;
    }

    public void peek() {
        if (head == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(head.data);
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String args[]) {
        StackUsingLInk sl = new StackUsingLInk();
        Scanner in = new Scanner(System.in);
        int ch = 0, p = 100;
        while (p > 0) {
            System.out.println("1.push \n 2.pop \n 3.peek \n 4.display \n 5.exit");
            System.out.println("Enter the choice");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the value to push: ");
                    int d = in.nextInt();
                    sl.push(d);
                    break;
                case 2:
                    sl.pop();
                    System.out.println("Item popped.");
                    break;
                case 3:
                    sl.peek();
                    break;
                case 4:
                    System.out.println("Stack is: ");
                    sl.display();
                    break;
                case 5:
                    p = 0;
                    break;
                default:
                    System.out.println("INVALID");
            }
        }
    }
}
