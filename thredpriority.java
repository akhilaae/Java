import java.util.*;
class a extends Thread{
  public void run(){
    System.out.println("haha");
  }
}
class b extends Thread{
  public void run(){
    System.out.println("qwerty");
  }
}
public class Dcoder
 {
   public static void main(String args[])
   { 
    a t1=new a();
    b t2=new b();
    t1.setPriority(6);
    t2.setPriority(7);
    System.out.println(t1.getPriority());
    System.out.println(t2.getPriority());
    Thread t=Thread.currentThread();
    System.out.println(t.getName());
    t.setPriority(1);
    System.out.println(t.getPriority());
   }
 }
