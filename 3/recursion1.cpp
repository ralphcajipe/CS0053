#include <iostream>
using namespace std;

void recurse(int n)
{
    // base case
    if (n ==0)
    {
        cout << "Royal..." << endl;
        return;
    }

        

    cout << "Coke..." << endl;
    recurse(n-1);
    cout << "Sprite..." << endl;
}

int main()
{
    recurse(3);
    return 0;
}