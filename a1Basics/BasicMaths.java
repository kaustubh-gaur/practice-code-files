package a1Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BasicMaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = scanner.nextInt();

//        System.out.println(countDigits(number));
//        System.out.println(reverseNumber(number));
//        System.out.println(palindromeNumberCheck(number));
//        System.out.println(isArmstrong(number));
//        System.out.println(allDivisors(number));
//        System.out.println(allDivisorsEfficiently(number));
//        System.out.println(primeCheck(number));
//        System.out.println(primeCheckEfficiently(number));
//        System.out.println(getGCD());
//        System.out.println(getGCDEfficiently());
//        System.out.println(getGCDWithEuclideanAlgorithm());
    }



    static int countDigits(int num) {
        int count = 0;
        while (num % 10 != 0) {  // or while (num > 0) -> same working with 1 less operation
            count++;
            num = num / 10;      // because here the number is reducing itself.
        }
        return count;
    }

    static int reverseNumber(int num) {
        int digit;
        int reverseDigit = 0;
        while (num != 0) {
            digit = num % 10;
            reverseDigit = reverseDigit * 10 + digit;
            num = num / 10;
        }
        return reverseDigit;
    }

    static boolean palindromeNumberCheck(int num) {
        return num == reverseNumber(num);
    }

    static boolean isArmstrong(int n) {
        int sum = 0;
        int num = n;
        int digits = 0;
        while (num > 0) {
            digits++;
            num = num / 10;
        }
        num = n;
        while (num > 0) {
            sum = sum + (int) Math.pow(num % 10, digits);
            num = num / 10;
        }
        return sum == n;
    }

    static List<Integer> allDivisors(int num) {
        List<Integer> listOfDivisors = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                listOfDivisors.add(i);
            }
        }
        return listOfDivisors;
    }

    static List<Integer> allDivisorsEfficiently(int num) {
        List<Integer> listOfDivisors = new ArrayList<>();

        for (int i = 1; i <= num / i; i++) {
            if (num % i == 0) {
                listOfDivisors.add(i);
                if (i != num / i) listOfDivisors.add(num / i);
            }
        }

        Collections.sort(listOfDivisors);
        return listOfDivisors;
    }

    static boolean primeCheck(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count == 2;
    }

    static boolean primeCheckEfficiently(int num) {
        int count = 0;
        for (int i = 1; i <= num / i; i++) {
            if (num % i == 0) {
                count++;
                if (num / i != i) {
                    count++;
                }
            }
        }
        return count == 2;
    }

    static int getGCD() {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int smaller = (int) Math.min(num1, num2);
        int gcd = 1;
        for (int i = 1; i <= smaller; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }


    static int getGCDEfficiently() {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int smaller = (int) Math.min(num1, num2);
        int gcd = 1;
        for (int i = smaller; i >= 1; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }

    static int getGCDWithEuclideanAlgorithm () {
        /*
        Euclidean algorithm states that if a > b then
        gcd(a, b) = gcd(a-b, a)
        So we can iterate on this until we get one of number to be zero,
        then the other number will be the gcd.

        But it can take very much time.
        so an optimised way to iterate rather on this:
        gcd(a, b) = gcd(a % b, b) until we get a zero. Other one will be the gcd.
        */
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        while(num1 > 0 && num2 > 0) {
            if(num1 > num2) num1 = num1 % num2;
            else num2 = num2 % num1;
        }
        if(num1 == 0) return num2;
        return num1;
    }

}