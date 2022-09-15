/**
 * The function samplemethod takes in a pointer to an integer and prints out the value of the integer.
 * 
 * @param x a variable
 */

#include <iostream>
#include <string>
using namespace std;

struct PERSON 
{
    string name;
};

struct MANAGER 
{
    PERSON *m;
};

struct PROFESSOR
{
    PERSON *pf;
};

void samplemethod(int *x)
{
    cout << "The value of x inside samplemethod is " << *x << endl;
    *x = 100;
}

void methodC(int a, int b)
{
    cout << a + b << endl;
}

void methodD(int a, int b)
{
    cout << a*b << endl;
}

void engine(void (*fun)(int,int))
{
    fun(12,5);
}


int main()
{
    int x = 7;
    int *px = &x;

    cout << "x is " << x << endl;
    cout << "*px is " << px << endl;
    cout << "x is located at " << &x << endl;
    cout << "*px is " << &px << endl;

    cout << "============================================" << endl;

    struct PERSON p;
    p.name = "Ralph Cajipe";

    struct MANAGER m;
    m.m = &p;

    struct PROFESSOR pf;
    pf.pf = &p;

    cout << "Manager name: " << m.m->name << endl;
    cout << "Professor name: " << pf.pf->name << endl;

    p.name = "Ralph Cajipe pt2";

    cout << "Manager name: " << m.m->name << endl;
    cout << "Professor name: " << pf.pf->name << endl;

    cout << "============================================" << endl;

    samplemethod(&x);
    cout << "The value of x is " << x << endl;

    cout << "============================================" << endl;

    engine(methodC);
    return 0;
}