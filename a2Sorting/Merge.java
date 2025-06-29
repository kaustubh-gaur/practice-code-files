package a2Sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class Merge {
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
        for (int num : mergeSort(array)) {
            System.out.print(num + " ");
        }
    }
    // Pushes the maximum to the last by adjacent swaps


    static int[] mergeSort(int[] array) {
        int low = 0;
        int high = array.length - 1;
        return mergeDriver(array, low, high);
    }

    static int[] mergeDriver(int[] array, int low, int high) {
        if (low >= high) return array;
        int mid = (low + high) / 2;
        mergeDriver(array, low, mid);
        mergeDriver(array, mid + 1, high);
        return merge(array, low, mid, high);
    }

    static int[] merge(int[] array, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (array[left] < array[right]) {
                temp.add(array[left]);
                left++;
            } else {
                temp.add(array[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(array[left]);
            left++;
        }
        while (right <= high){
            temp.add(array[right]);
            right++;
        }
        for(int i = low; i <= high; i++){
            array[i] = temp.get(i - low);
        }
        return array;
    }
}
