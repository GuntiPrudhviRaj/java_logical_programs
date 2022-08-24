import java.util.Scanner;
class Result
  {
    public static void main(String args[])
    {
      int sno;
      String ename;
      float phy,maths,chem;
      float stotal;
      float savg;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the student number:");
      sno=sc.nextInt();
      System.out.println("enter the ename:");
      ename=sc.next();
      System.out.println("enter the  phymarks:");
      phy=sc.nextFloat();
      System.out.println("enter the mathsmarks:");
      maths=sc.nextFloat();
      System.out.println("enter the chemmarks:");
      chem=sc.nextFloat();
      stotal=phy+maths+chem;
      savg=stotal/3;
      System.out.println("print the student number:"+sno);
      System.out.println("print the student name:"+ename);
      System.out.println("print the phymarks:"+phy);
      System.out.println("print the mathmarks:"+maths);
      System.out.println("print the chemmarks:"+chem);
      System.out.println("print the total marks:"+stotal);
      System.out.println("print the average marks:"+savg);
      //To check whether student Pass or Fail

      if(phy>=40&&maths>=40&&chem>=0)
      {
        System.out.println("the result is pass:");
      
        if(savg<=50)
        {
          System.out.println("the Grade:C");
        }  
          else if(savg>=51&&savg<=70)
          {  
            System.out.println("the Grade:B");
          }  
          else if(savg>=71&&savg<=80)
          {  
            System.out.println("the Grade:A");
          } 
          else if(savg>80) 
          {  
            System.out.println("Student Pass in Distinction:");
          }
      }
            else
             {
               System.out.println("the result is fail:");
             }
    }
  }





  
 
        
      
    
    

    
    
    
  
