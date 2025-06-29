package a1Basics;

import java.util.Scanner;

public class Recursion {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        String string = scanner.nextLine();

//        printRangeWithRecursiveBacktracking(num1, num2);
//        printReverseRangeWithRecursiveBacktracking(num1, num2);
//        System.out.println(sumOfNaturalNUmber(num1));

//        For array and its reversal using recursion
//        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
//        int[] reversed = reverseArray(array, 0, 15);
//        for (int j : reversed) {
//            System.out.print(j + ", ");
//        }
//
//        System.out.print(isPalindrome(string));
//        System.out.println(fibonacciAtIndex(num1));
//        for (int i = 0; i < num1; i++){
//            System.out.print(fibonacciAtIndex(i) + ", ");
//        }

        System.out.print(factorial(num1));

    }

    static void printRangeWithRecursiveBacktracking(int start, int end) {

        if (start > end) {
            return;
        }

        printRangeWithRecursiveBacktracking(start, end - 1);
        System.out.printf("%d ", end);
    }

    static void printReverseRangeWithRecursiveBacktracking(int start, int end) {
        if (end < start) {
            return;
        }
        printReverseRangeWithRecursiveBacktracking(start + 1, end);
        System.out.printf("%d ", start);
    }

    static int sumOfNaturalNUmber(int limit) {
        if (limit < 1) return 0;
        return limit + sumOfNaturalNUmber(limit - 1);
    }

    static int[] reverseArray(int[] array, int start, int end) {
        int j = end - start - 1;
        if (start >= j) {
            return array;
        }
        int temp = array[j];
        array[j] = array[start];
        array[start] = temp;
        reverseArray(array, start + 1, end);
        return array;
    }

    static boolean isPalindrome(String string) {
        return palindromeChecker(string, 0);
    }

    static boolean palindromeChecker(String string, int i) {
        if (i >= string.length() / 2) return true;
        if (string.charAt(i) != string.charAt(string.length() - i - 1)) return false;
        return palindromeChecker(string, i + 1);

    }

    static int fibonacciAtIndex(int num) {
        if (num < 2) return num;
        return fibonacciAtIndex(num - 1) + fibonacciAtIndex(num - 2);
    }

    static int factorial(int num) {
        if (num == 1 || num == 0) return 1;
        return num = num * factorial(num - 1);

    }
}

