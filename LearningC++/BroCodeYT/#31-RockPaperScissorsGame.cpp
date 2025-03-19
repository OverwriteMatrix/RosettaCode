#include <iostream>
using namespace std;

char getUserChoice();
char getComputerChoice();
void showChoice(char choice);
void chooseWinner(char player, char computer);



int main() {
	char player;
	char computer;


	player = getUserChoice();
	cout << "The Game: \n";
	cout << "Your choice: "; 
	showChoice(player);

	computer = getComputerChoice();
	cout << "Computer's choice: ";
	showChoice(computer);
	cout << "\n";
	chooseWinner(player, computer);

	cout << "***********************************************\n";
}

char getUserChoice() {
	char player;
	cout << "********** Rock-Paper-Scissors Game! **********\n";
	do {
		cout << " 'r' for Rock\n";
		cout << " 'p' for Paper\n";
		cout << " 's' for Scissors\n";
		cout << "Your Choice: ";
		cin >> player;
		cout << "\n";
	} while (player != 'r' && player != 'p' && player != 's');
	return player;
}

char getComputerChoice() {
	srand(time(0));
	int num = (rand() % 3) + 1;
	switch (num) {
	case 1: return 'r';
	case 2: return 'p';
	case 3: return 's';
	}
	return 0;
}

void showChoice(char choice) {
	switch (choice) {
		case 'r': cout << "Rock\n";
			break;
		case 'p': cout << "Paper\n";
			break;
		case 's': cout << "Scissors\n";
			break;
	}
}

void chooseWinner(char player, char computer) {
	switch (player) {
		case 'r': 
			if (computer == 'r') {
				cout << "It's a Tie!\n";
			}
			else if (computer == 'p') {
				cout << "You Loose!\n";
			}
			else {
				cout << "YOU WIN!!!!!!!\n";
			}
			break;
		case 'p':
			if (computer == 'r') {
				cout << "You WIN!!!!!!!!!!!!!!!\n";
			}
			else if (computer == 'p') {
				cout << "It's a Tie!\n";
			}
			else {
				cout << "You Loose!\n";
			}
			break;
		case 's':
			if (computer == 'r') {
				cout << "You Loose!\n";
			}
			else if (computer == 'p') {
				cout << "YOU WIN!!!!!!!!!!!!!!!\n";
			}
			else {
				cout << "It's a Tie!\n";
			}
			break;
	}
}
