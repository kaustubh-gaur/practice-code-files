package a1Basics;

public class Patterns {
    public static void main(String[] args) {
        int n = 5;
//        squareFilled(n);
//        TriangleStar(n);
//        increasingNumberTriangle(n);
//        repeatedNumberTriangle(n);
//        inverseStarTriangle(n);
//        inverseNumberTriangle(n);
//        upwardStarPyramid(n);
//        downwardStarPyramid(n);
//        diamondStar(n);
//        alternateBinary(n);
//        numberValley(n);
//        consecutiveNumberTriangle(n);
//        matrixOfNumbers(n);
    }

    static void squareFilled(int n) {
        //Square Filled
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void TriangleStar(int n) {//Triangle of * type 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void increasingNumberTriangle(int n) {//Increasing Number Triangle

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void repeatedNumberTriangle(int n) { // Repeated Number Triangle

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void inverseStarTriangle(int n) { //Inverse * Triangle

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void inverseNumberTriangle(int n) {//Inverse NUmber Triangle

        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    static void upwardStarPyramid(int n) {
        //Pyramid * upward
        for (int i = 0; i < n; i++) {
            for (int space = 1; space <= (n - i - 1); space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= (2 * i + 1); star++) {
                System.out.print("*");

            }
            for (int space = 1; space <= (n - i - 1); space++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    static void downwardStarPyramid(int n) {

        //Downward Star Pyramid
        for (int i = 0; i < n; i++) {
            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }
            for (int star = (2 * (n - i) - 1); star > 0; star--) {
                System.out.print("*");
            }
            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void diamondStar(int n) {
        //Diamond Star or Combination of both pyramids
        upwardStarPyramid(n);
        downwardStarPyramid(n);

    }

    static void alternateBinary(int n) {
        //Triangle with alternating 1s and 0s
        int val = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) val = 1;
            else val = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(val);
                val = 1 - val;
            }
            System.out.println();
        }
    }

    static void numberValley(int n) {
        //Two numerical triangles joined together

        for (int i = 0; i < n; i++) {
            for (int val = 0; val <= i; val++) {
                System.out.print(val + 1);
            }
            for (int space = (2 * (n - i) - 2); space > 0; space--) {
                System.out.print(" ");
            }
            for (int val = i; val >= 0; val--) {
                System.out.print(val + 1);
            }
            System.out.println();
        }


    }

    static void consecutiveNumberTriangle(int n) {
        //Triangle with consecutive Integers
        int rowStart = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(rowStart + " ");
                rowStart++;
            }
            System.out.println();
        }
    }

    static void matrixOfNumbers(int n) {
        for (int i = 0; i < (2 * n - 1); i++) {
            for (int j = 0; j < (2 * n - 1); j++) {
                int top = i;
                int bottom = (2 * n - 2) - i;
                int left = j;
                int right = (2 * n - 2) - j;
                int value = n - Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print(value + "  ");
            }
            System.out.println();
        }
    }
}
