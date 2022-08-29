import java.util.Scanner;

public class selectionSort {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the elements: ");
        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting: ");
        for(int i=0; i<num; i++){
            System.out.print(arr[i]+" ");
        }

        for(int i=0; i<num-1; i++){
            int min=i;
            for(int j=i+1; j<num; j++){
                if(arr[j]<arr[min])
                min=j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        System.out.println("\nArray after sorting: ");
        for(int i=0; i<num; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
