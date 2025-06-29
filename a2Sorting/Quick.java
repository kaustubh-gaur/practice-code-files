package a2Sorting;

import java.util.Scanner;

public class Quick {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.printf("Enter %d elements in the array : ", size);
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        //Original Array Traversal
        System.out.print("The original array is : ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        //Sorted Array Traversal
        System.out.print("The sorted array is : ");
        for (int num : quickSort(array)) {
            System.out.print(num + " ");
        }

    }

    static int[] quickSort(int[] array) {
        int low = 0;
        int high = array.length - 1;
        return quickDriver(array, low, high);
    }

    static int[] quickDriver(int[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = getPartitionIndex(array, low, high);
            quickDriver(array, low, partitionIndex - 1);
            quickDriver(array, partitionIndex + 1, high);
        } else return array;
        return array;
    }

    static int getPartitionIndex(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (array[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (array[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[j];
        array[j] = array[low];
        array[low] = temp;
        return j;
    }
}

