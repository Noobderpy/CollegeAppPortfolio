#ifndef STUDENT_H
#define STUDENT_H
class Student {
private:
	double sc1;
	double sc2;
	double sc3;
public:
	Student();
	Student(double, double, double);
	void setScore1(double);
	void setScore2(double);
	void setScore3(double);
	double getScore1() const;
	double getScore2() const;
	double getScore3() const;
	double getAverage() const;
	char getLetterGrade() const;
};
#endif