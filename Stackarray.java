import java.util.Scanner;

public class Stackarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[80];
        int p = 50;
        System.out.println("Enter the number of elements: ");
        int top = sc.nextInt();
        System.out.println("Enter the elements: ");
        for (int i = 0; i < top; i++) {
            arr[i] = sc.nextInt();
        }

        while (p > 0) {
            System.out.println("\n1.Push\n2.Pop\n3.Display\n4.Exit");
            System.out.println("Enter your option: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    if (top == 80) {
                        System.out.println("Stack overflow!");
                        return;
                    } else {
                        System.out.println("Enter the value you want to push: ");
                        int a = sc.nextInt();
                        arr[top] = a;
                        top++;
                    }
                    break;
                case 2:
                    if (top == 0) {
                        System.out.println("Stsck underflow!");
                        return;
                    } else {
                        top--;
                        System.out.println("Item popped.");
                    }
                    break;
                case 3:
                    System.out.println("Stack is: ");
                    for (int i = top-1; i > 1; i--) {
                        System.out.println(arr[i]);
                    }
                    break;
                case 4:
                    p = 0;
                    break;
                default:
                    System.out.println("Invalid option!!!");

            }
        }
    }

}
