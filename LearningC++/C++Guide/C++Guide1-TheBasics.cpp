// C++Guide1 - The Basics.cpp : This file contains the 'main' function. Program execution begins and ends there.

// This is a comment

/*
    This is a multi-line comment
*/

#include <iostream>
#include <string>
#include <cmath>

using std::string;          //      Instead of using namespace std; list out all the                (Using these lines only requires you to type cout instead of std::cout)
using std::cout;            //      individual components you are going to be using 
using std::cin;             //      to speed up code and not have unneccesary items 
using std::endl;            //      from namespace std brought in      
using std::max;

int main() {
    cout << "Hello World!\n";                 // A basic way to print (called: "see-out") and a new line method - This new line method has better performance
    cout << "Hellow World, Again!" << endl;   // Another new line method - endl will flush the output buffer (worse performance than \n)
    int x;         // Variable decleration
    x = 5;         // Variable assignment
    int y = 10;    // Variable decleration must come before variable assignment (can declare and assign at the same time (see this line))

    // Primitive Data Types
    int age = 21;           // integer (int) (whole number NO DECIMALS or loss of data happens!)
    double price = 10.99;   // double (number including decimals)
    char grade = 'A';       // character (char) (single character No multiple characters or loss of data happens!)
    bool power = true;      // boolean (bool) (True/False)
    string name = "Paxton"; // string (std::string) (Objects that represents a sequence of text) (Provided from the standard namespace) (Strings can include numbers but they are treated as text and not numbers!)
    float price2 = 15.99;   // floats are the same as doubles but take up less space 4 bytes for (6-7 decimas) as opposed to 8 bytes (15 decimals) for doubles.

    const double PI = 3.14159;       // The const keyword specifies that a variable's value is constant which tells the compiler to prevent anything from modifying it (read-only) (Typically const variable names are all uppercase)

    // Namespace Example
    /*
    //Namespace = provides a solution for preventing name conflicts in large projects.
    //            Each entity needs a unique name. A namespace allows for identically
    //            named entities as long as the namespaces are different.

    #include <iostream>
    //using namespace std; //Makes it so you do not need to include the std:: prefix to things like std::string and std::cout (saves typing)
                       //There is a high likelyhood of a naming conflict since there are so many naming conventions in namespace std;
                       //Safer option shown in main

    namespace first {
        int x = 1;
    }
    namespace second {
        int x = 2;
    }

    int main() {

        int x = 0;                  //If not specified what namespace it goes with the local one
        std::cout << x << '\n';

        std::cout << first::x << '\n';

        std::cout << second::x << '\n';

        // Safer option than using namespace std; (See Top)
        using std::cout;
        using std::string;

        string hello = "hello";
        cout << hello << '\n';

        return 0;
    }
    */

    // Typedef Example
    /*
    // typedef = a reserved keyword used to create an additional name (alias)
    //          for another data type. New identtifier for an exsisting type
    //          helps with readability and reduces typos


    #include <iostream>
    #include <vector>

    //typedef std::vector<std::pair<std::string, int>> pairlist_t         //VERY COMPLEX DO NOT UNDERSTAND YET
    typedef std::string text_t;
    typedef int number_t;

    //using text_t = std::string;           THE USING KEYWORD IS MORE POPULAR AND DOES THE EXACT SAME THING THAT TYPEDEF DOES!!!!!!!!!!!!!!!!!!!!!
    //using number_t = int;


    int main() {

        //std::vector<std::pair<std::string, int>> pairlist;
        //pairlist_t pairlist;                                    //Use this instead of the line above

        text_t firstname = "Paxton"; //instead of std::string firstname;
        std::cout << firstname << '\n';

        number_t age = 19;
        std::cout << age << '\n';
    }
    */

    // String Literals and concatination
    cout << "hello\n";               //"hello" is a string literal because you literally declare the string like this
    string lname = "Clark";
    string names = lname + name;     // String concatenation is the process of joining two or more strings together to form one longer string.
    cout << names << ", Hello!\n";

    // User Input
    cout << "Type any number: ";
    double userNumber;
    cin >> userNumber;
    cout << "Your number is: " << userNumber << "\n";


    /* Simple Arithmetic Operations                                                                                                                     // ------------------------------- //
       ----------------------------                                                                                                                        | Arithmetic Precidence       |
       Arithmatic Operators = returns the result of a specific arithmetic operation (+, -, *, / , %, **)                                                   -------------------------------
       Arithmetic Assignment Operators = updates a variable's value using arithmetic operations (+=, -=, *=, /=, %=, **=)                                  | Parenthesis                 |
       Increment Operator: variable++; = increases the variable by one                                                                                     | Multiplication and Division |
       Decrement Operator: variable--; = reduces the variable by one                                                                                       | Addition and Subtraction    |
    */                                                                                                                                                  // -------------------------------- //
    int students = 0;        // Students = 0
    students++;              // Students = 1
    students *= 10;          // Students = 10
    students = students - 3; // Students = 7;
    cout << "Students: " << students << "\n";
    int remainder = students % 2; // Modulus (%) is remainder so 7 % 2 = 1  -> [2 goes into 7 three times (2*3 = 6) with one left over]  
    cout << "Remainder: " << remainder << "\n";


    // Type Conversion [The conversion of a value of one data type to another (Implicit = automatic) (Explicit = Precede value with new data type (int) x)]
    double a = (int)3.14;       //Explicit
    cout << a << '\n';
    int b = 1.2345;             //Implicit
    cout << b << '\n';
    cout << (char)105 << '\n';  //Explicit
    char z = 100;               //Implicit
    cout << z << '\n';          // (Prints using ASCII table values)

    //Example
    int correct = 8;
    int questions = 10;
    // double score = (correct / questions) * 100; //Integer division error (results in 0%)
    double score = (correct / (double)questions) * 100; //No error if explicitly converted
    cout << score << "%" << '\n';

    // Math Related Functions (#include <cmath>
    int e = 80;                                               // For a full list of math functions visit:
    int f = 90;                                               // https://cplusplus.com/reference/cmath/
    cout << "Max: " << max(e, f) << "\n";     // (std::max(a, b))
    int g = pow(2, 3);             // power(number, to the power of)
    cout << "pow(2, 3) = " << g << "\n";
}


