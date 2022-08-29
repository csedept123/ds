import java.util.Scanner;

public class Queuell {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head = null;
    private Node tail = null;

    public void enqueue(int data) {
        Node newNode = new Node(data);
        Node last = head;
        if (head == null) {
            head = newNode;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public void dequeue() {
        if (head == null) {
            tail = head;
            return;
        }
        head = head.next;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + "->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Queuell lst = new Queuell();
        Scanner in = new Scanner(System.in);
        int ch = 0, p = 100;
        while (p > 0) {
            System.out.println("1.Enqueue\n 2.Dequeue\n3.Display\n4.Exit");
            System.out.println("Enter your choice: ");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the data to be added:");
                    int d = in.nextInt();
                    lst.enqueue(d);
                    break;
                case 2:
                    lst.dequeue();
                    break;
                case 3:
                    lst.display();
                    break;
                case 4:
                    p = 0;
                    break;
                default:
                    System.out.println("invalid");
            }
        }
    }
}