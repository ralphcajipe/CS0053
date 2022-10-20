// Import
import java.util.Random;
import java.util.concurrent.*;

public class TechnicalFormative51 {
    public static void main(String[] args) {
        int[][] num = new int[5000][10000];
        Random r = new Random();
        int sum  = 0;
        long start = System.currentTimeMillis();
        
        // Create and start a thread
        Thread t1 = new Thread(new Runnable() {
          public void run() {
            // task to run goes here
            for (int i = 0; i < num.length; i++) {
                for (int j = 0; j < num[i].length; j++) {
                    num[i][j] = r.nextInt(100);
                    sum += num[i][j];
                }
                System.out.println("Sum of the row " + i + " is: " + sum);
            }
          }
        });
        t1.start();
        
        // Stop the thread
        try {
          t1.join();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        
        long end = System.currentTimeMillis();
        long totaltime = end - start;
        
        System.out.println("Sum of all rows: " + sum);
        System.out.println("Total time: " + totaltime + "ms");
    }
}
