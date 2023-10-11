// RadixSort.cpp : This file contains the 'main' function. Program execution begins and ends there.
//
#include <iostream>
#include <random>
#include<math.h>


using namespace std;

int main()
{
    const int MAX = 100001.0;
    const int SIZE = 1000;
    random_device rd;
    mt19937 mt(rd());
    uniform_real_distribution<double> dist(1.0, double(MAX));
    int sc[SIZE];
    int temp;
    bool swap;
    for (int i = 0; i < SIZE; ++i)
    {
        sc[i] = int(dist(mt));
    }
    for (int i = 0; i < SIZE; i++)
    {
        cout << sc[i] << endl;
    }
    cout << endl;
    //loop
    do
    {
        swap = false;
        for (int i = 0; i < SIZE; i++)
        {
            if (sc[i] > sc[i + 1])
            {
                temp = sc[i];
                sc[i] = sc[i + 1];
                sc[i + 1] = temp;
                swap = true;
            }
        }
    } while (swap);

    for (int i = 0; i < SIZE; i++)
    {
        cout << sc[i] << endl;
    }
    return 0;
}