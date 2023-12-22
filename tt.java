import java.util.*;
class t1 extends Thread{
  public void run(){
    int num=1;
    while(num<100){
      if(num%2==0){
        System.out.println(num);
      }
      num++;
    }
    Thread t=Thread.currentThread();
    t.setPriority(2);
  }
}
class t2 extends Thread{
  public void run(){
    int num=1;
    while(num<100){
      if(num%2!=0){
        System.out.println(num);
      }
      num++;
    }
    Thread t=Thread.currentThread();
    t.setPriority(3);
  }
}

public class Dcoder
 {
   public static void main(String args[])
   { 
    Thread t=Thread.currentThread();
    t.setPriority(1);
    t1 a=new t1();
    a.start();
    t2 b=new t2();
    b.start();
   }
 }
