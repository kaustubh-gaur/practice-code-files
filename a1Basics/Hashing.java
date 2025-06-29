package a1Basics;

import java.util.HashMap;
import java.util.Scanner;

public class Hashing {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        hashInt();
//        hashAlphabets();
//        hashString();
//        hashingWithMaps();

    }

    static void hashString() {

        System.out.print("Enter a string  : ");
        String string = scanner.nextLine();

        int hashSize = 256;
        int[] hashArray = new int[hashSize];
        for (int i = 0; i < string.length(); i++) {
            hashArray[string.charAt(i)]++;
        }
        System.out.println("Want to see Hash Array (boolean choice) ? ");


        try {
            boolean choice = scanner.nextBoolean();
            if (choice) {
                System.out.println("This is the Hash Array : ");
                for (int k : hashArray) {
                    System.out.print(k + ", ");
                }
            }
        } catch (Exception e) {
            System.out.println("Choice was Invalid. ");
            System.out.println("Try Again Later");
            return;
        }

        System.out.print("\n Enter a character to check : ");
        String input = scanner.next();
        char ch = input.charAt(0);

        if (hashArray[ch] != 0) {
            System.out.printf("%c is present in the original string %d times.\n", ch, hashArray[ch]);
        } else {
            System.out.printf("%c is not present in the string.\n", ch);
        }
    }

    static void hashAlphabets() {
        System.out.print("Enter a string of lowercase alphabets only : ");
        String string = scanner.nextLine();

        int hashSize = 26;
        int[] hashArray = new int[hashSize];
        try {
            for (int i = 0; i < string.length(); i++) {
                hashArray[string.charAt(i) - 'a']++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please enter only lowercase alphabets.");
            return;
        }
        System.out.println("This is the Hash Array : ");
        for (int k : hashArray) {
            System.out.print(k + ", ");
        }
        System.out.print("\n Enter a character to check : ");
        String input = scanner.next();
        char ch = input.charAt(0);

        if (hashArray[ch - 'a'] != 0) {
            System.out.printf("%c is present in the original string %d times.\n", ch, hashArray[ch - 'a']);
        } else {
            System.out.printf("%c is not present in the string.\n", ch);
        }

    }

    static void hashInt() {
        System.out.println("Enter the size of Array : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int arrayMax = 0;
        System.out.print("Enter " + size + " elements : ");
        for (int i = 0; i < size; i++) {
            int element = scanner.nextInt();
            array[i] = element;
            if (element > arrayMax) {
                arrayMax = element;
            }
        }
        int[] hashArray = new int[arrayMax + 1];
        for (int j : array) {
            hashArray[j]++;
        }
        System.out.println("This is the Hash Array");
        for (int k : hashArray) {
            System.out.print(k + ", ");
        }

        System.out.println("\nEnter the element to be checked : ");
        int hashCheck = scanner.nextInt();
        if (hashCheck > arrayMax) {
            System.out.printf("%d occurs 0 times in the original array :)", hashCheck);
        } else {
            System.out.printf("%d occurs %d times in the original array :)", hashCheck, hashArray[hashCheck]);
        }

    }

    static void hashingWithMaps() {
        HashMap<Integer, Integer> myMap = new HashMap<>();

        System.out.print("Enter the size of your Array : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.printf("Enter %d elements : ", size);
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            myMap.put(array[i], myMap.getOrDefault(array[i], 0) + 1);
        }

        System.out.print("How many numbers to want to search : ");
        int count = scanner.nextInt();
        System.out.printf("Enter %d numbers : ", count);

        while (count > 0) {
            int query = scanner.nextInt();
            int frequency = myMap.getOrDefault(query, 0);
            if (frequency != 0) {
                System.out.printf("%d is present %d times in the array. ", query, frequency);
                System.out.println();
            } else {
                System.out.printf("%d is not present in the array. ", query);
                System.out.println();
            }
            count--;
        }
    }
}
