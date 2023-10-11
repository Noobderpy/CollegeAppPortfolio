#include "Student.h"
#include <iostream>
#include <cstdlib>
using namespace std;

Student::Student() {
	sc1 = 0.0;
	sc2 = 0.0;
	sc3 = 0.0;
}
Student::Student(double s1, double s2, double s3) {
	sc1 = s1;
	sc2 = s2;
	sc3 = s3;
}
void Student::setScore1(double s1)
{
	sc1 = s1;
}
void Student::setScore2(double s2)
{
	sc2 = s2;
}
void Student::setScore3(double s3)
{
	sc2 = s3;
}
double Student::getScore1() const {
	return sc1;
}
double Student::getScore2() const {
	return sc2;
}
double Student::getScore3() const {
	return sc3;
}
double Student::getAverage() const {
	return((sc1 + sc2 + sc3) / 3.0);
}
char Student::getLetterGrade() const {
	double avg = getAverage();
	if (avg >= 90)
	{
		return 'A';
	}
	else if (avg >= 80)
	{
		return 'B';
	}
	 else if (avg >= 70)
	{
		return 'C';
	}
	else if (avg >= 60)
	{
		return 'D';
	}
	else
	{
		return 'F';
	}

}