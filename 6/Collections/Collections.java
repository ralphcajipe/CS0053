import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Collections {
    public static void main(String[] args) {
        // Creating an ArrayList of Integers and adding two elements to it.
        System.out.println("Hello World!");
        ArrayList<Integer> alist = new ArrayList<>();
        alist.add(1);
        alist.add(2);

        // Creating a LinkedList of type Float and adding two elements to it.
        LinkedList<Float> alinkedlist = new LinkedList<>();
        alinkedlist.add(3.1416f);
        alinkedlist.add(1.234f);

        // Getting the first element of the ArrayList which is an Interger with value 1.
        System.out.println(alist.get(0));

        // Converting the ArrayList to an array and then printing the array.
        System.out.println(alist.toArray().length);
        Object[] i = alist.toArray();
        for (int ctr = 0; ctr < i.length; ctr++) {
            System.out.println(i[ctr]);
        }

        // Converting the LinkedList to an array and then printing the array.
        Object[] f = alinkedlist.toArray();
        for (int ctr = 0; ctr < f.length; ctr++) {
            System.out.println(f[ctr]);
        }

        // Iterating through the LinkedList and adding 1.0123f to each element.
        // LinkedList
        Iterator<Float> itr = alinkedlist.iterator();
        while (itr.hasNext()) {
            float sum = itr.next() + 1.0123f;
            System.out.println(sum);
        }

        // Creating a stack of strings and pushing two strings into it.
        System.out.println("-------------------");
        Stack<String> s = new Stack<>();
        s.push("Hello");
        s.push("World");

       // Printing the top element of the stack.
        System.out.println(s.peek());

        // Printing the content of the stack.
        System.out.println("-----Stack Content-----");
        for (String item : s) {
            System.out.println(item);
        }
    }
}
