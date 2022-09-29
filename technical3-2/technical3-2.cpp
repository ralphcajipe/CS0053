/*
Create a C++ program that does the following:

1. Initialize an int array size of 10 with your own random values for each element.

2. Create a function called recurse() to display all elements of your array using recursion technique, 
however display in reverse order starting from the end of your array to the first element.

Submit an image of the screenshot of the output and the CPP file
*/

#include <iostream> 
using namespace std; 

// Function Prototypes

void recurse(int *myArray, int size)
{
    if (size == 1)
    {
        cout << myArray[0] << endl;
        return;
    }
    else
    {
        cout << myArray[size-1] << endl;
        recurse(myArray, size-1);
    }
}

// Main
int main() 
{ 
    int myArray[10] = {5, 3, 1, 7, 4, 2, 8, 9, 0, 6};
    int size = 10;

    recurse(myArray, 10);
    return 0;

}