//Constuctor overloading
class Constdemo2
  {
    int sno;
    String sname;
    double savg;
    Constdemo2()
    {
      System.out.println("Its non parametrized constuctor:");
    }
     Constdemo2(int n)
    {
      System.out.println("Student number is:"+n);
    }
    Constdemo2(int x,String y,double z)
    {
      sno=x;
      sname=y;
      savg=z;
    }
    void display()
    {
      System.out.println("the given student number is:"+sno);
      System.out.println("the given student name is:"+sname);
      System.out.println("the given student average is:"+savg);
    }
  }  
class Constoverloading
  {
    public static void main(String args[])
    {
      int a=41;
      String b="Prudhvi";
      double c=75.76;
      Constdemo2 s1=new Constdemo2(a,b,c);
      s1.display();
      Constdemo2 s2=new Constdemo2(42);
      Constdemo2 s3=new Constdemo2();
    }
  }