package ProdCons;

class Q
{
int n;
boolean valueSet=false;
synchronized int get()
{
if(!valueSet)
try
{
wait();
}
catch(InterruptedException e)
{
System.out.println("Interrupted Exception caught");
}
System.out.println("Got:"+n);
valueSet=false;
try
{
Thread.sleep(500);
}
catch (InterruptedException e)
{
e.printStackTrace();
}
notify();
return n;
}
synchronized void put(int n)
{
if(valueSet)
try
{
wait();
}
catch(InterruptedException e)
{
System.out.println("Interrupted Exception caught");
}
this.n=n;
valueSet=true;
System.out.println("Put:"+n);
try
{
Thread.sleep(500);
}
catch (InterruptedException e)
{
e.printStackTrace();
}
notify();
}
}
class Producer implements Runnable
{
Q q;
Producer(Q q)
{
this.q=q;

new Thread(this,"Producer").start();
}
public void run()
{
int i=0;
while(true)
{
q.put(i++);
}
}
}
class Consumer implements Runnable
{
Q q;
Consumer(Q q)
{
this.q=q;
new Thread(this,"Consumer").start();
}
public void run()
{
while(true)
{
q.get();
}
}
}
public class ProdCons
{
public static void main(String[] args)
{
Q q=new Q();
new Producer(q);
new Consumer(q);
}
}