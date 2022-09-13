//write a java program to count the words in a string
import java.util.Scanner;
class Stringwordcount
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter any string");                         
      String str=sc.nextLine();


      String[] words=str.split(" ");
      int count=0;

      for(int i=0;i<words.length;i++)
        count++;
      System.out.println("Stringwordcount:"+count);
    }
  }