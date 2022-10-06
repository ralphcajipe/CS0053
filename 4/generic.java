import java.util.*;
import java.io.*;
    
public class N32Module4 {
    public static void main(String[] args) {
        System.out.println("hello, world!");
        GenericClass<Integer,Float> g = new GenericClass();
        g.setI(3.14f);
        System.out.println(g.getI());
    }
}
