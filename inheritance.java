import java.util.*;
import java.lang.*;
class employee{
  String name;
  String adress;
  int phno, age, sal;
  void printsalary(){
    System.out.println(sal);
  }
}
class officer extends employee{
  String specialisation;
}
class manager extends employee{
  String department;
}
public class inheritance
 {
   public static void main(String args[])
   { 
    Scanner sc=new Scanner(System.in);
    System.out.println("INPUT name,age,phno,add,sal");
    officer o=new officer();
    System.out.println("name");
    o.name=sc.nextLine();
    System.out.println("age");
    o.age=sc.nextInt();
    System.out.println("phno");
    o.phno=sc.nextInt();
    System.out.println("add");
    o.adress=sc.nextLine();
    System.out.println("sal");
    o.sal=sc.nextInt();
    o.printsalary();
   }
 }
