/**
Create a class called Owner that has fields:

String name;

Override the toString() method such that if you use it solely in a System.out.println(o), 
it will Display "I [name] own this pets...."
*/

package technical4_1;

public class Owner {
    public static void main(String[] args) {
        Owner o = new Owner();
        o.name = "Ralph Cajipe";
        System.out.println(o);
    }
    String name;

    @Override
    public String toString() {
        System.out.println("Owner problem:");
        return "I " + name + " own this pets....";
    }
}