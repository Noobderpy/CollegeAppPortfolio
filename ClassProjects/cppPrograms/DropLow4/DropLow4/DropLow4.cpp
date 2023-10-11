// DropLow4.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include<vector>
#include<string>

using namespace std;

void getData(vector<vector<int>>& scores)
{
    for (int i = 0; i < scores.size(); i++)
    {
        for (int j = 0; j < scores[i].size(); j++)
        {
            while (scores[i][j] > 100 || scores[i][j] < 0)
            {
                cout << "Enter Score " << j + 1 << " for student " << i + 1 << ": ";
                cin >> scores[i][j];
            }
        }
    }
}

void findLow(vector<vector<int>> scores, vector<int>& low)
{
    for (int i = 0; i < scores.size(); i++)
    {
        int holder = scores[i][0];
        for (int j = 1; j < scores[i].size(); j++)
        {
            if (scores[i][j] < holder)
            {
                holder = scores[i][j];
            }
        }
        low[i] = holder;
    }
}


int getNum(string thing)
{
    cout << "How many " << thing << "? ";
    int value;
    cin >> value;
    return value;
}

vector<double> calcAvg(vector<vector<int>> scores, vector<int> low)
{
    vector<double> avg(scores.size(), -1);
    for (int i = 0; i < scores.size(); i++)
    {
        int tot = 0;
        for (int j = 0; j < scores[i].size(); j++)
        {
            tot += scores[i][j];
        }
        tot -= low[i];
        avg[i] = static_cast<double>(tot) / (scores[i].size() - 1);
    }
    return avg;
}

void displayData(vector<vector<int>> scores, vector<int> low, vector<double> avg)
{
    for (int i = 0; i < scores.size(); i++)
    {
        cout << "Average score for student " << i+1 << ": " << avg[i] << endl;
        cout << "Low score for student " << i+1 << ": " << low[i] << endl;
        for (int j = 0; j < scores[i].size(); j++)
        {
            cout << "Score " << j+1 << " for student " << i+1 << " : " << scores[i][j] << endl;
        }
        cout << " " << endl;
    }
}

int main()
{
    int numStudents = getNum("students");
    int numTests = getNum("tests");
    vector<vector<int>> sc(numStudents, vector<int>(numTests, -1));
    vector<int> low(numStudents, -1);
    vector<double> avg(numStudents, -1);
    getData(sc);
    findLow(sc, low);
    avg = calcAvg(sc, low);
    displayData(sc, low, avg);
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
