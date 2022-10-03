import java.io.*;
class StringBuffered
{
  public static void main(String args[])throws IOException 
  {
     String st1;
    InputStreamReader in=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(in);
// BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Enter Any Character:");
    st1=br.readLine();

    System.out.println("The Given string is :"+st1); 
  }
}