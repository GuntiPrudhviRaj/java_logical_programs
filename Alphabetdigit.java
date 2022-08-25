import java.util.Scanner;
class Alphabetdigit
  {
    public static void main(String args[])
    {
      char ch;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter any character:");
      ch=sc.next().charAt(0);

      if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
      {
        System.out.println("It is alphabet");
        if(ch>='a'&&ch<='z')
        {
          System.out.println("The alphabet is small letter:");
        }
        if(ch>='A'&&ch<='Z')
        {
          System.out.println("The alphabet is capital letter:");
        }
      }    
        else if(ch>='0'&&ch<='9')
        {
          System.out.println("It is a digit:");
        }
        else
        {
         System.out.println("it is a special character:");
        }
        
    
      
    }
  }