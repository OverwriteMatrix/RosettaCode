#include <iostream>
using namespace std;

int linearSearch(int array[], int size, int element);

int main()
{
    //This is a linear search starts at the 1st element, then moves to the second, then the third, etc.
    
    int numbers[] = { 1,2,3,4,5,6,7,8,9,10 };
    int size = sizeof(numbers) / sizeof(numbers[0]);
    int index;
    int myNum;

    cout << "Enter element to search for: \n";
    cin >> myNum;

    index = linearSearch(numbers, size, myNum);

    if (index != -1) {
        cout << myNum << " is at index " << index << '\n';
    }
    else {
        cout << "That number is not in the array";
    }
}

int linearSearch(int array[], int size, int element) {
    for (int i = 0; i < size; i++) {
        if (array[i] == element) {
            return i;
        }
    }
    return -1;
}
