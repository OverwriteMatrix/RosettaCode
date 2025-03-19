//return = return a value back to the spot where you called the encompassing function

#include <iostream>
using namespace std;

double square(double length);
double cube(double length);
string concatStrings(string str1, string str2);

int main()
{
    
    double length = 5.0;

    double area = square(length);
    cout << area << "\n";

    double volume = cube(length);
    cout << volume << "\n";

    string firstname = "Paxton";
    string lastname = "Clark";
    string fullname = concatStrings(firstname, lastname);
    cout << "Hello, " << fullname << "\n";

    return 0;
}

double square(double length) {
    return   length * length;
}

double cube(double length) {
    return length* length* length;
}

string concatStrings(string str1, string str2) {
    return str1 + " " + str2;
}
