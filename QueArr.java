import java.util.Scanner;

class queue {
    int front, rear, size;
    int arr[];

    queue(int data) {
        front = rear = 0;
        size = data;
        arr = new int[size];
    }

    void enqueue(int data) {
        if (size == rear) {
            System.out.println("Queue is full!");
            return;
        } else {
            arr[rear] = data;
            rear++;
        }
        return;
    }

    void dequeue() {
        if (rear == 0) {
            System.out.println("Queue is empty!");
            return;
        } else {
            for (int i = 0; i < rear-1; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
        }
        return;
    }

    void display() {
        if (rear == 0) {
            System.out.println("Queue is empty!");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " <--");
            }
            return;
        }
    }
}

public class QueArr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=50;
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        queue q=new  queue(n);
        while(p>0){
            System.out.println("\nSelect option\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                System.out.println("Enter the value to insert.");
                int d = sc.nextInt();
                q.enqueue(d);
                break;
                case 2:
                q.dequeue();
                break;
                case 3:
                q.display();
                break;
                case 4:
                p=0;
                default:
                System.out.println("Invalid option!!!");
                break;
            }
        }
    }
}