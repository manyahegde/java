
import java.util.Scanner;

class Student
{
	String name;
	int rno;
	Student(String name , int rno)
	{
		this.name=name;
		this.rno=rno;
	}
	void display()
	{
		System.out.println("Name : "+name+"\nRoll Number : "+rno);
	}
}

public class Stud_Exception 
{
	public static void main(String[] args)
	{
		String name;
		int rno;
		Scanner s=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		Student st[]=new Student[5];
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Enter the name : ");
				name=s.nextLine();
				System.out.println("Enter the Roll Number : ");
				rno=s2.nextInt();
				st[i]=new Student(name,rno);
			}
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		System.out.println("Enter the First Character : ");
		char check = s.next().charAt(0);
		try
		{
			for(int i=0;i<5;i++)
			{
				if(check==st[i].name.charAt(0))
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


