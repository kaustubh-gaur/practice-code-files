package a1Basics;

public class withoutMultithreading {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        long sum = 0;
        for(int i = 0; i < 1000000000; i++){
            sum = sum + i;
        }
        System.out.println("Sum is " + sum);


        long product = 1;
        for (int i = 1; i < 50; i++) {
            product = product * i;
        }
        System.out.println("Product is " + product);

        long finalTime = System.currentTimeMillis();
        long elapsedTime = finalTime - startTime;
        System.out.println("Time taken : " + elapsedTime +"ms");
    }
}
