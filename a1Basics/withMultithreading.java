package a1Basics;

public class withMultithreading {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        ProductOfNumbers productThread = new ProductOfNumbers();
        SumOfNumbers sumThread = new SumOfNumbers();
        Thread sumThread2 = new Thread(sumThread);

        sumThread2.start();
        productThread.start();

        try {
            sumThread2.join();
            productThread.join(); 
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long finalTime = System.currentTimeMillis();
        long elapsedTime = finalTime - startTime;

        System.out.println("Elapsed time is " + elapsedTime + "ms");


    }
}
