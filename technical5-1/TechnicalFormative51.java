package technicalformative51;

/**
 *
 * @author 201911234
 * Ralph Cajipe
 */

import java.util.Random;

public class TechnicalFormative51 {
    public static void main(String[] args) {
        // Declaring the array, declaring the random number generator, declaring the sum, and declaring
        // the start time.
        int[][] num = new int[5000][100000];
        Random r = new Random();
        int sum  = 0;
        long start = System.currentTimeMillis();

        // Looping through the array and adding the sum of each row.
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = r.nextInt(100);
                sum += num[i][j];
            }
            System.out.println("Sum of the row " + i + " is: " + sum);
        }
        // Calculating the total time it took to run the program.
        long end = System.currentTimeMillis();
        long totaltime = end - start;
        
        System.out.println("Sum of all rows: " + sum);
        System.out.println("Total time: " + totaltime + "ms");
    }
}
