/**
Write an application that prompts the user to enter a number to use as an array size, 
and then attempt to declare an array using the entered size.

If the array is created successfully, display an appropriate message "Array Creation Successful".  
Java generates a NegativeArraySizeException if you attempt to create an array with a negative
size, and it creates a NumberFormatException / InputTypeMismatch if you attempt to create an 
array using a nonnumeric value for the size.

Use a catch block that executes if the array size is nonnumeric or negative, 
displaying a message that indicates the array was not created. 
*/
import java.util.Scanner;
public class TF42
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to use as an array size: ");
        String size = input.next();
        int[] array;
        try
        {
            array = new int[Integer.parseInt(size)];
            System.out.println("Array Creation Successful");
        }
        catch (NumberFormatException e)
        {
            System.out.println("Array Creation Failed, nonnumeric value");
        }
        catch (NegativeArraySizeException e)
        {
            System.out.println("Array Creation Failed, negative value");
        }
    }
}
