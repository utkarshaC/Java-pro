import java.util.Scanner;
class Addition
{
	/*
	 @param args
	*/
	public static void main(String args[])
	{
		var  sc = new Scanner(System.in);
		int num1, num2, sum;
		System.out.print("Enter the First number:  ");
		num1 = sc.nextInt();
		System.out.print("Enter the Second number:  ");
		num2 = sc.nextInt();
		sum = num1 + num2;
		System.out.print("The addition of two numbers is: " + sum);
	}
}

