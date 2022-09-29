/*
Create a C++ program that does the following:

1. Initialize an int array size of 10 with your own random values for each element.

2. Create a function called recurse() to get the sum of all elements of your array using recursion technique, once sum is displayed, display also the square value of each of the elements of your array in reverse order.

Example:

array = [1,2,3,4,5,6,7,8,9,10]

(Note: As long as you can display the sum and the series of square value, it doesnt matter who will be displayed first)

The sum is : 55

100

82

64

49

36

25

16

9

4

1
*/

#include <iostream> 
using namespace std; 

// Function Prototype
int recurse(int myArray[], int size)
{
    if (size == 1)
        return myArray[0];
    else
        return myArray[size - 1] + recurse(myArray, size - 1);
}


// Main
int main()
{
    int myArray[10] = {5, 3, 1, 7, 4, 2, 8, 9, 0, 6};
    int size = 10;

    int sum = recurse(myArray, size);
    cout << "Sum of Array elements is: " << sum << endl;

    for (int i = size - 1; i >= 0; i--)
    {
        cout << "Square of " << myArray[i] << " is " << myArray[i] * myArray[i] << endl;
    }
    return 0;
}