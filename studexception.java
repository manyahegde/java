//Create a class as Student. Write a program in Java to display the names and roll numbers of students. Create an array of 10 students and initialize the array with user input. Handle ArrayIndexOutOfBoundsExeption, so that any such problem doesn’t cause illegal termination of program. Read a character from user and display the student names starting with given character.
package studexception;
import java.util.Scanner;
class Student
{
	String name;
	int rno;
	Student(String name, int rno)
	{
		this.name = name;
		this.rno = rno;
	}
	void display()
	{
		System.out.println("Name: " + name + "\nRoll Number: " + rno);
	}
}
public class studexception
{
	public static void main(String[] args)
	{
		String name;
		int rno;
		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Student st[] = new Student[5];
		try
		{
			for (int i = 0; i < 6; i++)
			{
				System.out.println("Enter the name: ");
				name = s.nextLine();
				System.out.println("Enter the roll number: ");
				rno = s2.nextInt();
				st[i] = new Student(name, rno);
			}
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		System.out.println("Enter the first character: ");
		char check = s.next().charAt(0);
		try
		{
			for (int i = 0; i < 5; i++)
			{
				if (check == st[i].name.charAt(0))
				{
					st[i].display();
				}
			}
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
	
		}
	}
}