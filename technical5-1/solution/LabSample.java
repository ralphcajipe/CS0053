/**
 * It creates an instance of the ArrayHolder class, 
 * calls the getSumPerRow() method, and then displays
 * the results.
 */
public class LabSample {

    public static void main(String[] args) {

        ArrayHolder array = new ArrayHolder();

        long start = System.currentTimeMillis();
        array.getSumPerRow();

        long end = System.currentTimeMillis();
        System.out.println("Total time: " + (end - start) + "ms");

        //array.displaySumPerRow();
    }
}