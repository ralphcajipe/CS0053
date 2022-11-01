/**
 * Technical 5-3: Using Java Collections Framework
 * @author 201911234
 * Ralph Cajipe
 */

import java.util.ArrayList;
import java.util.Iterator;

public class TFA53 {
    public static void main(String[] args) {

        // This is creating an ArrayList called friends and adding 3 elements to it.
        ArrayList<String> friends = new ArrayList<>();
        friends.add("David");
        friends.add("Doug");
        friends.add("Brian");

        // This is creating an ArrayList called enemies and adding 3 elements to it.
        ArrayList<String> enemies = new ArrayList<>();
        enemies.add("James");
        enemies.add("Mike");
        enemies.add("Patrick ");

        // Iterating through the friends ArrayList and printing each element.
        Iterator<String> itr = friends.iterator();
        System.out.println("😃 Friends:");
        while (itr.hasNext()) {
            System.out.println("\t" + itr.next());
        }
        System.out.println("-------------------");


        // This is a for loop that is iterating through the enemies ArrayList and printing each element.
        System.out.println("😠 Enemies:");
        for (String enemy : enemies) {
            System.out.println("\t" + enemy);
        }
        System.out.println("-------------------");

        // This is printing the 3rd friend in the friends ArrayList.
        System.out.println("👌 3rd friend: " + "\n\t" + friends.get(2));
        System.out.println("-------------------");

        // Removing the 3rd friend in the friends ArrayList.
        friends.remove(2);

        // Creating a new ArrayList called frenemies and adding all the elements from the friends and
        // enemies ArrayLists to it.
        ArrayList<String> frenemies = new ArrayList<>();
        frenemies.addAll(friends);
        frenemies.addAll(enemies);

        // This is a for loop that is iterating through the frenemies ArrayList and printing each element.
        System.out.println("😀😠 Frenemies:");
        for (String frenemy : frenemies) {
            System.out.println("\t" + frenemy);
        }
    }
}
