// Vector.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include<vector>

using namespace std;

void getScores(vector<int>& sc, int& numScores)
{
    int temp = 0;
    cout << "How many scores? ";
    cin >> numScores;
    for (int i = 0; i < numScores; i++)
    {
        cout << "Enter score: ";
        cin >> temp;
        sc.push_back(temp);

    }
}

int findLow(vector<int> sc)
{
    int holder = sc[0];
    for (int i = 1; i < sc.size(); i++)
    {
        if (sc[i] < holder)
            holder = sc[i];
    }
    return holder;
}

double calcAvg(vector<int> sc, int low)
{
    int tot = -low;
    for (int i = 0; i < sc.size(); i++)
    {
        tot += sc[i];
    }
    //tot -= low;
    return static_cast<double>(tot) / (sc.size() - 1);
}

void display(vector<int> sc, int low, double avg)
{
    for (int i = 0; i < sc.size(); i++)
    {
        cout << "Score " << i + 1 << ": " << sc[i] << endl;
    }
    cout << "Low score: "<< low << endl;
    cout << "Average: " << avg << endl;
}

int main()
{
    vector<int>scores;
    int numScores, low;
    double avg;
    getScores(scores, numScores);
    low = findLow(scores);
    avg = calcAvg(scores, low);
    display(scores, low, avg);
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
