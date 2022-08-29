import java.util.Scanner;

public class DLL {
    private class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head = null;
    private Node tail = null;

    void insertfirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            tail = head;
        }
        head = newNode;
    }

    void insertlast(int data) {
        Node newNode = new Node(data);
        Node last = head;
        newNode.next = null;
        if (head == null) {
            newNode.prev = null;
            head = newNode;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }

    public void deletefirst() {
        if (head == null) {
            tail = head;
            return;
        }
        head = head.next;
    }

    public void deleteafter(int key) {
        if (head.data == key) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == key) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    public void insertbet(int key, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                newNode.next = temp.next;
                temp.next = newNode;
                newNode.prev = temp;
                temp.next.prev = newNode;
            }
            temp = temp.next;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DLL lst = new DLL();
        Scanner in = new Scanner(System.in);
        int ch = 0, p = 100;
        while (p > 0) {
            System.out.println(
                    "1.Inset First\n2.Insert After\n3.Insert Last\n4.Delete\n5.Delete After\n6.Display\n7.Exit");
            System.out.println("Enter your choice");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("enter data to be added");
                    int d = in.nextInt();
                    lst.insertfirst(d);
                    break;
                case 2:
                    System.out.println("enter key and data to be added");
                    int key = in.nextInt();
                    int j = in.nextInt();
                    lst.insertbet(key, j);
                    break;
                case 3:
                    System.out.println("enter key and data to be added");
                    int b = in.nextInt();
                    lst.insertlast(b);
                    break;
                case 4:
                    lst.deletefirst();
                    break;
                case 5:
                    System.out.println("enter key to be deleted");
                    int a = in.nextInt();
                    lst.deleteafter(a);
                    break;
                case 6:
                    lst.display();
                    break;
                case 7:
                    p = 0;
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
    }
}
