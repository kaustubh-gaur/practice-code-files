package a1Basics;

public class ProductOfNumbers extends Thread{
    @Override
    public void run() {
        long product = 1;
        for (int i = 1; i < 50; i++) {
            product = product * i;
        }
        System.out.println("Product is " + product);
    }
}
