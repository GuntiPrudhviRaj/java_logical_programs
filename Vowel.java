// to check the given character is Vowel or Consonnent
import java.util.Scanner;
class Vowel
  {
    public static void main(String args[])
    {
      char ch;
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter any character:");
      ch=sc.next().charAt(0);

      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
      {
        System.out.println("Its Vowel:");
      }
      else
      {
        System.out.println("Its Consonent:"); 
      }
      }
    }
  