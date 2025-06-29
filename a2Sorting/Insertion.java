package a2Sorting;

import java.util.Scanner;

public class Insertion {
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
        for (int num : insertionSort(array)) {
            System.out.print(num + " ");
        }
    }

    // Picks an element and place it in its correct position
    static int[] insertionSort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int j = i;
            while(j > 0 && array[j - 1] > array[j]){

                int temp = array[j - 1];
                array[j -1] = array[j];
                array[j] = temp;
                j--;
            }
        }
        return array;
    }
}
