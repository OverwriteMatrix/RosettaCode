#include <iostream>                                     
#include <string>
#include <cmath>

int main() {
    //My First C++ Program________________________________________________________________________________________________________________________________________________________________
    /*

    std::cout << "Hello World!\n";                      //A new line method - new line better performance
    std::cout << "Hellow World, Again!" << std::endl;   //Another new line method - endl will flush the output buffer
    // This is a comment

    */
    //Variable Decleration and Basic Data Types___________________________________________________________________________________________________________________________________________
    /*

    int x;  //Decleratoion
    x = 5;  //Assignment
    //Can combine variable decleration and assignment:
    //int x = 5;
    std::cout << x << '\n';     //Printing x

    int y = 6;
    std::cout << y << '\n';
    int sum = x + y;
    std::cout << sum << '\n';

    //integer (int) (whole number)
    int age = 21;       //Works great!
    int days = 7.7;     //LOSS OF DATA!
    std::cout << age << '\n';
    std::cout << days << '\n';

    //double (number including decimals)
    double price = 10.99;
    std::cout << price << '\n';

    //Character (char) (single character)
    char grade = 'A';               //Works great!
    char inital = 'BC';             //Loss of data only ONE character in char
    std::cout << grade << '\n';
    std::cout << inital << '\n';
    char currency = '$';
    std::cout << currency << '\n';

    //Boolean (bool) (True/False)
    bool power = true;
    bool student = false;

    //String (std::string) (Objects that represents a sequence of text) (Provided from the standard namespace)
    std::string name = "Paxton";
    std::string lname = "Clark";
    std::cout << name << " " << lname << '\n';
    std::cout << "hello\n";     //"hello" is a string literal because you literally declare the string like this

    //Can include numbers but they are treated as text and not numbers!!!!!!!!

    */
    //The Const Keyword___________________________________________________________________________________________________________________________________________________________________
    /*

    //The const keyword specifies that a variable's value is constant which tells the compiler to prevent anything from modifying it (read-only)
    const double PI = 3.14159;      //Typically const variable names are all uppercase
    //PI = 100;                     //Throws an error since PI is const
    double radius = 10;
    double circumpherence = 2 * PI * radius;
    std::cout << circumpherence << " cm\n";

    */
    //Namespaces__________________________________________________________________________________________________________________________________________________________________________
    /*    */

    //Majority of code in project: ConsoleApplication2_LearningCpp_namespace_PC
    using std::string;
    using std::cout;
    using std::cin;


    //Typedef_____________________________________________________________________________________________________________________________________________________________________________
    /*

    //Majority of code in project: ConsoleApplication3_LearningCpp_typedef_PC

    */
    //Arithmatic Operators and Arithmatic Shorthand_______________________________________________________________________________________________________________________________________
    /*

    //Arithmatic operators = returns the result of a specific arithmetic operation (+ - * /)

    int students = 20;
    //students = students + 1;
    students += 1;      //Does the same thing as line above
    //students++; //Increments students by one

    students -= 1;
    //studetns --; //Subtracts one from students

    //students = students * 2;
    students *= 2;  //Does the same thing as line above

    //students = students / 10;
    students /= 10; //Does the same thing as line above

    cout << "Students: " << students << "\n";

    int remainder = students % 2; //Modulus (%) is remainder
    cout << "Remainder: " << remainder;

    //Arithmetic Precidence
    //parenthesis
    //multiplication and division
    //addition and subtraction

    */
    //Type Conversion_____________________________________________________________________________________________________________________________________________________________________
    /*

    //type conversion = the conversion of a value of one data type to another
    //                  Implicit = automatic
    //                  Explicit = Precede value with new data type (int) x

    //Explicit
    double x = (int) 3.14;
    cout << x << '\n';

    //Implicit
    int y = 1.2345;
    cout << y << '\n';

    //Explicit
    cout << (char) 105 << '\n';

    //Implicit
    char z = 100;
    cout << z << '\n'; //Accidentally prints using ASCII table values

    //Example
    int correct = 8;
    int questions = 10;
    //double score = (correct / questions) * 100; //Integer division error
    double score = (correct / (double) questions) * 100; //No error if explicitly converted
    cout << score << "%" << '\n';

    */
    //User Input__________________________________________________________________________________________________________________________________________________________________________
    /*

    // cout << (insertion operator)
    // cin >> (extraction operator)

    string name;
    string fullname;
    int age;

    cout << "What's your name?\n";
    cin >> name;
    cout << "Hello, " << name << '\n';

    cout << "How old are you?\n";
    cin >> age;
    cout << name << " you are " << age << " years old.\n";

    cout << "What's your full name? " << "\n";
    //cin.ignore();                                   //A fix for getline() if using other "regular" cin(s) but in video used >> std::ws for fix
    std::getline(std::cin >> std::ws, fullname);               //getline() requires #include <string>
    cout << "Hello, " << fullname << '\n';

    */
    //Useful Math Related Functions and Hypotenuse Calculator Practice Problem____________________________________________________________________________________________________________
    /*

    double x = 3.14;
    double y = 4;
    double z;

    //z = std::max(x, y);           //maximum
    //z = std::min(x, y);           //minimum
    //Requires #include <cmath>
    //z = pow(2, 3);                  //power(number, to the power of)
    //z = sqrt(9);                  //square root
    //z = abs(-5);                  //absolute value
    //z = round(x);                 //rounds normally
    //z = ceil(x);                  //rounds up
    //z = floor(x);                 //rounds down

    //cout << z << '\n';

    //C++ <cmath> library reference https://www.w3schools.com/cpp/cpp_ref_math.asp

    //Hypotenuse Calculator Practice Problem

    double a;
    double b;
    double c;

    cout << "Enter side a: \n";
    cin >> a;
    cout << "Enter side b: \n";
    cin >> b;

    a = pow(a, 2);
    b = pow(b, 2);
    c = sqrt(a + b);

    cout << "Side c is: " << c << '\n';

    */
    //If, Else If, and Else Statements____________________________________________________________________________________________________________________________________________________
    /*

    //if statements = do something if a condition is true. If not, then do not do it
    int xyz;
    int age;
    cout << "Enter your age: \n";
    cin >> age;

    if (age >= 110) {
        cout << "You are too old to enter";
    }
    else if (age >= 18) {
        cout << "Welome in!";
    }
    else if (age < 0) {
        cout << "You haven't been born yet!";
    }
    else {
        cout << "Not the right age, sorry";
    }

    */
    //Switches and The Console Calculator Program_________________________________________________________________________________________________________________________________________
    /*

    //switch = alternative to using many "else-if" statements. Compare one value against matching cases.
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

    //Console Calculator Program
    char op;
    double num1;
    double num2;
    double result;
    cout << "***************SIMPLE CALCULATOR***************\n";

    cout << "Enter either (+ - * /): ";
    cin >> op;

        switch (op) {
        default:
            cout << "THAT WASNT A VALID RESPONSE!";
            break;

        case '+':
            cout << "Enter Number 1: ";
            cin >> num1;

            cout << "Enter Number 2: ";
            cin >> num2;
            result = num1 + num2;
            cout << "Result: " << result;
            break;

        case '-':
            cout << "Enter Number 1: ";
            cin >> num1;

            cout << "Enter Number 2: ";
            cin >> num2;
            result = num1 - num2;
            cout << "Result: " << result;
            break;

        case '*':
            cout << "Enter Number 1: ";
            cin >> num1;

            cout << "Enter Number 2: ";
            cin >> num2;
            result = num1 * num2;
            cout << "Result: " << result;
            break;

        case '/':
            cout << "Enter Number 1: ";
            cin >> num1;

            cout << "Enter Number 2: ";
            cin >> num2;
            result = num1 / num2;
            cout << "Result: " << result;
            break;
        }
    cout << "\n****************************************\n";

    */
    //Ternary Operator____________________________________________________________________________________________________________________________________________________________________
    /*

    //ternary operator (?:) = replacement to an if/else statement
    //                        condition ? expression1 : expression2;
    int grade = 75;


    //if (grade >= 60) {
    //   cout << "You Passed";
    //}
    //else {
    //    cout << "You Did Not Pass";
    //}


    grade >= 60 ? cout << "You Passed\n" : cout << "You Did Not Pass\n";    //Dpes the same as the above if statement

    int number = 9;
    number % 2 == 0 ? cout << "Even\n" : cout << "Odd\n";

    bool hungry = true;
    hungry ? cout << "Hungry\n" : cout << "Full\n";
    //cout << (hungry ? "Hungry\n" : "Full\n");           //OR THE ABOVE LIKE THIS

    */
    //Logical Operators and Temperature Conversion Program________________________________________________________________________________________________________________________________
    /*

    //&& = check if two conditions are true ("and")
    //|| = check if at least one condition is true ("or")
    //!  = reverses the logical state of its operand ("not")

    cout << "**********Temperature Program**********\n";
    double temp;
    char unit;
    cout << "F = Fahrenheit\n";
    cout << "C = Celsius\n";
    cout << "What unit would you like to convert to: ";
    cin >> unit;
    if (unit == 'F' || unit == 'f') {
        cout << "Enter the temperature in Celsius: \n";
        cin >> temp;
        temp = 1.8 * temp + 32;
        cout << "The temperature is: " << temp << "°F\n";
    }
    else if (unit == 'C' || unit == 'c') {
        cout << "Enter the temperature in Fahrenheit: \n";
        cin >> temp;
        temp = (temp - 32) / 1.8;
        cout << "The temperature is: " << temp << "C\n";
    }
    else {
        cout << "Please enter in only C or F\n";
    }
    cout << "**************************************";

    */
    //Useful String Methods_______________________________________________________________________________________________________________________________________________________________
    /*

    //Length Method
    string name;
    cout << "Enter your name: ";
    std::getline(cin, name);

    if (name.length() > 12) {
        cout << "Your name cannot be over 12 characters";
    }
    else {
        cout << "Welcome " << name << "\n";
    }

    //Empty Method
    cout << name.empty() << "\n";   //Returns a boolean value (0 = False, 1 = True)

    //Clear Method
    name.clear();
    cout << "New name: " << name << "               <- \n";   //Clears a string

    //Append Method
    name.append("PaxtonClark1234");
    cout << name << "\n";

    //.at Method (Character Position)
    cout << name.at(0) << "\n";
    cout << name.at(1) << "\n";
    cout << name.at(2) << "\n";
    cout << name.at(3) << "\n";
    cout << name.at(4) << "\n";
    cout << name.at(5) << "\n";

    //Insert Method
    string str = "Cincinnati";
    char ch = 'X';
    int position = 0; // Position at which to insert the character
    str.insert(position, 1, ch);  // Insert the character at the specified position
    std::cout << "Updated string: " << str << std::endl;

    //Find Method
    string findIt = "Sierra Clark";
    cout << findIt.find(' ') << "\n"; //Looks for a space in the string and displays the position if one is found

    //Erase Method
    findIt.erase(0, 3); //Erases characters 0, 1, and 2
    cout << findIt;

    //More String Methods: https://cplusplus.com/reference/string/string/#google_vignette

    */
    //While Loops and Do-While Loops______________________________________________________________________________________________________________________________________________________
    /*

    string name;
    while (name.empty()) {
        cout << "Enter your name: ";
        std::getline(cin, name);
    }
    cout << "Hello, " << name << "\n";

    //while (1 == 1) {
    //    cout << "HELP, I'm stuck in an infinite loop! ";
    //}

    //do-while loop = do some block of code first, THEN repeat again if true

    //int number;
    //while (number < 0) {
    //    cout << "Enter a positive number: ";          //Doesnt work because number has no value yet, see how a do-while would work better below
    //    cin >> number;                                //Could run the code outside the while loop once before, but that would duplicate two lines of code for no reason
    //}
    //cout << "The number is: " << number << "\n";

    int number;
    do {
        cout << "Enter a positive integer: ";
        cin >> number;
    } while (number < 0);
    cout << "The number is: " << number << "\n";

    */
    //For Loops___________________________________________________________________________________________________________________________________________________________________________
    /*

    //for loop = a loop that will execute a block of code a specified amount of time

    for (int index = 10; index >= 1; index--){
        cout << index << "\n";;
    }
    cout << "Happy New Year!\n";

    */
    //Break and Continue Keywords_________________________________________________________________________________________________________________________________________________________
    /*

    //break = break out of a loop
    //continue = skip current iteration

    for (int i = 1; i <= 20; i++) {
        if (i == 13) {
            break;
        }
        cout << i << "\n";
    }

    cout << "_________________\n";

    for (int i = 1; i <= 20; i++) {
        if (i == 13) {
            continue;
        }
        cout << i << "\n";
    }

    */
    //Nested Loops________________________________________________________________________________________________________________________________________________________________________
    /*

    //Nested loop = a loop inside another loop
    //
    //  loop(){
    //      loop(){
    //
    //      }
    //  }
    //

    for (int i = 1; i <= 10; i++){

        for (int j = 1; j <= 10; j++) {
            cout << j << " ";
        }
        cout << "\n";
    }

    //Symbol Rectangle Generator
    int rows;
    int columns;
    char symbol;

    cout << "How many rows? ";
    cin >> rows;
    cout << "How many columns? ";
    cin >> columns;
    cout << "Enter a symbol to use: ";
    cin >> symbol;

    for (int i = 1; i <= rows; i++) {

        for (int j = 1; j <= columns; j++) {
            cout << symbol << " ";
        }
        cout << "\n";
    }

    */
    //Random Number Generator and Random Event Generator__________________________________________________________________________________________________________________________________
    /*

    //Random Number Generator

    //pseudo-random = NOT truly random (but close)
    //May sometimes need to #include <ctime> (for time function)

    srand(time(NULL));

    int num1 = (rand() % 6) + 1;     //Gives a random number between 1 and 6
    int num2 = (rand() % 6) + 1;
    int num3 = (rand() % 6) + 1;

    cout << "Di 1: " << num1 << "\n";
    cout << "Di 2: " << num2 << "\n";
    cout << "Di 3: " << num3 << "\n";

    //Random Event Generator

    srand(time(0));
    int randNum = (rand() % 5) + 1;
    switch (randNum) {
        case 1: cout << "You win a bumper sticker!\n";
            break;
        case 2: cout << "You win a T-shirt!\n";
            break;
        case 3: cout << "You win a Free Lunch!\n";
            break;
        case 4: cout << "You win Concert Tickets!\n";
            break;
        case 5: cout << "You win a Gift Card!\n";
            break;
    }

    */
    //Number Guessing Game________________________________________________________________________________________________________________________________________________________________
    /*

    //May sometimes need to #include <ctime> (for time function)

    int num;
    int guess;
    int tries = 0;

    srand(time(NULL));
    num = (rand() % 100) + 1;

    cout << "**********Number Guessing Game**********\n";
    do {
        cout << "Enter a guess between 1 and 100: ";
        cin >> guess;
        tries++;

        if (guess > num) {
            cout << "Too High\n";
        }
        else if (guess < num) {
            cout << "Too Low\n";
        }
        else if (guess = num) {
            cout << "You WIN!!!!\n";
            cout << "Number of tries: " << tries << "\n";
            break;
        }
        else {
            cout << "I don't know that guess\n";
        }
    }while (guess != num);
    cout << "**************************************\n";

    */
    //Functions___________________________________________________________________________________________________________________________________________________________________________
    /*

    //Majority of code in project: ConsoleApplication4_LearningCpp_PC.cpp
    //function = a block of resuable code

    //Overloaded Functions: ConsoleApplication6_LearningCpp_overloadedfunctions_PC.cpp
    //Banking Program: ConsoleApplication8_LearningCpp_bankingprogram_PC.cpp
    //Rock-Paper-Scissors: ConsoleApplication9_LearningCpp_rockpaperscissors_PC.cpp

    */
    //Return Keyword______________________________________________________________________________________________________________________________________________________________________
    /*

    //Majority of code is in ConsoleApplication5_LearningCpp_return_PC.cpp
    //return = return a value back to the spot where you called the encompassing function

    */
    //Variable Scope______________________________________________________________________________________________________________________________________________________________________
    /*
    //Code in ConsoleApplication7_LearningCpp_variablescope_PC.cpp
    */
    //Arrays______________________________________________________________________________________________________________________________________________________________________________
    /*

    //array = a data structure that can hold multiple values. Values are accessed by an index number "kind of like a variable that holds multiple values"

    string car = "Corvette";
    cout << car << "\n";
    string carsArray[] = { "Corvette", "Mustang", "Camry" };
    cout << carsArray << "\n";   //This output the memory address for the array (this does not work to print the array)

    cout << carsArray[0] << "\n"; //You must print the index numbers to acess certain parts of the array (STARTS FROM ZERO)
    cout << carsArray[1] << "\n";
    cout << carsArray[2] << "\n";

    //Arrays have to be all of the same data type (int, string, double, etc.)

    carsArray[0] = "Camry";     //You can change the items in the array individually
    carsArray[1] = "Corvette";
    carsArray[2] = "Mustang";
    cout << carsArray[0] << "\n";
    cout << carsArray[1] << "\n";
    cout << carsArray[2] << "\n";

    string students[4];    //This is setting the size of the student array as four

    double prices[] = { 5.00, 7.50, 9.99, 15.00 };
    cout << prices[0] << "\n";
    cout << prices[1] << "\n";
    cout << prices[2] << "\n";
    cout << prices[3] << "\n";

    */
    //Sizeof() Operator___________________________________________________________________________________________________________________________________________________________________
    /*

    //sizeof() = determines the size in BYTES of a variable, data type, class, objects, etc.

    double gpa = 2.5;
    string name = "Paxton";
    char grade = 'A';
    bool student = true;
    char grades[] = { 'A','B','C','D','F' };
    string students[] = { "Spongebob", "Patrick", "Squidward" };

    cout << sizeof(gpa) << "\n";
    cout << sizeof(name) << "\n";
    cout << sizeof(grade) << "\n";
    cout << sizeof(student) << "\n";
    cout << sizeof(grades) << "\n";

    cout << sizeof(grades) / sizeof(char) << " elements\n";
    cout << sizeof(students) / sizeof(string) << " elements\n";

    */
    //Iterate Over an Array_______________________________________________________________________________________________________________________________________________________________
    /*

    string students[] = { "SpongeBob","Patrick","Squidward" };

    //Manual way to print all
    //cout << students[0] << "\n";
    //cout << students[1] << "\n";
    //cout << students[2] << "\n";

    //Better more efficient way (USe a for loop) (Does not allow for adjustments of array)
    //for (int i = 0; i < 3; i++) {
    //    cout << students[i] << "\n";
    //}

    //Allows for any additions/adjustments of the array
    for (int i = 0; i < sizeof(students)/sizeof(string); i++) {
        cout << students[i] << "\n";
    }

    //Another example
    char grades[] = { 'A','B','C','D','F' };
    for (int i = 0; i < sizeof(grades) / sizeof(char); i++) {
        cout << grades[i] << "\n";
    }

    */
    //For-Each Loop_______________________________________________________________________________________________________________________________________________________________________
    /*

    //foreach loop = loop that eases the traversal over an iterable data set

    string students[] = { "SpongeBob","Patrick","Squidward", "Sandy", "Fish1", "Fish2" };
    for (string student : students) { //For every student in students display student
        cout << student << "\n";
    }

    int grades[] = { 65,72,81,93 };
    for (int grade : grades) {  //For every grade in grades display grade
        cout << grade << "\n";
    }

    */
    //Pass an Array to a Function________________________________________________________________________________________________________________________________________________________
    /*

    //Code is in ConsoleApplication10_LearningCpp_passarraytofunction_PC.cpp

    */
    //Search an Array for an Element_____________________________________________________________________________________________________________________________________________________
    /*

    //Code is in ConsoleApplication11_LearningCpp_searcharrayforelement_PC.cpp

    */
    //Sort an Array (Bubble Sort)________________________________________________________________________________________________________________________________________________________
    /*

    //Code is in ConsoleApplication12_LearningCpp_bubblesortarray_PC.cpp

    */
    //Fill() Function____________________________________________________________________________________________________________________________________________________________________
    /*

    // fill() = Fills a ranfe of elements with a specified value
    //
    //          fill(begin, end, value);

    //This works to manually type out but not practical to type out if you had say 100 elements
    //string foods[] = { "Pizza1", "Pizza2", "Pizza3" , "Pizza4" , "Pizza5" , "Pizza6" , "Pizza7", "Pizza8", "Pizza9", "Pizza10" };
    //for (string food : foods) {
    //    cout << food << '\n';
    //}

    const int size = 100;
    const string text = "Pizza";

    string foods[size];
    fill(foods, foods + size, text);
    for (string food : foods) {
        cout << food << '\n';
    }

    */
    //Fill an Array with User Input
    /*

    string foods[5];
    int size = sizeof(foods) / sizeof(foods[0]);
    string temp;

    for (int i = 0; i < size; i++) {
        cout << "Enter a food you like or 'q' to quit #" << i + 1 << ": ";
        getline(cin, temp);
        if (temp == "q") {
            break;
        }
        else {
            foods[i] = temp;
        }
    }
    cout << "You like the following food: \n";
    for (int i = 0; !foods[i].empty(); i++) {
        cout << foods[i] << '\n';
    }

    */
    //Multi-Dimensional Arrays___________________________________________________________________________________________________________________________________________________________
    /*

    // type name[rows][columns] = {Manual Decleration};

    string cars[][3] = {{"Mustand", "Escape", "F-150"},
                        {"Corvette", "Equinox", "Silverado"},
                        {"Challenger", "Durango", "Ram 1500" }
                       };

    cout << cars[0][0] << ", ";
    cout << cars[0][1] << ", ";
    cout << cars[0][2] << ", ";
    cout << "\n";
    cout << cars[1][0] << ", ";
    cout << cars[1][1] << ", ";
    cout << cars[1][2] << ", ";
    cout << "\n";
    cout << cars[2][0] << ", ";
    cout << cars[2][1] << ", ";
    cout << cars[2][2];
    cout << "\n\n";

    int rows = sizeof(cars) / sizeof(cars[0]);
    int columns = sizeof(cars[0]) / sizeof(cars[0][0]);

    for (int i = 0; i < rows; i++) {
        //cout << cars[i] << '\n'; //Gives memory address
        for (int j = 0; j < columns; j++) {
            cout << cars[i][j] << " ";
        }
        cout << '\n';
    }

    */
    //Quiz Game
    /*

    string questions[] = { "1. What year was C++ created?: ", "2. Who invented C++?: ", "3. What is the predecessor of C++?: ", "4. Is the Earth flat?: " };
    string options[][4] = { { "A. 1969", "B. 1975", "C. 1985", "D. 1989" },
                            { "A. Guido van Rossum", "B. Bjarne Stroustrup", "C. John Carmack", "D. Mark Zuckerburg" },
                            { "A. C", "B. C+", "C. C--", "D. B++" },
                            { "A. Yes", "B. No", "C. Sometimes", "D. What is Earth?"}
                          };
    char answerKey[] = { 'C', 'B', 'A', 'B' };

    int size = sizeof(questions) / sizeof(questions[0]);
    char guess;
    int score = 0;

    for (int i = 0; i < size; i++) {
        cout << "**********************************************\n";
        cout << questions[i] << '\n';
        cout << "**********************************************\n";

        for (int j = 0; j < sizeof(options[i]) / sizeof(options[i][0]); j++) {
            cout << options[i][j] << '\n';
        }

        cin >> guess;
        guess = toupper(guess);

        if (guess == answerKey[i]) {
            cout << "Correct!\n";
            score++;
        }
        else {
            cout << "Wrong!\n";
            cout << "Answer: " << answerKey[i] << '\n';
        }
    }

    cout << "**********************************************\n";
    cout << "*                 RESULTS                    *\n";
    cout << "**********************************************\n";
    cout << "CORRECT GUESSES: " << score << '\n';
    cout << "Number of Questions: " << size << '\n';
    cout << "SCORE: " << (score / (double)size) * 100 << "%" << '\n';

    */
    //Memory Address_____________________________________________________________________________________________________________________________________________________________________
    /* */
   
    // memory address = a location in memory where data is stored. A memory address can be accessed with & (address-of operator)

    string name = "Paxton";
    int age = 19;
    bool student = true;

    cout << &name << '\n';
    cout << &age << '\n';
    cout << &student << '\n';




    return 0;
}
