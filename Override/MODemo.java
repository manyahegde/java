package Override;

public class MoDemo {
	//Method overriding.
	int i, j;
	MoDemo (int a, int b)
	{
	i = a;
	j = b;
	}
	//display i and j
	void show()
	{
	System.out.println("i and j: " + i + " " + j);
	}
	}
	class B extends MoDemo
	{
	int k;
	B(int a, int b, int c)
	{
	super(a,b);
	k = c;
	}
	//display k – this overrides show() in A
	void show()
	{
	super.show();
	System.out.println("k: " + k);
	}
	}
