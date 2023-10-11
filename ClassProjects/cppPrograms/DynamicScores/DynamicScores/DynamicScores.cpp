// DynamicScores.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>

using namespace std;

int main()
{
    int* ptr = nullptr;
    int numScores, tot;
    double avg;
    do
    {
        cout << "How many scores? ";
        cin >> numScores;
    } while (numScores < 0 || numScores >= 2147483647);
        ptr = new int[numScores];
    if (ptr)
    {
        for (int i = 0; i < numScores; i++)
        {
            cout << "Enter scores " << i + 1 << ": ";
            cin >> ptr[i];
        }
        tot = 0;
        for (int i = 0; i < numScores; i++)
        {
            tot += ptr[i];
        }
        avg = static_cast<double>(tot) / numScores;
        cout << avg;
        delete[] ptr;
        ptr = nullptr;
    }
    else
    {
        cout << "Error, array not found, please try again";
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
