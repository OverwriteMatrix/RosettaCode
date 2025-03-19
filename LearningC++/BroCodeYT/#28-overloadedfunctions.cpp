// Overloaded functions
// Functions can share the same name but you need a different set of parameters.
// A functions name plus its parameters is know as a functions signature and each function signiture needs to be unique (kind of like an ID)

#include <iostream>
using namespace std;

void bakePizza();
void bakePizza(string topping1);

int main() {
    bakePizza();
    bakePizza("Peperoni");
    bakePizza("Peperoni, Mushrooms");
}

void bakePizza() {
    cout << "Here is your pizza!\n";
}

void bakePizza(string topping1) {
    cout << "Here is your " << topping1 << "pizza!\n";
}

void bakePizza(string topping1, string topping2) {
    cout << "Here is your " << topping1 << " and " << topping2 << "pizza!\n";
}
