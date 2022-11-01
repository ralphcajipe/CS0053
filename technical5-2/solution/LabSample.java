/**
 * It creates two threads, each of which will process half of the array
 */
public class LabSample {
    
    public static void main(String[] args) {

        ArrayHolder array = new ArrayHolder();

        long start = System.currentTimeMillis();
        ArrayEngineWorker engine1 = new ArrayEngineWorker(array, 0, 2499);
        ArrayEngineWorker engine2 = new ArrayEngineWorker(array, 2500, 4999);

        engine1.start();
        engine2.start();

        try {
            engine1.join();
            engine2.join();
        } catch (InterruptedException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        long end = System.currentTimeMillis();
        System.out.println("Total time: " + (end - start) + "ms");
        
        //array.displaySumPerRow();
    }
}