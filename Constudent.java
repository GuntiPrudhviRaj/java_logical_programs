class Constudent1
  {
    int sno;
    String sname;
    double savg;
    Constudent1()
    {
      sno=41;
      sname="Prudhvi";
      savg=58.58;
    }
     void display()
    {
      System.out.println("Student number is:"+sno);
      System.out.println("Student name is:"+sname);
      System.out.println("Student savg is:"+savg);
    }
  }
class Constudent
  {
    public static void main(String args[])
    {
      Constudent1 s=new Constudent1();
      s.display();
    }
  }