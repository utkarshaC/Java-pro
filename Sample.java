import java.util.Scanner;
class Sample
{static int x = 10; 
static void display()
{
x++;
System.out.println (" x value is = " + x);
}
}
class SDemo
{
public static void main(String args[])
{
System.out.print("Calling static method using Class name :"); 
Sample.display();
Sample s1 = new Sample ();
System.out.print("Calling static method using Object name : "); 
s1.display();
}
}