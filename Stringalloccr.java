// program to all  occurence of a character in a string
import java.util.Scanner;
class Stringalloccr
  {
    public static void main(String args[])
    {
      String str;
      char ch;
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter string to last first  all occur:");
      str=sc.nextLine();

      System.out.println("\nEnter the characterto find =");
      ch=sc.next().charAt(0);

      int count=0;
       for(int i=0; i<str.length();i++ )
         {
           if(str.charAt(i)==ch)
           {
             System.out.println("the character "+ch+" appears at index "+i);
             count++;
           }
         }
       System.out.println("the character "+ch+" appears at "+count+" times:");
    }
  }