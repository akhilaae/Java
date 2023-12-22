import java.util.*;
class h{
  void m() throws ArithmeticException{
    try{
      int x=5%0;
      System.out.println(x);
    }
    catch(ArithmeticException e){
      System.out.println("haha");
    }
    finally{
      System.out.println("haha12");
    }
  }
}
 public class Dcoder
 {
   public static void main(String args[])
   { 
    h o=new h();
    o.m();
   }
 }
