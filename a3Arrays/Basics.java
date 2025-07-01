package a3Arrays;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of your array : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.printf("Enter %d elements of the array : ", size);
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.printf("Largest element of the array : %d \n", largest(array));
        System.out.printf("Second largest element of the array : %d \n", secondLargest(array));
    }

    static int largest(int[] array){
        int largest = -1;
        for (int j : array) {
            if (j > largest) {
                largest = j;
            }
        }
        return largest;
    }
//This is a comment
    static int secondLargest(int[] array) {
        int largest = array[0];
        int secondLargest = -1;
        for(int i = 1; i < array.length; i++) {
            if(array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            }

        }
        return secondLargest;

    }
}
