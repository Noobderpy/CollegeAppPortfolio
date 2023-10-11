// SelectionSort.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include<random>
#include<math.h>

using namespace std;

void selectionSort(int sc[], int size)
{
    int startScan, minIndex, minValue;
    for (startScan = 0; startScan < (size - 1); startScan++)
    {
        minIndex = startScan;
        minValue = sc[startScan];
        for (int index = startScan + 1; index < size; index++)
        {
            if (sc[index] < minValue)
            {
                minValue = sc[index];
                minIndex = index;
            }
        }
        sc[minIndex] = sc[startScan];
        sc[startScan] = minValue;

    }
}

void showArray(int sc[], int size)
{
    for (int i = 0; i < size; i++)
    {
        cout << sc[i] << endl;
    }
}

int main()
{
    const int MAX = 100001.0;
    const int SIZE = 1000;
    random_device rd;
    mt19937 mt(rd());
    uniform_real_distribution<double> dist(1.0, double(MAX));
    int sc[SIZE];
    for (int i = 0; i < SIZE; ++i)
    {
        sc[i] = int(dist(mt));
    }
    selectionSort(sc, SIZE);
    showArray(sc, SIZE);
}

// Run program: Ctrl + F5 or Debug > Start Without Debugging menu
// Debug program: F5 or Debug > Start Debugging menu

// Tips for Getting Started: 
//   1. Use the Solution Explorer window to add/manage files
//   2. Use the Team Explorer window to connect to source control
//   3. Use the Output window to see build output and other messages
//   4. Use the Error List window to view errors
//   5. Go to Project > Add New Item to create new code files, or Project > Add Existing Item to add existing code files to the project
//   6. In the future, to open this project again, go to File > Open > Project and select the .sln file
