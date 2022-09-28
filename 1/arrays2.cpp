// Arrays as Parameters

#include <iostream>
using namespace std;

/**
 * It takes an array and its length as arguments, and prints the array's elements to the screen
 * 
 * @param arg This is the name of the array.
 * @param length the length of the array
 */
void print_array(int arg[], int length)
{
    for (int n = 0; n < length; ++n)
    {
        cout << arg[n] << ' ';
    }
    cout << '\n';
}

/**
 * It takes an array and the size of the array as arguments, and prints the array
 * 
 * @return The address of the first element of the array.
 */
int main()
{
    int first_array[] = {5, 10, 15};
    int second_array[] = {2, 4, 6, 8, 10};
    print_array(first_array, 2);
    print_array(second_array, 3);
    return 0;
}