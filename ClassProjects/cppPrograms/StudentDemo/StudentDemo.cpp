// StudentDemo.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include<iomanip>
#include "Student.h"
using namespace std;

int main()
{
	int sc[3];

	for (int x = 0; x < 3; x++)
	{
		do
		{
			
			cout << "Score " << x + 1 << ": ";
			cin >> sc[x];
		} while (sc[x] < 0 || sc[x] > 100);
	}
	Student John(sc[0], sc[1], sc[2]);

	cout << "Student's Grades: " << endl;
	cout << "Score 1: " << John.getScore1() << endl;
	cout << "Score 2: " << John.getScore2() << endl;
	cout << "Score 3: " << John.getScore3() << endl;
	cout << "Average: " << John.getAverage() << endl;
	cout << "Grade: " << John.getLetterGrade() << endl;
	return 0;
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
