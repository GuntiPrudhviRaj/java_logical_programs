import java.util.Scanner;
class Product
  {
    public static void main(String args[])
    {
      int pno;
      String pname;
      float pcost,pqty;
      float bill;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the product number:");
      pno=sc.nextInt();
      System.out.println("enter the product name:");
      pname=sc.next();
      System.out.println("enter the product cost:");
      pcost=sc.nextFloat();
      System.out.println("enter the product quantity:");
      pqty=sc.nextFloat();
      bill=pcost*pqty;

      System.out.println("print the product number:"+pno);
      System.out.println("print the product name:"+pname);
      System.out.println("print the product cost:"+pcost);
      System.out.println("print the product quantity:"+pqty);
      System.out.println("print the product bill:"+bill);
      
      
      
    }
  }