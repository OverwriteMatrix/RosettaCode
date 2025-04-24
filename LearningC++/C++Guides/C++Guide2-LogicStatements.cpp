// C++Guide2 - Logic Statements.cpp : This file contains the 'main' function. Program execution begins and ends there.

#include <iostream>
#include <string>

using std::cout;
using std::cin;
using std::string;

int main() {                                                                                                                            // ------------------------------------------------------ //
    // If, Else If, and Else Statements (Do something if a condition is true. If not, then do not do it)                                //                 Logical Operators                      //
    cout << "----------------- If, Else If, and Else Statements -----------------\n";                                                   // ------------------------------------------------------ //
        int xyz = 0;                                                                                                                    // && = check if two conditions are true ("and")          //
        int age = 0;                                                                                                                    // || = check if at least one condition is true ("or")    //
        cout << "Enter your age: ";                                                                                                     // !  = reverses the logical state of its operand ("not") //
        cin >> age;                                                                                                                     // ------------------------------------------------------ //                                                                                                               
        if (age >= 110) {
            cout << "You are too old to enter\n";
        }
        else if (age >= 18) {
            cout << "Welome in!\n";
        }
        else if (age < 0) {
            cout << "You haven't been born yet!\n";
        }
        else {
            cout << "Not the right age, sorry\n";
        }


    // Switches (The alternative to using many "else-if" statements. Compare one value against matching cases.)
    cout << "\n----------------- Switches -----------------\n";

    int month;
    cout << "Enter the month (1-12): \n";
    cin >> month;

    switch (month) {
    case 1:
        cout << "It is January\n";
        break;
    case 2:
        cout << "It is February\n";
        break;
    case 3:
        cout << "It is March\n";
        break;
    case 4:
        cout << "It is April\n";
        break;
    case 5:
        cout << "It is May\n";
        break;
    case 6:
        cout << "It is June\n";
        break;
    case 7:
        cout << "It is July\n";
        break;
    case 8:
        cout << "It is August\n";
        break;
    case 9:
        cout << "It is September\n";
        break;
    case 10:
        cout << "It is October\n";
        break;
    case 11:
        cout << "It is November\n";
        break;
    case 12:
        cout << "It is December\n";
        break;
    default:
        cout << "Please enter numbers only 1-12";
    }

    // Ternary Operator [(?:) = replacement to an if/else statement (condition ? expression1 : expression2;)]
    cout << "\n----------------- Ternary Operator -----------------\n";

    int grade = 75;
    grade >= 60 ? cout << "You Passed\n" : cout << "You Did Not Pass\n";

    int number = 9;
    number % 2 == 0 ? cout << "Even\n" : cout << "Odd\n";

    bool hungry = true;
    cout << (hungry ? "Hungry\n" : "Full\n");

    // While Loops and Do-While Loops
    cout << "\n----------------- While Loops and Do-While Loops -----------------\n";


    string name;
    while (name.empty()) {
        cout << "Enter your name: ";
        std::getline(cin, name);
    }
    cout << "Hello, " << name << "\n";

    // while (1 == 1) {
    //    cout << "HELP, I'm stuck in an infinite loop! ";
    // }

    // do-while loop = do some block of code first, THEN repeat again if true

    // int number;
    // while (number < 0) {
    //    cout << "Enter a positive number: ";          // Doesnt work because number has no value yet, see how a do-while would work better below
    //    cin >> number;                                // Could run the code outside the while loop once before, but that would duplicate two lines of code for no reason
    // }
    // cout << "The number is: " << number << "\n";

    int number2 = 0;
    do {
        cout << "Enter a positive integer: ";
        cin >> number;
    } while (number < 0);
    cout << "The number is: " << number << "\n";


    // For Loops
    cout << "\n----------------- For Loops -----------------\n";


        //for loop = a loop that will execute a block of code a specified amount of time

        for (int index = 10; index >= 1; index--) {
            cout << index << "\n";;
        }
        cout << "Happy New Year!\n";


    // Break and Continue Keywords
    cout << "\n----------------- Break and Continue Keywords -----------------\n";


        // break = break out of a loop
        // continue = skip current iteration

        for (int i = 1; i <= 20; i++) {
            if (i == 13) {
                break;
            }
            cout << i << " ";
        }

        cout << "\n";

        for (int i = 1; i <= 20; i++) {
            if (i == 13) {
            continue;
            }
            cout << i << " ";
        }

        cout << "\n";

    // Nested Loops


        //Nested loop = a loop inside another loop
        //
        //  loop(){
        //      loop(){
        //
        //      }
        //  }
        //

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                cout << j << " ";
            }
            cout << "\n";
        }


}

