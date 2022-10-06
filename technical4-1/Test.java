// Import Pairing class
import technical4_1.Pairing;

public class Test {
    public static void main(String[] args) {
        Pet p = new Pet("Tom", "Cat");
        Owner o = new Owner("John", "123 Main Street");
        Pairing<Pet, Owner> po1 = new Pairing<Pet, Owner>(p, o);
        po1.printPair();
        
        Pairing<Owner, Pet> po2 = new Pairing<Owner, Pet>(o, p);
        po2.printPair();
    }
}