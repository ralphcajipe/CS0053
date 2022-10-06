/*
First part of the problem: Create a generic class called Pairing that accepts two reference data type 
(in our case it will accept a Pet and an Owner type) create a method called printPair() that 
prints the string equivalent of the two objects per line. 

Second Part of the problem:
Provide two output, by instantiating two objects from the generic Pairing class one 
that displays the owner first before the pet details and the other one displaying 
the pet details first before the owner using only the printPair() method.
*/
package technical4_1;

import java.util.*;

class Pairing<T, U> {
    public static void main(String[] args) {
        Pet p = new Pet("Rambo", "Dog");
        Owner o = new Owner("Henrik", "123 Main Street");
        Pairing<Pet, Owner> po1 = new Pairing<Pet, Owner>(p, o);
        po1.printPair();
        
        Pairing<Owner, Pet> po2 = new Pairing<Owner, Pet>(o, p);
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

// Output:
// Rambo Dog Henrik 123 Main Street
// Henrik 123 Main Street Rambo Dog

