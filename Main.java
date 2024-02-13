//Name: Utkarsha Chauhan
//Roll. no: 69
//Class: SY-1 CSE{b4}
public class Main {
   public static void main(String[] args) {
    String input = "Hello, India!" ;
    String reversed = reverseString(input);
    System.out.println("Reverse string is: "+ reversed);
   }

public static String reverseString(String input){
    StringBuilder sb=new StringBuilder(input);
     return sb.reverse().toString();
   }
}
/*PS E:\69utkarsha> javac Main.java
PS E:\69utkarsha> java  Main     
Reverse string is: !aidnI ,olleH */