// program to find first occurence of a character in a string
import java.util.Scanner;
class Stringfirstoccr
  {
    public static void main(String args[])
    {
      String str;
      char ch;
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter string to find first char occur =");
      str=sc.nextLine();

      System.out.println("\nEnter the characterto find =");
      ch=sc.next().charAt(0);
      int index = str.indexOf(ch);
       System.out.println("the first occurence of a character"+ ch + "in a string " + str +" is at index "+index);
    }
  }