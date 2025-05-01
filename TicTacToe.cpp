// TikTacToe.cpp : This file contains the 'main' function. Program execution begins and ends there.

#include <iostream>
#include <string>

using std::cout;
using std::cin;
using std::string;
using std::endl;

static void boardKey() {
    cout << "Here is the board key: " << '\n';
    cout << "-------------" << '\n';
    cout << "| 1 | 2 | 3 |" << '\n';
    cout << "|-----------|" << '\n';
    cout << "| 4 | 5 | 6 |" << '\n';
    cout << "|-----------|" << '\n';
    cout << "| 7 | 8 | 9 |" << '\n';
    cout << "-------------" << '\n';
}

static void move(char board[3][3], char player) {
    int num;
    while (true) {
        cout << "Remember Type 0 for the board key!" << '\n';
        cout << player << "\'s Enter your number (1-9): ";
        cin >> num;

        switch (num) {
        case 0:
            boardKey();
            continue;
        case 1:
            if (board[0][0] == '-') {
                board[0][0] = player;
                return;
            }
            break;
        case 2:
            if (board[0][1] == '-') {
                board[0][1] = player;
                return;
            }
            break;
        case 3:
            if (board[0][2] == '-') {
                board[0][2] = player;
                return;
            }
            break;
        case 4:
            if (board[1][0] == '-') {
                board[1][0] = player;
                return;
            }
            break;
        case 5:
            if (board[1][1] == '-') {
                board[1][1] = player;
                return;
            }
            break;
        case 6:
            if (board[1][2] == '-') {
                board[1][2] = player;
                return;
            }
            break;
        case 7:
            if (board[2][0] == '-') {
                board[2][0] = player;
                return;
            }
            break;
        case 8:
            if (board[2][1] == '-') {
                board[2][1] = player;
                return;
            }
            break;
        case 9:
            if (board[2][2] == '-') {
                board[2][2] = player;
                return;
            }
            break;
        default:
            cout << "Invalid number. Please try again." << endl;
            continue;
        }

        cout << "There is already a mark there, please try again." << endl;
    }
}

static void winCheckerX(char board[3][3]) {
    if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
        cout << "X's Win!" << '\n';
        exit(0);
    } else if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') {
        cout << "X's Win!" << '\n';
        exit(0);
    } else if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') {
        cout << "X's Win!" << '\n';
        exit(0);
    }

    else if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') {
        cout << "X's Win!" << '\n';
        exit(0);
    } else if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
        cout << "X's Win!" << '\n';
        exit(0);
    } else if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
        cout << "X's Win!" << '\n';
        exit(0);
    }

    else if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
        cout << "X's Win!" << '\n';
        exit(0);
    }
    else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
        cout << "X's Win!" << '\n';
        exit(0);
    }
}

static void winCheckerO(char board[3][3]) {
    if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') {
        cout << "O's Win!" << '\n';
        exit(0);
    }
    else if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') {
        cout << "O's Win!" << '\n';
        exit(0);
    }
    else if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') {
        cout << "O's Win!" << '\n';
        exit(0);
    }

    else if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') {
        cout << "O's Win!" << '\n';
        exit(0);
    }
    else if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') {
        cout << "O's Win!" << '\n';
        exit(0);
    }
    else if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') {
        cout << "O's Win!" << '\n';
        exit(0);
    }

    else if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
        cout << "O's Win!" << '\n';
        exit(0);
    }
    else if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
        cout << "O's Win!" << '\n';
        exit(0);
    }
}

static void printBoard(char board[3][3]) {
    cout << "-------------" << '\n';
    for (int i = 0; i < 3; i++) {
        cout << "| ";
        for (int j = 0; j < 3; j++) {
            cout << board[i][j] << " | ";
        }
        cout << '\n';
        if (i < 2) {
            cout << "|-----------|" << '\n';
        }
    }
    cout << "-------------" << '\n';
}




int main(){
    int gameType;
    cout << "Hello, and welcome to TicTacToe!" << '\n';
    cout << "Will you be playing against another player or the computer?" << '\n';
    cout << "Type 1 for playing against the computer or type 2 for playing another player." << '\n';

    char board[3][3] = { {'-', '-', '-'},
                         {'-', '-', '-'},
                         {'-', '-', '-'} };


    while(true){
        cout << "Choice: "; cin >> gameType;

        if (gameType == 1) {
            cout << "1 player, nice. So you will be playing against me.... Good Luck." << '\n';
            boardKey();
            cout << "When asked for your selection please type in a number 1-9, if you cannot remember the board key just type 0 to have it shown again." << '\n';
            cout << "I'll be X's, you will be O's. Here, I'll go first to show you how it is done." << '\n';
            board[0][0] = 'X';      // Computer's first move takes 1
            printBoard(board);                                   

            move(board, 'O');                                                                          //     -------------
            printBoard(board);                                                                         //     | X | 2 | 3 |           
            winCheckerO(board);                                                                        //     |-----------|
            winCheckerX(board);                                                                        //     | 4 | 5 | 6 |
                                                                                                       //     |-----------|       
                                                                                                       //     | 7 | 8 | 9 |
            // User's first move is 9                                                                  //     -------------
            if (board[2][2] == 'O') {  
                cout << "Computer's Move: " << '\n';
                board[0][2] = 'X';
                printBoard(board);
                winCheckerO(board);
                winCheckerX(board);

                move(board, 'O');                                       
                printBoard(board);
                winCheckerO(board);
                winCheckerX(board);

                cout << "Computer's Move: " << '\n';                    
                if (board[0][1] == 'O') {
                    board[2][0] = 'X';
                }
                else {
                    board[0][1] = 'X';
                }
                printBoard(board);
                winCheckerO(board);
                winCheckerX(board);

                move(board, 'O');                                      
                printBoard(board);
                winCheckerO(board);
                winCheckerX(board);

                cout << "Computer's Move: " << '\n';                    
                if (board[1][0] == 'O') {
                    board[1][1] = 'X';
                }
                else if (board[1][1] == 'O') {
                    board[1][0] = 'X';
                }
                printBoard(board);
                winCheckerO(board);
                winCheckerX(board);
            }                                     
            // User's first move is 2
            else if (board[0][1] == 'O') {
                cout << "Computer's Move: " << '\n';
                board[2][0] = 'X';
                printBoard(board);                                               
                winCheckerO(board);                                                                        
                winCheckerX(board);

                move(board, 'O');                                                            
                printBoard(board);                                                                             
                winCheckerO(board);                                                                        
                winCheckerX(board);

                if (board[1][0] == 'O') {
                    cout << "Computer's Move: " << '\n';
                    board[2][2] = 'X';
                    printBoard(board);
                    winCheckerO(board);
                    winCheckerX(board);

                    move(board, 'O');
                    printBoard(board);
                    winCheckerO(board);
                    winCheckerX(board);

                    if (board[1][1] = 'O') {
                        cout << "Computer's Move: " << '\n';
                        board[2][1] = 'X';
                        printBoard(board);
                        winCheckerO(board);
                        winCheckerX(board);
                    }
                    else if (board[2][1] = 'O') {
                        cout << "Computer's Move: " << '\n';
                        board[1][1] = 'X';
                        printBoard(board);
                        winCheckerO(board);
                        winCheckerX(board);
                    }
                    else {
                        cout << "Computer's Move: " << '\n';
                        board[1][1] = 'X';
                        printBoard(board);
                        winCheckerO(board);
                        winCheckerX(board);
                    }

                }
                else {
                    board[1][0] = 'X';
                    printBoard(board);
                    winCheckerO(board);
                    winCheckerX(board);
                }
            }
            // User's first move is 3
            else if (board[0][2] == 'O') {
                cout << "Computer's Move: " << '\n';
                board[2][2] = 'X';
                printBoard(board);
                winCheckerO(board);
                winCheckerX(board);

                move(board, 'O');
                printBoard(board);
                winCheckerO(board);
                winCheckerX(board);
                if (board[1][1] == 'O') {
                    cout << "Computer's Move: " << '\n';
                    board[2][0] = 'X';
                    printBoard(board);
                    winCheckerO(board);
                    winCheckerX(board);

                    move(board, 'O');
                    printBoard(board);
                    winCheckerO(board);
                    winCheckerX(board);

                    if (board[1][0] == 'O') {
                        cout << "Computer's Move: " << '\n';
                        board[2][1] = 'X';
                        printBoard(board);
                        winCheckerO(board);
                        winCheckerX(board);
                    }
                    else if (board[2][1] == 'O') {
                        cout << "Computer's Move: " << '\n';
                        board[1][0] = 'X';
                        printBoard(board);
                        winCheckerO(board);
                        winCheckerX(board);
                    }
                    else {
                        cout << "Computer's Move: " << '\n';
                        board[1][0] = 'X';
                        printBoard(board);
                        winCheckerO(board);
                        winCheckerX(board);
                    }
                }
                else {
                    cout << "Computer's Move: " << '\n';
                    board[1][1] = 'X';
                    printBoard(board);
                    winCheckerO(board);
                    winCheckerX(board);
                }
            }
            // User's first move is 4
            else if (board[1][0] == 'O') {
                cout << "Computer's Move: " << '\n';
                board[2][2] = 'X';
                printBoard(board);
                winCheckerO(board);
                winCheckerX(board);

                move(board, 'O');
                printBoard(board);
                winCheckerO(board);
                winCheckerX(board);

                if (board[1][1] == 'O') {
                    cout << "Computer's Move: " << '\n';
                    board[1][2] = 'X';
                    printBoard(board);
                    winCheckerO(board);
                    winCheckerX(board);

                    move(board, 'O');
                    printBoard(board);
                    winCheckerO(board);
                    winCheckerX(board);
                    if (board[0][2] == 'O') {
                        cout << "Computer's Move: " << '\n';
                        board[2][0] = 'X';
                        printBoard(board);
                        winCheckerO(board);
                        winCheckerX(board);

                        move(board, 'O');
                        printBoard(board);
                        winCheckerO(board);
                        winCheckerX(board);

                        if (board[0][1] == 'O') {
                            cout << "Computer's Move: " << '\n';
                            board[2][1] = 'X';
                            printBoard(board);
                            winCheckerO(board);
                            winCheckerX(board);
                        }
                        else {
                            cout << "Computer's Move: " << '\n';
                            board[0][1] = 'X';
                            printBoard(board);
                            winCheckerO(board);
                            winCheckerX(board);

                            cout << "Cat's Game!";
                        }
                    }
                    else {
                        cout << "Computer's Move: " << '\n';
                        board[0][2] = 'X';
                        printBoard(board);
                        winCheckerO(board);
                        winCheckerX(board);
                    }
                }
                else {
                    cout << "Computer's Move: " << '\n';
                    board[1][1] = 'X';
                    printBoard(board);
                    winCheckerO(board);
                    winCheckerX(board);
                }
            }
            // User's first move is 5
            else if (board[1][1] == 'O') {
                cout << "Computer's Move: " << '\n';
                board[2][2] = 'X';
                printBoard(board);
                winCheckerO(board);
                winCheckerX(board);

                move(board, 'O');
                printBoard(board);
                winCheckerO(board);
                winCheckerX(board);
                if (board[0][1] == 'O') {
                    cout << "Computer's Move: " << '\n';
                    board[2][1] = 'X';
                    printBoard(board);
                    winCheckerO(board);
                    winCheckerX(board);

                    move(board, 'O');
                    printBoard(board);
                    winCheckerO(board);
                    winCheckerX(board);
                    if (board[2][0] == 'O') {
                        cout << "Computer's Move: " << '\n';
                        board[0][2] = 'X';
                        printBoard(board);
                        winCheckerO(board);
                        winCheckerX(board);

                        move(board, 'O');
                        printBoard(board);
                        winCheckerO(board);
                        winCheckerX(board);
                        if (board[1][2] == 'O') {
                            cout << "Computer's Move: " << '\n';
                            board[1][0] = 'X';
                            printBoard(board);
                            winCheckerO(board);
                            winCheckerX(board);

                            cout << "Cat's Game!" << '\n';
                        }
                        else {
                            cout << "Computer's Move: " << '\n';
                            board[1][2] = 'X';
                            printBoard(board);
                            winCheckerO(board);
                            winCheckerX(board);
                        }
                    }
                    else {
                        board[2][0] = 'X';
                        printBoard(board);
                        winCheckerO(board);
                        winCheckerX(board);
                    }


                }
                else if (board[0][2] == 'O') {
                    cout << "02";
                    cout << "Computer's Move: " << '\n';
                    board[2][0] = 'X';
                    printBoard(board);
                    winCheckerO(board);
                    winCheckerX(board);

                    move(board, 'O');
                    printBoard(board);
                    winCheckerO(board);
                    winCheckerX(board);
                    if (board[1][0] == 'O') {
                        board[2][1] = 'X';
                        printBoard(board);
                        winCheckerO(board);
                        winCheckerX(board);
                    }
                    else {
                        board[1][0] = 'X';
                        printBoard(board);
                        winCheckerO(board);
                        winCheckerX(board);
                    }
                }
                else if (board[1][0] == 'O') {
                    board[1][2] = 'X';
                    printBoard(board);
                    winCheckerO(board);
                    winCheckerX(board);

                    move(board, 'O');
                    printBoard(board);
                    winCheckerO(board);
                    winCheckerX(board);

                    if (board[0][2] == 'O') {
                        board[2][0] = 'X';
                        printBoard(board);
                        winCheckerO(board);
                        winCheckerX(board);

                        move(board, 'O');
                        printBoard(board);
                        winCheckerO(board);
                        winCheckerX(board);
                        if (board[2][1] == 'O') {
                            cout << "Computer's Move: " << '\n';
                            board[0][1] = 'X';
                            printBoard(board);
                            winCheckerO(board);
                            winCheckerX(board);

                            cout << "Cat's Game!";
                        }
                        else {
                            cout << "Computer's Move: " << '\n';
                            board[2][1] = 'X';
                            printBoard(board);
                            winCheckerO(board);
                            winCheckerX(board);
                        }
                    }
                }
                else if (board[1][2] == 'O') {
                    cout << "12";
                }
                else if (board[2][0] == 'O') {
                    cout << "20";
                }
                else if (board[2][1] == 'O') {
                    cout << "21";
                }




            }
            // User's first move is 6
            else if (board[1][2] == 'O') {
                cout << "Computer's Move: 9" << '\n';
                board[2][2] = 'X';
                printBoard(board);
                winCheckerO(board);
                winCheckerX(board);

                move(board, 'O');
                printBoard(board);
                winCheckerO(board);
                winCheckerX(board);
                if (board[1][1] == 'O') {
                    cout << "Computer's Move: 4" << '\n';
                    board[1][0] = 'X';
                    printBoard(board);
                    winCheckerO(board);
                    winCheckerX(board);

                    move(board, 'O');
                    printBoard(board);
                    winCheckerO(board);
                    winCheckerX(board);
                    if (board[2][0] == 'O') {
                        cout << "Computer's Move: 3" << '\n';
                        board[0][2] = 'X';
                        printBoard(board);
                        winCheckerO(board);
                        winCheckerX(board);


                        move(board, 'O');
                        printBoard(board);
                        winCheckerO(board);
                        winCheckerX(board);

                        if (board[0][1] == 'O') {
                            cout << "Computer's Move: 8" << '\n';
                            board[2][1] = 'X';
                            printBoard(board);
                            winCheckerO(board);
                            winCheckerX(board);
                            cout << "Cat's Game!";
                            break;
                        }
                        else {
                            cout << "Computer's Move: 2" << '\n';
                            board[0][1] = 'X';
                            printBoard(board);
                            winCheckerO(board);
                            winCheckerX(board);
                        }
                    }
                    else {
                        cout << "Computer's Move: 7" << '\n';
                        board[2][0] = 'X';
                        printBoard(board);
                        winCheckerO(board);
                        winCheckerX(board);
                    }

                }
                else {
                    cout << "Computer's Move: 5" << '\n';
                    board[1][1] = 'X';
                    printBoard(board);
                    winCheckerO(board);
                    winCheckerX(board);
                }

            }
            // User's first move is 7
            else if (board[2][0] == 'O') {
                cout << "Computer's Move: 9" << '\n';
                board[2][2] = 'X';
                printBoard(board);
                winCheckerO(board);
                winCheckerX(board);

                move(board, 'O');
                printBoard(board);
                winCheckerO(board);
                winCheckerX(board);
                
                if (board[1][1] == 'O') {
                    cout << "Computer's Move: 3" << '\n';
                    board[0][2] = 'X';
                    printBoard(board);
                    winCheckerO(board);
                    winCheckerX(board);

                    move(board, 'O');
                    printBoard(board);
                    winCheckerO(board);
                    winCheckerX(board);

                    if (board[0][1] == 'O') {
                        cout << "Computer's Move: 6" << '\n';
                        board[1][2] = 'X';
                        printBoard(board);
                        winCheckerO(board);
                        winCheckerX(board);
                        break;
                    }
                    else {
                        cout << "Computer's Move: 2" << '\n';
                        board[0][1] = 'X';
                        printBoard(board);
                        winCheckerO(board);
                        winCheckerX(board);
                        break;
                    }
                }
                else {
                    cout << "Computer's Move: 5" << '\n';
                    board[1][1] = 'X';
                    printBoard(board);
                    winCheckerO(board);
                    winCheckerX(board);
                    break;
                }

            }
            // User's first move is 8
            else if (board[2][1] == 'O') {
                cout << "Computer's Move: 9" << '\n';
                board[2][2] = 'X';
                printBoard(board);
                winCheckerO(board);
                winCheckerX(board);

                move(board, 'O');
                printBoard(board);
                winCheckerO(board);
                winCheckerX(board);

                if (board[1][1] == 'O') {
                    cout << "Computer's Move: 2" << '\n';
                    board[0][1] = 'X';
                    printBoard(board);
                    winCheckerO(board);
                    winCheckerX(board);

                    move(board, 'O');
                    printBoard(board);
                    winCheckerO(board);
                    winCheckerX(board);

                    if (board[0][2] == 'O') {
                        cout << "Computer's Move: 7" << '\n';
                        board[2][0] = 'X';
                        printBoard(board);
                        winCheckerO(board);
                        winCheckerX(board);

                        move(board, 'O');
                        printBoard(board);
                        winCheckerO(board);
                        winCheckerX(board);

                        if (board[1][0] == 'O') {
                            cout << "Computer's Move: 6" << '\n';
                            board[1][2] = 'X';
                            printBoard(board);
                            winCheckerO(board);
                            winCheckerX(board);
                            cout << "Cat's Game!";
                            break;
                        }
                        else {
                            cout << "Computer's Move: 4" << '\n';
                            board[1][0] = 'X';
                            printBoard(board);
                            winCheckerO(board);
                            winCheckerX(board);
                            break;
                        }
                    }
                    else {
                        cout << "Computer's Move: 3" << '\n';
                        board[0][2] = 'X';
                        printBoard(board);
                        winCheckerO(board);
                        winCheckerX(board);
                        break;
                    }

                }
                else {
                    cout << "Computer's Move: 5" << '\n';
                    board[1][1] = 'X';
                    printBoard(board);
                    winCheckerO(board);
                    winCheckerX(board);
                    break;
                }
            }
            break;
        }
        else if (gameType == 2) {
            cout << "2 players, nice. The first player will be X\'s and the seocnd O\'s. Good Luck." << '\n';
            boardKey();
            cout << "When asked for your selection please type in a number 1-9, if you cannot remember the board key just type 0 to have it shown again." << '\n';
            cout << '\n';
            printBoard(board);

            move(board, 'X');
            printBoard(board);
            winCheckerX(board);

            move(board, 'O');
            printBoard(board);
            winCheckerO(board);

            move(board, 'X');
            printBoard(board);
            winCheckerX(board);

            move(board, 'O');
            printBoard(board);
            winCheckerO(board);

            move(board, 'X');
            printBoard(board);
            winCheckerX(board);

            move(board, 'O');
            printBoard(board);
            winCheckerO(board);

            move(board, 'X');
            printBoard(board);
            winCheckerX(board);

            move(board, 'O');
            printBoard(board);
            winCheckerO(board);

            move(board, 'X');
            printBoard(board);
            winCheckerX(board);

            cout << "Cat's Game! Why don't you play again?" << '\n';

            break;
        }
        else {
            cout << "Invalid choice. Please try again." << '\n';
        }
    }

  
}
