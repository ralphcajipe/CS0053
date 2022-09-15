/**
 * The function takes a pointer to an integer as an argument, and then changes the value of the integer
 * that the pointer points to.
 * 
 * @param pnum This is a pointer to an integer.
 */

#include <iostream>

using namespace std;

void samplemethod(int *pnum)
{
    
    pnum[0] = 500;
    //array decays/downgraded into a normal pointer
    cout << "inside sample method the size of pnum is " << sizeof(pnum) << endl;
    
}

int main()
{
    
    int num[5] = {10,20,30,40,50};
    int *pnum = num;
    
    for(int i=0; i < 5; i++)
    {
        cout << num[i] << " " << *(num+i) << endl;
    }
    
    cout << "The value of num[0] " << num[0] << endl;
    cout << "Dereference num is " << *num << endl;
    cout << "The address of num[0] is " << &num[0] <<endl;
    cout << "The address of num is " << num << endl;
    cout << "The value of num[1] is " << num[1] <<endl;
    cout << "The value of num+1 is " << *(num+1) <<endl;
    
    cout << "---------------------------------------" << endl;
    cout << "The address of num and pnum " << num << " " << pnum <<endl;
    cout << "The value of *pnum " << *pnum << endl;
    cout << "The value of pnum[1] " << pnum[1] << endl;
    for(int i=0; i < 5; i++)
    {
        cout << pnum[i] << " " << *(pnum+i) << endl;
    }
    
    cout << "Changing the values of pnum........." << endl;
    pnum[0] = 100;
    pnum[1] = 200;
    pnum[2] = 300;
    cout << "---------------------------------------" << endl;
    for(int i=0; i < 5; i++)
    {
        cout << num[i] << " " << *(num+i) << endl;
    }
    cout << "---------------------------------------" << endl;
    cout << sizeof(num) << endl;
    cout << sizeof(num) / sizeof(int) << endl;
    cout << "---------------------------------------" << endl;
    samplemethod(num);
    for(int i=0; i < 5; i++)
    {
        cout << num[i] << " " << *(num+i) << endl;
    }
    
    return 0;
}