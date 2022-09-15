// Technical Formative 1-1
// Ralph Cajipe

#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

// Function Prototypes
void copyarray(int *source, int *destination, int arraysize)
{
	for (int i = 0; i < arraysize; i++)
	{
		destination[i] = source[i];
	}
}

// Main function
int main()
{
	/*
	* 1. Create an array of 5 ints allocated in the stack and initialize it with 5 random values.	
	*/
	srand(time(0));

	int StackArray[5] = { rand() % 10, rand() % 10, rand() % 10, rand() % 10, rand() % 10 };
	
	/*
	* 2. Print all elements in the list using index based access
	*/
	cout << "\n****************";
	cout << "\nTasks 1-2. Stack Memory: Five ints with Random Values";
	for (int i = 0; i < 5; i++)
	{
		cout << "\n";
		cout << StackArray[i] << " ";
	}
	
	/*
	* 3. Print all the memory addresses where each element is located in the memory. 
	* (Answer using code comment your observation on the progression of each element's memory address with one another)
	*/
	cout << "\n****************";
	cout << "\nTask 3. Memory Addresses";
	for (int i = 0; i < 5; i++)
	{
		cout <<"\n";
		cout << &StackArray[i] << "\n ";
	}
	// My observation is that the memory address of each element increases by 4 each time.
	cout << "\nMy observation is that the memory address of each element increases by 4 each time.";
	
	/* 4. Assign the array on a pointer called "pointerarray" and 
	* display all elements of the pointerarray using pointer arithmetic.
	*/
	cout << "\n****************";
	cout << "\nTask 4. Pointer Arrays";
	
	int *pointerArray = StackArray;
	
	for (int i = 0; i < 5; i++)
	{
		cout << "\n";
		cout << *pointerArray << " ";
		pointerArray++;
	}
	
	/* 5. Create an array of 5 ints allocated in the heap. */
	cout << "\n****************";
	cout << "\nTask 5. Heap Memory: Five ints with Random Values";
	int *HeapArray = new int[5];

	for (int i = 0; i < 5; i++)
	{
		HeapArray[i] = rand() % 10;
	}

	for (int i = 0; i < 5; i++)
	{
		cout << "\n";
		cout << HeapArray[i] << " ";
	}
	
	/* 6. Create a function that copies an int array with a function prototype of...
	* void copyarray(int *source, int *destination, int arraysize)
	*/
	cout << "\n****************";
	cout << "\nTask 6. Copies an int array: copyarray() function";
	int source[3] = { 1, 2, 3 };
	int destination[3];
	
	// Function call
	copyarray(source, destination, 3);
	
	cout <<"\nSource:";
	for (int i = 0; i < 3; i++)
	{
		cout << "\n";
		cout << source[i] << " ";
	}
	
	// Just a new line space
	cout <<"\n";
	
	cout << "\nDestination:";
	for (int i = 0; i < 3; i++)
	{
		cout <<"\n";
		cout << destination[i] << " ";
	}
	
	/* 7. Copy the stack array that you created in #1 to the 
	* heap array you created in #5 using the function you created in #6
	*/
	cout << "\n****************";
	cout << "\nTask 7-8 Copy the stack array to the heap array using copyarray() function";
	int *newpointerArray = StackArray;
	cout << "\n";
	cout << "\nint *newpointerArray = StackArray;";
	
	// Our *HeapArray was already declared above so we are skipping this initialization:
	// int *heapArray = new int[5];

	copyarray(StackArray, HeapArray, 5);
	cout << "\ncopyarray(StackArray, HeapArray, 5);";
	
	/* 8. Display all elements of the heap array to show that the array was copied.*/
	cout << "\n****************";
	cout << "\nTask 8. Display all elements of the heap array to show that the array was copied.";
	for (int i = 0; i < 5; i++)
	{
		cout << "\n";
		cout << HeapArray[i] << " ";
	}
	
	// 9. Remove the heap array from the memory.
	cout << "\n****************";
	cout <<"\nTask 9. Remove the heap array from the memory.";
	cout << "\ndelete[] HeapArray;";
	delete[] HeapArray;
	
}