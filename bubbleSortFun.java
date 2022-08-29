import java.util.Scanner;

public class bubbleSortFun {

    public static int bubbleSort(int arr[],int n){
        int flag =0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
        }
        return flag;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); 
        }
        System.out.println("Array before sorting: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        int flag = bubbleSort(arr, n);
       
        if(flag==0){
            System.out.print("\nArray is already sorted.");
        }
        else{
            System.out.println("\nArray after sorting: ");
            for(int i=0; i<n; i++){
                System.out.print(arr[i]+" ");
            }     
        }
    }
}
