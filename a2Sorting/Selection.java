package a2Sorting;
import java.util.Scanner;

public class Selection {
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
        for(int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        //Sorted Array Traversal
        System.out.print("The sorted array is : ");
        for (int num : selectionSort(array)) {
            System.out.print(num + " ");
        }
    }
    // select minimum and swap it
    static int[] selectionSort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            int minimum = i;
            for (int j = i; j < length; j++) {
                if(array[j] < array[minimum]) {
                    minimum = j;
                }
            }
            int temp = array[minimum];
            array[minimum] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
