import java.util.Scanner;
   public class Que13{
	static public void main(String[] args){
      Scanner sc = new Scanner(System.in);
	int n1, totalNeg=0, totalPos=0, totalZero=0;
	
	System.out.println("Enter the 5 integer");
	n=sc.nextInt(5);
	
	 for(n<0)
	{
          totalNeg=totalNeg+1;
         System.out.println("Total of Negative number:"+totalNeg);
	}
	  
	 for(n>0)
	{
    	  totalPos=totalPos+1;
	System.out.println("Total of Positive number:"+totalPos);
	}
	 
	 for(n==0)
	{
	  totalZero=totalZero+1;
	System.out.println("Total of zero:"+totalZero);
	}
  
	 System.out.println();
}
}
