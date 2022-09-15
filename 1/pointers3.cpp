/**
 * The delete operator is used to deallocate memory that was previously allocated by the new operator.
 */

#include <iostream>

using namespace std;

int main()
{
    
    int *num = new int[5];
    num[0] = 1;
    num[1] = 2;
    num[2] = 3;
    num[3] = 4;
    num[4] = 5;
    
    for(int i=0; i < 5; i++)
    {
        cout << num[i] << " " ;
    }
    cout << endl;
    
    int *pnum;
    
    if(pnum == nullptr)
    {
        cout << "pnum does not contain any references....." << endl;
    }
    
    delete num; //memory leak

    if(num == nullptr)
    {
        cout << "num does not contain any references..." << endl;
    }
    cout << num << endl;
    for(int i=0; i < 5; i++)
    {
        cout << num[i] << " " ;
    }
    
    return 0;
}