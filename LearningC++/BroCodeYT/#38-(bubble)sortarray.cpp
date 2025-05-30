#include <iostream>
using namespace std;

void bubbleSort(int array[], int size);

int main()
{
    //Bubble sort an array
    int array[] = { 10,1,9,2,8,3,7,4,6,5 };
    int size1 = sizeof(array) / sizeof(array[0]);

    bubbleSort(array, size1);

    for (int element : array) {
        cout << element << " ";
    }
}

void bubbleSort(int array[], int size) {
    int temp;
    for (int i = 0; i < size - 1; i++) {
        for (int j = 0; j < size - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }
}
