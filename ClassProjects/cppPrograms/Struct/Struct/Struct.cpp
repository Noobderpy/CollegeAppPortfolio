// Struct.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include<string>
#include<iomanip>

using namespace std;

struct Student
{
    string fName;
    char initial;
    string lName;
    short age;
    string homeroom;
    string cellnumber;

};

int main()
{
    Student student;
    cout << "Enter student first name: ";
    //cin.ignore();
    getline(cin, student.fName);
    cout << "Enter student initial: ";
    cin >> student.initial;
    cout << "Enter student last name: ";
    cin.ignore();
    getline(cin, student.lName);
    cout << "Enter student age: ";
    cin >> student.age;
    cout << "Enter student homeroom: ";
    cin.ignore();
    getline(cin, student.homeroom);
    cout << "Enter student cell number: ";
    //cin.ignore();
    getline(cin, student.cellnumber);

    cout << "First Name: " << student.fName << endl;
    cout << "Initial: " << student.initial << endl;
    cout << "Last Name: " << student.lName << endl;
    cout << "Age: " << student.age << endl;
    cout << "Homeroom: " << student.homeroom << endl;
    cout << "Cell Number: " << student.cellnumber << endl;
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
