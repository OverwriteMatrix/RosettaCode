//functions = a block of reusable code

#include <iostream>
using namespace std;

void happyBirthday(string name, int age);	//Programs are read top-down so we must declare functions before the main but define later (This is a function decleration not defenition)

int main() {
	string name = "Paxton";
	int age = 19;
	happyBirthday(name, age);		//Calls/invokes the happyBirthday function
}

void happyBirthday(string name, int age) {		//This is the function decleration which has already been declared above the main function
	cout << "Happy Birthday to you \n";
	cout << "Happy Birthday to you \n";
	cout << "Happy Birthday dear " << name << "\n";
	cout << "Happy Birthday to you \n";
	cout << "Congrats on being " << age << " years old!\n\n";
}
