//Write a java program that prints all real solutions to the quadratic equation ax2+bx+c=0.Read in a, b, c and use the quadratic formula.
package roots;

import java.util.Scanner;
class roots
{
	public static void main(String args[])
	{
		double r1,r2;
		System.out.println("Enter a,b,c of the equation ax2+bx+c=0");
		Scanner as=new Scanner (System.in);
		int a=as.nextInt();
		int b=as.nextInt();
		int c=as.nextInt();
		int d=b*b-4*a*c;
		if(d<0)
		{
			System.out.println("There are no solutions");
		}
		if(d==0)
		{
			System.out.println("The roots are real and equal");
			r1=r2=-b/(2.0*a);
			System.out.println("The roots are "+r1+" and "+r2);
		}
		if(d>0)
		{
			System.out.println("The roots are real and distinct");
			r1=(-b+Math.sqrt(d))/(2.0*a);
			r2=(-b-Math.sqrt(d))/(2.0*a);
			System.out.println("The roots are "+r1+" and "+r2);
		}
	}
}