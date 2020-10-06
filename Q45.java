/*45.	Create a class Student with two members : rollno and percentage. Create default and parameterized 
 * constructors. Create method show() to display information. Create another class CollegeStudent inherits 
 * Student class. Add a new member semester to it. Create default and parameterized constructors.
 *  Also override show() method that calls super class show() method and displays semester. Create another
 *  class SchoolStudent inherits Student class. Add a new member className(eg 12th ,10th etc.) to it. 
 *  Create default and parameterized constructors. Also override show() method that calls super class show()
 *  method and displays className. Create a class( say Demo) with main method that carries out the operation
 *  of the project : -- has array to store objects of any class(Student,  CollegeStudent or SchoolStudent) 
 *  --create two CollegeStudent  and three SchoolStudent objects and store them inside the array 
 *  -- display all records from the array -- search record on the basic of rollno and check given rollno 
 *  is of SchoolStudent or of CollegeStudent. --count how many students are having A grade, if for A grade
 *   percentage >75. */

package a1;

import java.util.Scanner;
class Student{
	int rollno;
	float percentage;
	
	Student(){
		rollno=0;
		percentage=0;
	}
	
	Student(int rollno, float percentage){
		this.rollno=rollno;
		this.percentage=percentage;
	}
	void show() {
		System.out.print(rollno+" "+percentage);
	}
	void roll() {
		System.out.println("");
	}
}

class CollegeStudent extends Student{
	int semister;
	
	CollegeStudent(){
		super();
		semister=0;
	}
	
	CollegeStudent(int rollno, float percentage, int semister){
		super(rollno, percentage);
		this.semister=semister;
	}
	void show() {
		super.show();
		System.out.println(" "+semister);
	}
	void roll() {
		System.out.println("this student is from college");
	}
}

class SchoolStudent extends Student{
	String className;
	
	SchoolStudent(){
		super();
		className="";
	}
	
	SchoolStudent(int rollno, float percentage, String className){
		super(rollno, percentage);
		this.className=className;
	}
	void show() {
		super.show();
		System.out.println(" "+className);
	}
	void roll() {
		System.out.println("this student is from school");
	}
}

public class Q45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Student ar[]=new Student[5];
		ar[0]=new CollegeStudent(1, 55, 3);
		ar[1]=new CollegeStudent(2, 65, 3);
		ar[2]=new SchoolStudent(3, 80, "10th");
		ar[3]=new SchoolStudent(4, 76, "12th");
		ar[4]=new SchoolStudent(5, 70, "10th");
		
		for(Student a:ar) {
			a.show();
		}
		
		System.out.println("Enter roll no ");
		int n=sc.nextInt();
		int count=0;
		for(int i=0; i<ar.length; i++) {
			if(ar[i].rollno==n) {
				ar[i].roll();
			}
			if(ar[i].percentage>75) {
				count++;
			}
		}
		System.out.println(count);
	}

}
