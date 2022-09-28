#include <iostream>
using namespace std;

void doSomething()
{
    /*
    // Declaring a static variable. 
    // Static variables are only created once and are not destroyed.
    
    static int x = 5;

    x++;

    cout << x << endl;
    */
    
    int x = 5;

    x++;

    cout << x << endl;
}


int main()
{
    doSomething();
    doSomething();
    return 0;
}