/*
Create a C++ program that does the following:

1. Initialize an int array size of 10 with your own random values for each element.

2. Create a function called recurse() to display all elements of your array using recursion technique.

3. Call the recurse() function.
*/

#include <iostream> 
using namespace std; 

// Function Prototypes
void recurse(int myArray[], int size, int i) 
{ 
   if (i < size) 
   { 
       cout << myArray[i] << " \n"; 
       recurse(myArray, size, i + 1); 
   } 
}

// Main
int main() 
{ 
    int myArray[10] = {5, 3, 1, 7, 4, 2, 8, 9, 0, 6};
    int size = 10; 
    recurse(myArray, size, 0); 
    return 0; 
}