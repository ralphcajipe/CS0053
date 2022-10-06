#include <iostream>
using namespace std;

class GenericClass{

};

// Function Prototypes
void samplemethod(float f,int n=5)
{
    cout << n << endl;
    cout << f << endl;
}

// Main
int main()
{
    GenericClass c;

    samplemethod(3.14, 100);
    return -10;
}