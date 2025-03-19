#include <iostream>
#include <iomanip>
using namespace std;

void showbalance(double balance);
double deposit();
double withdraw(double balance);

int main() {

    double balance = 0;
    int choice = 0;
    cout << "********** Clark Bank **************************************************************************************************\n";

    do {
        cout << "1. Show Balance\n";
        cout << "2. Deposit Money\n";
        cout << "3. Withdraw Money\n";
        cout << "4. Exit\n";
        cout << "*****************\n";
        cout << "Enter your choice: \n";
        cin >> choice;
        cout << "\n";

        switch (choice) {
        case 1: showbalance(balance);
            break;
        case 2: balance += deposit();
            cout << "Your new balance is: $" << balance << "\n\n";
            break;
        case 3: balance -= withdraw(balance);
            cout << "Your new balance is: $" << balance << "\n\n";
            break;
        case 4: cout << "Thanks for visiting Clark Bank, see you soon!\n";
            break;
        default: cout << "That is an invalid choice\n";
        }
    } while (choice != 4);

    cout << "************************************************************************************************************************\n";

}

void showbalance(double balance) {
    cout << "Your balance is: $" << setprecision(2) << fixed << balance << "\n\n";
}

double deposit() {
    double amount = 0;
    cout << "Enter amount to be deposited: $";
    cin >> amount;
    if (amount > 0) {
        return amount;
    }
    else {
        cout << "That's not a valid deposit\n\n";
    }
}

double withdraw(double balance) {
    double amount;
    cout << "Enter amount to be withdrawn: $";
    cin >> amount;
    if (amount > balance) {
        cout << "That would overdraw your account!\n\n";
        return 0;
    }
    else if (amount < 0) {
        cout << "That's not a valid amount\n\n";
        return 0;
    }
    else {
        return amount;
    }
}
