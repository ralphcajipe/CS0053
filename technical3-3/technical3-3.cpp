/*
Create a C++ program that does the following:

1. Initialize an int array size of 10 with your own random values for each element.

2. Create a function called recurse() to get the sum of all elements of your array using recursion technique.

Submit an image of the screenshot of the output and the CPP file
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
    return 0;
}