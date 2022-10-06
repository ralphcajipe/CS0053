/**
Create a class called Pet that has fields:

String type; //Dog, Cat, Snake, Lizard

String petName; //your Pet's Name

Override the toString() method such that if you use it solely in a System.out.println(p), it will
display "My pet is a [type] and its name is [petname]";
*/

package technical4_1;

public class Pet {
    public static void main(String[] args) {
        Pet p = new Pet();
        p.type = "Dog";
        p.petName = "Rambo";
        System.out.println(p);
    }
    String type; //Dog, Cat, Snake, Lizard
    String petName; //your Pet's Name

    @Override
    public String toString() {
        System.out.println("Pet problem:");
        return "My pet is a " + type + " and its name is " + petName;
    }
}