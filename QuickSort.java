import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int[] list) {
        quickSort(list, 0, list.length - 1);
    }

    private static void quickSort(int[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }

    private static int partition(int[] list, int first, int last) {
        int pivot = list[first];
        int low = first + 1;
        int high = last;

        while (high > low) {
            while (low <= high && list[low] <= pivot)
                low++;
            while (low <= high && list[high] > pivot)
                high--;
            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }

        }
        while (high > first && list[high] >= pivot)
            high--;
        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        } else {
            return first;
        }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        QuickSort ob = new QuickSort();
        Scanner in = new Scanner(System.in);
        int c, n, arr[];
        System.out.println("Enter the no. of elements");
        n = in.nextInt();
        arr = new int[n];
        System.out.println("Enter those " + n + " Elements");
        for (c = 0; c < n; c++)

            arr[c] = in.nextInt();
        System.out.println("Array before sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        ob.quickSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
