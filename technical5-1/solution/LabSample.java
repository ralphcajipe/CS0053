/**
 * It creates an instance of the ArrayHolder class, 
 * calls the getSumPerRow() method, and then displays
 * the results.
 */
public class LabSample {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        ArrayHolder array = new ArrayHolder();

        array.getSumPerRow();

        long end = System.currentTimeMillis();
        System.out.println("Total time: " + (end - start) + "ms");

        //array.displaySumPerRow();
    }
}