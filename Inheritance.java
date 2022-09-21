//multiple inheritance
import java.util.Scanner;
class Base
  {
    Scanner sc=new Scanner(System.in);
    int sno;
    String sname;
    double phy,chem,maths,stotal,savg;

      void read()
    {
      System.out.println("Enter student number:");
      sno=sc.nextInt();
      System.out.println("Enter student name:");
      sname=sc.next();
      System.out.println("Enter phy marks:");
      phy=sc.nextDouble();
      System.out.println("Enter chem marks:");
      chem=sc.nextDouble();
      System.out.println("Enter maths marks:");
      maths=sc.nextDouble();
    }
  
  }
  class derive1 extends Base
    {
      void calculate()
      {
        stotal=phy+chem+maths;
        savg=stotal/3;
        
      }
      
    }
   class derive2 extends derive1
     {
       void report()
       {
         System.out.println(" the student number is:"+sno);
         System.out.println(" the student name is:"+sname);
         System.out.println(" the student phy marks is:"+phy);
         System.out.println(" the student chem marks is:"+chem);
         System.out.println(" the student maths marks is:"+maths);
         System.out.println(" the student total marks is:"+stotal);
         System.out.println(" the student average marks is:"+savg);
       }
     }
  class Inheritance
    {
      public static void main(String args[])
      {
        derive2 d2=new derive2();
        d2.read();
        d2.calculate();
        d2.report();
      }
    }
    