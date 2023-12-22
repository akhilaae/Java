import java.util.*;
abstract interface x{
  public abstract void print();
}
class imp implements x{
  public void print(){
    System.out.println("Hello, Dcoder!");
  }
}
public class if1
 {
   public static void main(String args[])
   { 
    imp y=new imp();
    y.print();
   }
 }
