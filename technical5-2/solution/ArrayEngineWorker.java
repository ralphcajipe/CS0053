/**
 * It's a thread that will calculate the sum of a range of rows in an array
 */
public class ArrayEngineWorker extends Thread {
    private ArrayHolder array;
    private int start, end;

    public ArrayEngineWorker(ArrayHolder array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    public void run() {
        array.getSumPerRow(start, end);
    }
}