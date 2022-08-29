import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limit,arr[],i;
        System.out.println("Enter the limit of array: ");
        
        limit = sc.nextInt();
        arr = new int[limit];
        System.out.println("Enter the values: ");
        for(i=0; i<limit; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value to find: ");
        int key = sc.nextInt();

        for(i=0; i<limit; i++){
            if(arr[i]==key){
                System.out.println(key + " is present at index "+i);
                break;
            }
        }

        if(i==limit){
            System.out.println("The element is not present");
        }
    
    }
}
