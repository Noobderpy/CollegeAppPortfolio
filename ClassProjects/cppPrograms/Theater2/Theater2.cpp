// Theater2.cpp : This file contains the 'main' function. Program execution begins and ends there.
//
#include <iostream>

using namespace std;

const int SECTIONS = 3;
const int ROWS = 10;
const int COLUMNS = 15;
int main()
{
    int seats[SECTIONS][ROWS][COLUMNS];
    for (int s = 0; s < SECTIONS; s++)
    {
        for (int r = 0; r < ROWS; r++)
        {
            for (int c = 0; c < COLUMNS; c++)
            {
                seats[s][r][c] = 0;
            }
        }
    }
    for (int r = 0; r < ROWS; r++)
    {
        for (int s = 0; s < SECTIONS; s++)
        {
            for (int c = 0; c < COLUMNS; c++)
            {
                cout << seats[s][r][c];
            }
            cout << " ";
        }
        cout << "\n";
    }
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
