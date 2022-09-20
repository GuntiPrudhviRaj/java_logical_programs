class Constdemo1
  {
    int sno;
    String sname;
    double savg;
    Constdemo1(int x, String y, double z )
    {
      sno=x;
      sname=y;
      savg=z;
    }
     void display()
    {
      System.out.println("Student number is:"+sno);
      System.out.println("Student name is:"+sname);
      System.out.println("Student savg is:"+savg);
    }
  }
class Constdemo
  {
    public static void main(String args[])
    {
      int m=41;
      String n="Prudhvi";
      double o= 58.58;
      Constdemo1 s=new Constdemo1(m,n,o);
      s.display();
    }
  }