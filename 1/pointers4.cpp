// When running in Dev C++, the C++ version must be set to C++ 17 or later

#include<iostream>
#include<memory>

using namespace std;
//Valgrind
int *samplemethod()
{
    int *pnum = new int[1000];
    pnum[0] = 100;
    pnum[1] = 200;
    
    delete pnum;
    
    return pnum;
    
    
}

int main()
{
    
    int *nump = samplemethod();
    cout << nump[0] << endl;
    cout << nump[1] << endl;
    
    {
        int x = 10;    
        cout << x << endl;

        {
        
        unique_ptr<int[]>unump(new int[100]);
        
        unump[0] = 100;
        unump[1] = 200;
        cout << unump[0] << endl;
        cout << unump[1] << endl;
        }
        
        shared_ptr<int[]>sharednum;
        {
            shared_ptr<int[]>ashared(new int[100]);
            ashared[0]=1000;
            ashared[1]=2000;
            sharednum = ashared;
        }
        cout <<sharednum[0] << endl;
        
    }
    
    return 0;
}