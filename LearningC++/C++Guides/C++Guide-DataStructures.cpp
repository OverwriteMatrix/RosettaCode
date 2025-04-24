// C++Guide - Data Structures.cpp : This file contains the 'main' function. Program execution begins and ends there.

#include <iostream>
#include <string>
#include <vector>
#include <stack>
#include <queue>
#include <deque>
#include <set>
#include <map>

using std::cout;
using std::cin;
using std::string;
using std::vector;
using std::stack;
using std::queue;
using std::deque;
using std::set; using std::greater;
using std::map;

static void println() {
    cout << '\n';
}


int main() {
    // Arrays
        // 1-D Arrays
        cout << "---------- 1-D Arrays ----------\n";
        string cars[] = { "BMW", "Honda", "Ford", "Chevy" };
        cout << cars[0] << '\n';

        int numCars = sizeof(cars) / sizeof(cars[0]);
        for (int i = 0; i < numCars; i++) {
            cout << cars[i] << " ";
        }
        println();

        cars[3] = "Toyota"; // Changing an element at index 3 (remember index starts at zero!)

        for (string car : cars) {
            cout << car << " ";
        }
        println();


        // Multi-Dimensional Arrays
        cout << "\n---------- Multi-Dimensional Arrays ----------\n";
        bool ships1[4][4] = { { 0, 1, 1, 0 },
                              { 0, 0, 0, 0 },       // A 2-D array with length and width
                              { 0, 0, 1, 0 },
                              { 0, 0, 1, 0 } };
        int rows = 4;
        int cols = 4;

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                cout << ships1[i][j] << " ";
            }
            cout << std::endl; // move to the next line after each row
        }

        bool ships[3][4][4] = { // A 3-D array think of multiple 2-D arrays like "pages"
        {
            { 0, 1, 1, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 1, 0 },
            { 0, 0, 1, 0 }
        },
        {
            { 0, 1, 1, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 1, 0 },
            { 0, 0, 1, 0 }
        },
        {
            { 0, 1, 1, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 1, 0 },
            { 0, 0, 1, 0 }
        }
        };


    // Structures
    cout << "\n---------- Structures ----------\n";
        struct {
            string name = "null";
            int age = -1;
            string school = "null";
        } person1, person2;     // Declare instances of the struct here

        person1.name = "Paxton Clark";
        person1.age = 19;
        person1.school = "The University of Cincinnati";

        cout << person1.name << " is " << person1.age << " and goes to " << person1.school << '\n';

        person2.name = "John Doe";
        person2.age = 45;
        // This is empty vvv
        cout << person2.name << " is " << person2.age << " and goes to " << person2.school << '\n';


        // Named Structs
        struct myDataType { // This structure is named "myDataType"
            int myNum = -1;
            string myString = "null";
        };

        myDataType myVarName;   // This is an instance of the named structure

        myVarName.myNum = 14;
        myVarName.myString = "Hello There!";

        // Structs Within Structs
        struct moreinfo {
            int miles = -1;
            int seats = -1;
            int weight = -1; // In tons
        };

        struct myCars {
            string make = "null";
            string model = "null";
            int year = -1;
            moreinfo moreInfo;  // Calls an instance of the moreinfo struct
        };

        myCars car1;
        car1.make = "Jeep";
        car1.model = "Wrangler";
        car1.year = 2004;
        car1.moreInfo.miles = 150000;
        car1.moreInfo.seats = 4;
        car1.moreInfo.weight = 2;


    // Vectors
    cout << "\n---------- Vectors ----------\n";
        vector<int> numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        cout << "Numbers at 0: " << numbers.at(0) << '\n';

        numbers.push_back(6);
        cout << "Numbers at 5: " << numbers.at(5) << '\n';

        cout << "Numbers in numbers: ";
        for (int i = 0; i < numbers.size(); i++) {
            cout << numbers.at(i) << " ";
        }

        println();
        numbers.resize(30);
        cout << "Numbers in numbers: ";
        for (int i = 0; i < numbers.size(); i++) {
            cout << numbers.at(i) << " ";
        }
        println();

    // Stacks
    cout << "\n---------- Stacks ----------\n";

        stack<string> movies;
        movies.push("Iron Man");        // .push() adds an element to the top
        movies.push("Iron Man 2");
        movies.push("Iron Man 3");

        while (!movies.empty()) {
            cout << movies.top() << '\n';    // .top() returns the top-most element
            movies.pop();                    // .pop() removes the top-most element
        }

    // Queue
    cout << "\n---------- Queues ----------\n";

        queue<string> food;
        food.push("Apples");                 // .push() adds an element to the back
        food.push("Oranges");
        food.push("Bananans");

        cout << "Size of foods: " << food.size() << '\n';
        cout << "Foods is empty: " << food.empty() << " (0 means false, 1 means true)" << '\n';

        cout << "Front of foods: " << food.front() << '\n';
        cout << "Back of foods: " << food.back() << '\n';

        food.back() = "Grapes";

        while (!food.empty()) {
            cout << food.front() << " ";     // .front() returns the front-most element
            food.pop();                      // .pop() removes the front-most element
        }

        cout << "(<- Grapes was changed)" << '\n';

    // Deque
    cout << "\n---------- Deques ----------\n";

        deque<double> prices = { 19.99, 49.99, 1.98, 27.95 };
        cout << "Price.front(): " << prices.front() << '\n';
        cout << "Price.back(): " << prices.back() << '\n';
        cout << "Price.at(2): " << prices.at(2) << '\n';

        for (double price : prices) {
            cout << price << " ";
        }
        println();

        prices.push_front(2.99); cout << "**prices.push_front(2.99)**" << '\n';
        prices.push_back(100.00); cout << "**prices.push_back(100.00)**" << '\n';

        for (double price : prices) {
            cout << price << " ";
        }

        prices.pop_front();
        prices.pop_front(); cout << "\n**prices.pop_front()** x 2" << '\n';
        prices.pop_back();
        prices.pop_back(); cout << "**prices.pop_back()** x 2" << '\n';

        for (double price : prices) {
            cout << price << " ";
        }

        cout << "\nPrices.empty() (T/F): " << prices.empty() << '\n';
        cout << "Prices.size(): " << prices.size() << '\n';


    // Sets
    cout << "\n---------- Sets ----------\n";

        // Sort elements in a set in ascending order
        set<int> numberSet = { 1, 7, 3, 2, 5, 9 };

        numberSet.insert(10);
        numberSet.erase(7);
        //numberSet.clear();      // Clears all elements in a set

        cout << "Size of NumberSet: " << numberSet.size() << '\n';
        cout << "NumberSet is Empty: " << numberSet.empty() << '\n';

        for (int num : numberSet) {
            cout << num << "\n";
        }

        println();

        // Sort elements in a set in descending order
        set<int, greater<int>> numberSet2 = { 1, 7, 3, 2, 5, 9 };

        // Print the elements
        for (int num : numberSet2) {
            cout << num << "\n";
        }
        println();

    // Maps
    cout << "\n---------- Maps ----------\n";
        // Create a map that will store the name and age of different people
        map<string, int> people = { {"John", 32}, {"Adele", 45}, {"Bo", 29} };
        for (auto person : people) {
            cout << person.first << " is: " << person.second << "\n";
        } println();

        // If you want to reverse the order, you can use the greater<type> functor inside the angle brackets, like this:
        map<string, int, greater<string>> mapPPL = { {"John", 32}, {"Adele", 45}, {"Bo", 29} };
        for (auto person : mapPPL) {
            cout << person.first << " is: " << person.second << "\n";
        } println();

        // Get the value associated with the key "John"
        cout << "John is: " << people["John"] << "\n";

        // Change John's value to 50 instead of 32
        people["John"] = 50;                            // However, it is safer to use the .at() function: people.at("John") = 50;
                                        
        cout << "John is: " << people["John"];  // Now outputs John is: 50

        // Add new elements 
        people["Jenny"] = 22;       // But you can also use the .insert() function: people.insert({ "Jenny", 22 });
        people["Liam"] = 24;
        people["Kasper"] = 20;
        people["Anja"] = 30;

        // Trying to add two elements with equal keys
        people.insert({ "Jenny", 22 });     
        people.insert({ "Jenny", 30 });     // To sum up; values can be equal, but keys must be unique.

        // Remove an element by key
        people.erase("John");

        // Remove all elements
        //people.clear();

        cout << people.size();  // Outputs 3
        cout << people.empty(); // Outputs 1 (The map is empty)
        cout << people.count("John");  // Outputs 1 (John exists)

























    println();
}
// C++Guide - Data Structures.cpp : This file contains the 'main' function. Program execution begins and ends there.

#include <iostream>
#include <string>
#include <vector>
#include <stack>
#include <queue>
#include <deque>
#include <set>
#include <map>

using std::cout;
using std::cin;
using std::string;
using std::vector;
using std::stack;
using std::queue;
using std::deque;
using std::set; using std::greater;
using std::map;

static void println() {
    cout << '\n';
}


int main() {
    // Arrays
        // 1-D Arrays
        cout << "---------- 1-D Arrays ----------\n";
        string cars[] = { "BMW", "Honda", "Ford", "Chevy" };
        cout << cars[0] << '\n';

        int numCars = sizeof(cars) / sizeof(cars[0]);
        for (int i = 0; i < numCars; i++) {
            cout << cars[i] << " ";
        }
        println();

        cars[3] = "Toyota"; // Changing an element at index 3 (remember index starts at zero!)

        for (string car : cars) {
            cout << car << " ";
        }
        println();


        // Multi-Dimensional Arrays
        cout << "\n---------- Multi-Dimensional Arrays ----------\n";
        bool ships1[4][4] = { { 0, 1, 1, 0 },
                              { 0, 0, 0, 0 },       // A 2-D array with length and width
                              { 0, 0, 1, 0 },
                              { 0, 0, 1, 0 } };
        int rows = 4;
        int cols = 4;

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                cout << ships1[i][j] << " ";
            }
            cout << std::endl; // move to the next line after each row
        }

        bool ships[3][4][4] = { // A 3-D array think of multiple 2-D arrays like "pages"
        {
            { 0, 1, 1, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 1, 0 },
            { 0, 0, 1, 0 }
        },
        {
            { 0, 1, 1, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 1, 0 },
            { 0, 0, 1, 0 }
        },
        {
            { 0, 1, 1, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 1, 0 },
            { 0, 0, 1, 0 }
        }
        };


    // Structures
    cout << "\n---------- Structures ----------\n";
        struct {
            string name = "null";
            int age = -1;
            string school = "null";
        } person1, person2;     // Declare instances of the struct here

        person1.name = "Paxton Clark";
        person1.age = 19;
        person1.school = "The University of Cincinnati";

        cout << person1.name << " is " << person1.age << " and goes to " << person1.school << '\n';

        person2.name = "John Doe";
        person2.age = 45;
        // This is empty vvv
        cout << person2.name << " is " << person2.age << " and goes to " << person2.school << '\n';


        // Named Structs
        struct myDataType { // This structure is named "myDataType"
            int myNum = -1;
            string myString = "null";
        };

        myDataType myVarName;   // This is an instance of the named structure

        myVarName.myNum = 14;
        myVarName.myString = "Hello There!";

        // Structs Within Structs
        struct moreinfo {
            int miles = -1;
            int seats = -1;
            int weight = -1; // In tons
        };

        struct myCars {
            string make = "null";
            string model = "null";
            int year = -1;
            moreinfo moreInfo;  // Calls an instance of the moreinfo struct
        };

        myCars car1;
        car1.make = "Jeep";
        car1.model = "Wrangler";
        car1.year = 2004;
        car1.moreInfo.miles = 150000;
        car1.moreInfo.seats = 4;
        car1.moreInfo.weight = 2;


    // Vectors
    cout << "\n---------- Vectors ----------\n";
        vector<int> numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        cout << "Numbers at 0: " << numbers.at(0) << '\n';

        numbers.push_back(6);
        cout << "Numbers at 5: " << numbers.at(5) << '\n';

        cout << "Numbers in numbers: ";
        for (int i = 0; i < numbers.size(); i++) {
            cout << numbers.at(i) << " ";
        }

        println();
        numbers.resize(30);
        cout << "Numbers in numbers: ";
        for (int i = 0; i < numbers.size(); i++) {
            cout << numbers.at(i) << " ";
        }
        println();

    // Stacks
    cout << "\n---------- Stacks ----------\n";

        stack<string> movies;
        movies.push("Iron Man");        // .push() adds an element to the top
        movies.push("Iron Man 2");
        movies.push("Iron Man 3");

        while (!movies.empty()) {
            cout << movies.top() << '\n';    // .top() returns the top-most element
            movies.pop();                    // .pop() removes the top-most element
        }

    // Queue
    cout << "\n---------- Queues ----------\n";

        queue<string> food;
        food.push("Apples");                 // .push() adds an element to the back
        food.push("Oranges");
        food.push("Bananans");

        cout << "Size of foods: " << food.size() << '\n';
        cout << "Foods is empty: " << food.empty() << " (0 means false, 1 means true)" << '\n';

        cout << "Front of foods: " << food.front() << '\n';
        cout << "Back of foods: " << food.back() << '\n';

        food.back() = "Grapes";

        while (!food.empty()) {
            cout << food.front() << " ";     // .front() returns the front-most element
            food.pop();                      // .pop() removes the front-most element
        }

        cout << "(<- Grapes was changed)" << '\n';

    // Deque
    cout << "\n---------- Deques ----------\n";

        deque<double> prices = { 19.99, 49.99, 1.98, 27.95 };
        cout << "Price.front(): " << prices.front() << '\n';
        cout << "Price.back(): " << prices.back() << '\n';
        cout << "Price.at(2): " << prices.at(2) << '\n';

        for (double price : prices) {
            cout << price << " ";
        }
        println();

        prices.push_front(2.99); cout << "**prices.push_front(2.99)**" << '\n';
        prices.push_back(100.00); cout << "**prices.push_back(100.00)**" << '\n';

        for (double price : prices) {
            cout << price << " ";
        }

        prices.pop_front();
        prices.pop_front(); cout << "\n**prices.pop_front()** x 2" << '\n';
        prices.pop_back();
        prices.pop_back(); cout << "**prices.pop_back()** x 2" << '\n';

        for (double price : prices) {
            cout << price << " ";
        }

        cout << "\nPrices.empty() (T/F): " << prices.empty() << '\n';
        cout << "Prices.size(): " << prices.size() << '\n';


    // Sets
    cout << "\n---------- Sets ----------\n";

        // Sort elements in a set in ascending order
        set<int> numberSet = { 1, 7, 3, 2, 5, 9 };

        numberSet.insert(10);
        numberSet.erase(7);
        //numberSet.clear();      // Clears all elements in a set

        cout << "Size of NumberSet: " << numberSet.size() << '\n';
        cout << "NumberSet is Empty: " << numberSet.empty() << '\n';

        for (int num : numberSet) {
            cout << num << "\n";
        }

        println();

        // Sort elements in a set in descending order
        set<int, greater<int>> numberSet2 = { 1, 7, 3, 2, 5, 9 };

        // Print the elements
        for (int num : numberSet2) {
            cout << num << "\n";
        }
        println();

    // Maps
    cout << "\n---------- Maps ----------\n";
        // Create a map that will store the name and age of different people
        map<string, int> people = { {"John", 32}, {"Adele", 45}, {"Bo", 29} };
        for (auto person : people) {
            cout << person.first << " is: " << person.second << "\n";
        } println();

        // If you want to reverse the order, you can use the greater<type> functor inside the angle brackets, like this:
        map<string, int, greater<string>> mapPPL = { {"John", 32}, {"Adele", 45}, {"Bo", 29} };
        for (auto person : mapPPL) {
            cout << person.first << " is: " << person.second << "\n";
        } println();

        // Get the value associated with the key "John"
        cout << "John is: " << people["John"] << "\n";

        // Change John's value to 50 instead of 32
        people["John"] = 50;                            // However, it is safer to use the .at() function: people.at("John") = 50;
                                        
        cout << "John is: " << people["John"];  // Now outputs John is: 50

        // Add new elements 
        people["Jenny"] = 22;       // But you can also use the .insert() function: people.insert({ "Jenny", 22 });
        people["Liam"] = 24;
        people["Kasper"] = 20;
        people["Anja"] = 30;

        // Trying to add two elements with equal keys
        people.insert({ "Jenny", 22 });     
        people.insert({ "Jenny", 30 });     // To sum up; values can be equal, but keys must be unique.

        // Remove an element by key
        people.erase("John");

        // Remove all elements
        //people.clear();

        cout << people.size();  // Outputs 3
        cout << people.empty(); // Outputs 1 (The map is empty)
        cout << people.count("John");  // Outputs 1 (John exists)

























    println();
}
