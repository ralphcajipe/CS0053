// Technical Formative 1-2
// Ralph Cajipe

#include <iostream>
using namespace std;

// Function Prototypes

/*
* Task 1. Create a function that returns the sum of two numbers 
* having the function prototype as int add(int num1, int num2);
*/
int add(int num1, int num2)
{
    return num1 + num2;
}

/*
* Task 3.  Create a function that returns the product of two numbers 
* having the function prototype as int multiply(int num1_multiply, int num2_multiply);
*/
int multiply(int num1_multiply, int num2_multiply)
{
    return num1_multiply * num2_multiply;
}

/*
* Task 6. Create a function called executeJob() function that accepts a pointer 
* to a function and returns the appropriate result based on the operation 
* (Add or Multiply) that you used. 
*/
int executeJob(int (*operation)(int, int), int num1, int num2)
{
    return (*operation)(num1, num2);
}

// End of Function Prototypes


// Main function
int main()
{
	// Task 2. Test your function in #1 on your main().
	cout << "+ Sum of Two Numbers";
	cout <<"\n---------------------------------";
	
    int num1, num2;
    cout << "\nPlease input two numbers: ";
    cin >> num1 >> num2;
    cout << "The sum is: " << add(num1, num2);
    
    cout << "\n"; 
    
    // Task 4. Test your function in #3 on your main().
	cout << "\nX Product of Two Numbers";
	cout <<"\n---------------------------------";
	
    int num1_multiply, num2_multiply;
    cout << "\nPlease input two numbers: ";
    cin >> num1_multiply >> num2_multiply;
    cout << "The product is: " << multiply(num1_multiply, num2_multiply);
    
    cout << "\n";
    
    /* Task 5. Create a pointer that points to your function add(), call it as pointeradd, 
	* and using pointeradd test it to add two numbers.
	*/
	cout << "\nPointer that points to add() function";
	cout <<"\n---------------------------------";
	
	int num1_for_pointer, num2_for_pointer;
    cout << "\nPlease input two numbers: ";
    cin >> num1_for_pointer >> num2_for_pointer;
    
	int(*pointeradd)(int, int) = add;
    cout << "The sum is: " << pointeradd(num1_for_pointer, num2_for_pointer);
    
    cout <<"\n";
    
    /*
    * Task 6. Create a function called executeJob() function that accepts a pointer 
    * to a function and returns the appropriate result based on the operation 
    * (Add or Multiply) that you used. 
    */
    cout << "\nexecuteJob() function";
	cout <<"\n---------------------------------";
	
    int num1_execute, num2_execute;
    cout << "\nPlease input two numbers: ";
    cin >> num1_execute >> num2_execute;
    
    // Task 7. Test executeJob() for both add and multiply.
    cout << "The sum is: " << executeJob(add, num1_execute, num2_execute) << endl;
    cout << "The product is: " << executeJob(multiply, num1_execute, num2_execute) << endl;
    
    return 0;
}