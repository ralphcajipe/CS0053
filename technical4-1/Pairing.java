/**
New Java Program:

Create a generic class called Pairing that accepts two reference data type 
(in our case it will accept a Pet and an Owner type) create a method called printPair() that 
prints the string equivalent of the two objects per line. 

Provide two output, by instantiating two objects from the generic Pairing class one that 
displays the owner first before the pet details and the other one displaying the pet details 
first before the owner using only the printPair() method.
*/

package technical4_1;

import java.util.*;

class Pairing<T, U> {
    public static void main(String[] args) {
        Owner o = new Owner("Ralph", "lives at 123 Main Street");
        Pet p = new Pet("Rambo", "Dog and");
        Pairing<Owner, Pet> po1 = new Pairing<Owner, Pet>(o, p);
        po1.printPair();
        
        Pairing<Pet, Owner> po2 = new Pairing<Pet, Owner>(p, o);
        po2.printPair();
    }
    T first;
    U second;
    
    Pairing(T first, U second) {
        this.first = first;
        this.second = second;
    }
    
    void printPair() {
        System.out.println(first + " " + second);
    }
}

class Pet {
    String name;
    String type;
    
    Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }
    
    public String toString() {
        return name + " " + type;
    }
}

class Owner {
    String name;
    String address;
    
    Owner(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    public String toString() {
        return name + " " + address;
    }
}

