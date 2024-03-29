//Design a class called Student having data members like student name and roll number and method called show to display the name and roll number. Derive a class called Test from student class having three subjects’ marks as a data members and method named show_marks to display the marks. Create an interface called Sports contains constant sports marks and method show_sportswt. Derive a class Result from Test class and implement the interface Sports .Calculate total marks by considering sports marks. Then display the total in Result class.
package synch;

import java.util.Scanner;
class student
{
	String name;
	int rollno;
	student(String name,int rno)
	{
		this.name = name;
		rollno = rno;
	}
	void show()
	{
	System.out.println("Name: "+name+"\nRoll Number: "+rollno);
	}
}
class test extends student
{
	int sub1,sub2,sub3;
	test(int sub1,int sub2,int sub3,String name,int rno)
	{
		super(name,rno);
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	void show_marks()
	{
	super.show();
	System.out.println("Subject 1: "+sub1+"\nSubject 2: "+sub2+"\nSubject 3:"+sub3);
	}
}
interface sports
{
	final int sport_mark = 40;
	void show_sportswt();
}
class result extends test implements sports
{
	int total = sub1+sub2+sub3+sport_mark;
	public void show_sportswt()
	{
		System.out.println("Sports marks: "+sport_mark);
	}
	result(String name,int rollno,int sub1,int sub2,int sub3)
	{
		super(sub1,sub2,sub3,name,rollno);
	}
	void display()
	{
	super.show_marks();
	System.out.println("Total Marks: "+total);
	}
}
public class synch
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name, roll number and marks in 3 subjects");
		String name = s.nextLine();
		int rno = s.nextInt();
		int sub1 = s.nextInt();
		int sub2 = s.nextInt();
		int sub3 = s.nextInt();
		result res = new result(name,rno,sub1,sub2,sub3);
		res.display();
		res.show_sportswt();
	}
}
