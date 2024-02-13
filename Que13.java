import java.util.Scanner;
   public class Que13{
	static public void main(String[] args){
      Scanner sc = new Scanner(System.in);
	int n1, n2, n3, n4, n5, totalNeg=0, totalPos=0, totalZero=0;
	
	System.out.println("Enter the 1st integer");
	n1=sc.nextInt();
	
	System.out.println("Enter the 2st integer");
	n2=sc.nextInt();
	
	System.out.println("Enter the 3st integer");
	n3=sc.nextInt();
	
	System.out.println("Enter the 4st integer");
	n4=sc.nextInt();
	
	System.out.println("Enter the 5st integer");
	n5=sc.nextInt();

          if(n1<0){
           totalNeg=totalNeg+1;}
	  if(n2<0){
           totalNeg=totalNeg+1;}
	  if(n3<0){
           totalNeg=totalNeg+1;}
	  if(n4<0){
           totalNeg=totalNeg+1;}
	  if(n5<0){
           totalNeg=totalNeg+1;}
    
	  
	  if(n1>0){
    	   totalPos=totalPos+1;}
	  if(n2>0){
    	   totalPos=totalPos+1;}
	  if(n3>0){
    	   totalPos=totalPos+1;}
	  if(n4>0){
    	   totalPos=totalPos+1;}
	  if(n5>0){
    	   totalPos=totalPos+1;}

  	  if(n1==0){
	  totalZero=totalZero+1;}
	  if(n2==0){
	  totalZero=totalZero+1;}
	  if(n3==0){
	  totalZero=totalZero+1;}
	  if(n4==0){
	  totalZero=totalZero+1;}
	  if(n5==0){
	  totalZero=totalZero+1;}
 
   System.out.println();
   System.out.println("Total of Negative number:"+totalNeg);
   System.out.println("Total of Positive number:"+totalPos);
   System.out.println("Total of zero:"+totalZero);
}
}
