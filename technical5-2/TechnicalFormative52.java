// Concurrency support for Technical Formative 5-1

package com.cs0053.technicalformative52;

/**
 *
 * @author 201911234 
 * Ralph Cajipe
 * 
 * NOTE:
 * In this optimized code, I added concurrency support by creating a thread 
 * called SumThread that would split the job of getting the sum into multiple 
 * threads. 
 * 
 * I got the number of splits by using the 
 * Runtime.getRuntime().availableProcessors() method. 
 * This method returns the number of processors available to the JVM.
 * 
 * The number of splits would be the fastest. I also measured the time 
 * it took to finish getting the sum of all rows, not including the output, and 
 * made sure that all threads were using the join() method before measuring the 
 * end time.
 * 
 * OBSERVATION:
 * This speeds up the overall process because the threads are computed at 
 * different rows because they are working on different parts of the job at the 
 * same time. I tested the code on my own machine with a heap size of 7.9 GB or 
 * -Xms7900m. The total time for the version without concurrency support is 7505ms.
 * The total time for this version with concurrency support of threading is
 * 6825ms. That's some improvement.
 * The improvement is 7505ms - 6825ms = 680ms.
 * The improvement in percentage is 680ms / 7505ms * 100 so it's 9% optimized. 
 */

// Import libraries
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.Executors;

public class TechnicalFormative52 {
    
    // Main method
    public static void main(String[] args) {
    // Create a 2D array of 5000 rows and 100_000 columns. 
    // It is also creating a random number generator, an integer variable to hold
    // the sum of the rows, and a long variable to hold the start time of the program.
    int[][] num = new int[5000][100_000];
    Random r = new Random();
    int sum  = 0;
    long start = System.currentTimeMillis();

    // Create a for loop that will iterate through the rows of the 2D array.
    for (int i = 0; i < num.length; i++) {
        for (int j = 0; j < num[i].length; j++) {
            num[i][j] = r.nextInt(100);
        }
    }
    
    // Get the number of cores available on the computer and then dividing the 
    // number of rows by the number of cores.
    int numberOfCores = Runtime.getRuntime().availableProcessors();
    int chunkSize = num.length / numberOfCores;
		
    // Creating an array of SumThread objects.
    SumThread[] threads = new SumThread[numberOfCores];

    /**
    * This is creating a for loop that will iterate through the number of cores 
    * available on the computer. It will then create a start index and an 
    * end index for each thread. The start index will be the current iteration 
    * multiplied by the chunk size. The end index will be the start index plus
    * the chunk size. If the current iteration is equal to the number of 
    * cores minus 1, then the end index will be the length of the 2D array. 
    */
    for (int i = 0; i < numberOfCores; i++) {
        int startIndex = i * chunkSize;
        int endIndex = startIndex + chunkSize;
        
        if (i == numberOfCores - 1) {
            endIndex = num.length;
        }
        
	threads[i] = new SumThread(num, startIndex, endIndex);
    }
		
    // Iterate through the array of SumThread objects and start each thread.
    for (SumThread thread : threads) {
        thread.start();
    }
		
    // Wait for all of the threads to finish before continuing.
    for (SumThread thread : threads) {
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
		
    // Iterate through the array of SumThread objects and add the sum of each 
    // thread to the sum variable.
    for (SumThread thread : threads) {
        sum += thread.getSum();
    }

    // Get the current time in milliseconds and subtract the start time from it. 
    // This will give us the total time it took to run the program.
    long end = System.currentTimeMillis();
    long totaltime = end - start;
		
    System.out.println("Sum of all rows: " + sum);
    System.out.println("Total time: " + totaltime + "ms");
    }
	
    // SumThread
    // Create a class called SumThread that extends the Thread class.
    public static class SumThread extends Thread {
        // Creating private variables that will be used in the SumThread class.
        private int[][] num;
	private int startIndex;
	private int endIndex;
	private int sum;
		
	// This is a constructor for the SumThread class. 
        // It is taking in the 2D array, the start index, and
	// the end index.
	public SumThread(int[][] num, int startIndex, int endIndex) {
            this.num = num;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }
		
	/**
	* The function takes in a 2D array and two integers, and sums up the 
        * elements of the 2D array from the first integer to the second integer.
	*/
	public void run() {
            for (int i = startIndex; i < endIndex; i++) {
                for (int j = 0; j < num[i].length; j++) {
                    sum += num[i][j];
                }
                System.out.println("Sum of the row " + i + " is: " + sum);
            }
        }
		
	/**
	* This function returns the sum of the numbers in the array.
	* 
	* @return The sum of the numbers in the array.
	*/
        public int getSum() {
            return sum;
        }
    }
}