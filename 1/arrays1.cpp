/**
 * The for loop is used to iterate through the array and add the values of the array together.
 * 
 * @return The sum of the values in the array.
 */

#include <iostream>
using namespace std;

int foo[] = {16, 2 , 77, 40, 12071};
int n, result = 0;

int main()
{
    for (n = 0; n < 5; ++n)
    {
        result += foo[n];
    }
    cout << result << endl;
    return 0;
}