/**
 * The variable my_int is declared and initialized to 5. The variable my_pointer is declared as a
 * pointer to an int. The address of my_int is assigned to my_pointer. The address of my_int is printed
 * to the screen.
 */

#include <iostream>
using namespace std;

int main()
{
    int my_int = 5;
    int *my_pointer;
    my_pointer = &my_int;

    cout << "my_int: " << my_int << endl;
}