import java.util.Scanner;
public class Perimeter
{
public static void main(String[] utk)
{
Scanner sc = new Scanner (System.in);
System.out.print("enter the value of radius:");
double r = sc.nextDouble();
double perimeter;
double area;
if(r<=0){
System.out.print("Please Enter Non-zero Positive Integer");
System.exit(1);
}
perimeter=2*Math.PI*r;
area=(Math.PI)*r*r;
System.out.println("perimeter:"+perimeter);
System.out.println("area:"+area);
}
}