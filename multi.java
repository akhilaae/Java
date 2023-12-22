import java.util.*;
class t1 extends Thread{
  public void run(){
    int n=1;
    while(n!=0){
      n=(int)(Math.random()*100);
      t2 b=new t2(n);
      t3 c=new t3(n);
      b.start();
      c.start();
    }
    
  }
}
class t2 extends Thread{
  int x;
  t2(int num){
    x=num;
  }
  public void run(){
    if(x%2==0){
      System.out.println("square"+x*x);
    }
  }
}
class t3 extends Thread{
  int y;
  t3(int num){
    y=num;
  }
  public void run(){
    if(y%2!=0){
      System.out.println("cube"+y*y*y);
    }
  }
}
public class multi
 {
   public static void main(String args[])
   { 
    t1 a=new t1();
    a.start();
   }
 }
