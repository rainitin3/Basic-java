package jre;

//Inheritance means one object acquires all the property of and behaviour of parent object.

//types of inheritance
/*1.single inheritance
2.multilevel inheritance
3. Hierarchical inheritance

TO avoide ambugity problem mutiple and hybride inhertance is not allowed in java
4.multiple 
5.hybride
Abstraction and interface

*/

/*Polymorphism
 * poly = many
 * morphism = forms
 * 
 * polymorphism mean one action performed by number of way
 * types :1.Method overloading: with in a same class two different method have same name but different parameter
 * 		2. method overriding:-will happened in two different classes which have parent-child realtionship,
 *                           - method have same name, same parameter, same datatype.
 * Q. difference bet method overloading vs method overriding
 * */
class Subject {
	int english;
	int math;
	int history;
	int geo;

	int percentage(int english, int math, int history, int geo) {
		int per = (english + math + history + geo) / 4;
		return per;
	}
}

//Parent class
class Student extends Subject {
	/*
	 * String studentname = "Om"; int studentMark = 60;
	 * 
	 * void display() { System.out.println("School Name is xyz"); }
	 */

	int addition(int c, int d) {
		return c + d;
	}
}

//child class
public class School extends Students {

	String schoolName = "ABC";

	int addition(double d, double e, double f) {

		d = d + e + f;
		return (int) d;
	}

	int addition(int a, int b) {

		a = a + b;
		return a;
	}

	public static void main(String[] args) {
		School school = new School();
		int result;
		int result1;
		result = school.addition(30, 40);

		result1 = school.addition(30.5, 40.6, 20.3);

		System.out.println(result);
		System.out.println(result1);
		/*
		 * System.out.println("Student name is :" + school.studentname);
		 * System.out.println("Student mark :" + school.studentMark);
		 * System.out.println(
		 * "-------------------marks---------------------------------");
		 * 
		 * System.out.println("marks for english :" + school.english);
		 * System.out.println("marks for english :" + school.math);
		 * System.out.println("marks for english :" + school.history);
		 * System.out.println("marks for english :" + school.geo);
		 * 
		 * int percent = school.percentage(70, 40, 60, 60);
		 * System.out.println("Percentage is :" + percent);
		 * 
		 * System.out.println("School Name is :" + school.schoolName); school.display();
		 */ }

}
