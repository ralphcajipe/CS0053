public class GenericClass<DATATYPE1,X> {

    private X i;
    
    public X getI() {
        return i;
    }

    public void setI(X i) {
        this.i = i;
    }

    void samplemethod(DATATYPE1 x) {
        System.out.println(x);
        try{
            int result = 5/0;
        }catch(ArithmeticException e){
            System.out.println("Division by zero");
        }catch(Exception e){
            System.out.println("Error");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds");
        }
    }
}