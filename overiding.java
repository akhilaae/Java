import java.util.*;
class employee{
  void display(){
    System.out.println("EMPLOYEE...");
  };
  void calcsalary(){
    System.out.println("1000");
  }
}
class engineer extends employee{
  void display(){
    System.out.println("ENGINEER...");
  };
  void calcsalary(){
    System.out.println("2000");
  }
}
public class overiding
 {
   public static void main(String args[])
   { 
    engineer e=new engineer();
    e.display();
    e.calcsalary();
   }
 }
