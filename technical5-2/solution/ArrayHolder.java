/**
 * It creates a 2D array of 5000 rows and 100,000 columns, 
 * each cell containing a random number between 1 and 1000. 
 * It then calculates the sum of each row and displays the result.
 */
import java.util.Random;

public class ArrayHolder {

    private Random random;

    public int[][] num = new int[5000][100_000];
    private int[] sum = new int[5000];

    public ArrayHolder() {
        random = new Random();

        for (int i=0; i < 5000; i++) {
            for (int j=0; j < 100_000; j++) {
                num[i][j] = random.nextInt(1000 -1) + 1;
            }
        }
    }

    public void getSumPerRow(int start, int end) {
        for (int i=start; i < end; i++) {
            for (int j=0; j < 100_000; j++) {
                sum[i] += num[i][j];
            }
        }
    }

    public void displaySumPerRow() {
        for (int i=0; i < 5000; i++) {
            System.out.println("Sum of row " + i + " is " + sum[i]);
        }
    }
}