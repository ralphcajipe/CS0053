/**
 * The variable v1 is declared and initialized to 0. The pointer p1 is declared and initialized to the
 * address of v1. The value of v1 is changed to 42 by dereferencing p1 and assigning 42 to it
 */
#include <iostream>
using namespace std;

int main()
{
    int *p1, v1;
    v1 = 0;
    p1 = &v1;
    *p1 = 42;

    cout << v1 << endl;
    cout << *p1 << endl;
}