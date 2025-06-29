package a2Sorting;

import java.util.Scanner;

public class Bubble {
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
        for (int num : bubbleSort(array)) {
            System.out.print(num + " ");
        }
    }
    // Pushes the maximum to the last by adjacent swaps

    static int[] bubbleSort(int[] array) {
        int length = array.length;
        for (int i = length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if(array[j] > array[j + 1]){
                    int temp = array[j + 1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

}

