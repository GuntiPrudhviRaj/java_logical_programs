//WAP to count Total number of Alphabets,digits and special characters in a String?
import java.util.Scanner;
class Stringalphabets
  {
    public static void main(String args[])
    {
      String st1 = "Hello@123";
      int i,c=0,s=0,d=0,sc=0;
    
      for(i=0;i<st1.length();i++)
        {
           char ch=st1.charAt(i);
          
          if(ch>=65&&ch<=90)
          {
            c++;
          }
          else if(ch>=97&&ch<=122)
          {
            s++;
          }
          else if(ch>=48&&ch<=57)
          {
            d++;
          }
          else
          {
            sc++;
          }
        }
         System.out.println("\nThe number of capital alphabets in the string are:"+c);
      System.out.println("\nThe number of small alphabets in the string is:"+s);
      System.out.println("The number of digits is:"+d);
      System.out.println("The number of special character is:"+sc);
    }
  }