// Functions in C++
// All functions are stored in the stack memory
// Functions/ Methods/ Procedures

/*
*            Function Design
*            ---------------
*    Return Type         Parameters
*        -                   -
*        -                   +
*        +                   -
*        +                   +
*    
*/

#include <iostream>
using namespace std;

// Function Prototypes

// Use void if no return value
void doSomething()
{
    cout << "hello, world!" << endl;
}

// No return type but with parameters
void printSomething(string str)
{
    cout << str << endl;
}

// With return type but no parameters
int addTwoNumbers()
{
    int n1 = 5;
    int n2 = 5;

    return n1 + n2;
}

// With return type and parameters
int addRandomNumber(int n1, int n2)
{
    /* Additional logic here */
    return n1 + n2;
}


// Main Function
int main()
{
    doSomething();

    printSomething("hello, world!");

    cout << addTwoNumbers() << endl;
    int sum = addTwoNumbers();
    cout << sum << endl;
    cout << addTwoNumbers() + addTwoNumbers() << endl;

    int result = addRandomNumber(2, 2);
    cout << result <<endl;
    cout << addRandomNumber(2, 2) << endl;
    cout << addRandomNumber(addTwoNumbers(), 2) << endl;

    cout << addRandomNumber(addTwoNumbers(), addRandomNumber(10, 10)) << endl;
    // addTwoNumberds() is equivalent to 5 + 5 = 10, 
    // addRandomNumber(10, 10) is 10 + 10 = 20
    // Now get the two sums and add them together
    // 10 + 20 = 30

    return 0;
}