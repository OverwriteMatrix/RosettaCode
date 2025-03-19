// Variable Scope
//
// Local variable = declared inside a function or block {}
// Global variable = declared outside of all functions (typically at top of program)

#include <iostream>
using namespace std;

void printNum();

int myNum = 3;

int main() {
    cout << myNum << "\n";  // Prints global variable myNum since local variable myNum in main function is declared after (prints 3)

    int myNum = 1;
    cout << myNum << "\n";  // Originally myNum is 3, but then it updates to 1 when the local variable is 
                            // declared changing the global varible (ONLY WITHIN THIS MAIN FUNCTION - IT DOESNT CHANGE IT OVERALL)

    printNum(); // Prints local variable myNum in function printNum (which is 2)

    // Scope Resolution Operator (::)
    cout << ::myNum << "\n";    // Prints the global version of myNum even though it is after the local "new" myNum variable decleration
}

void printNum() {
    int myNum = 2;
    cout << myNum << "\n";
}
