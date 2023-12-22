import java.util.*;
class myexception extends Exception{
  public myexception(){
    super();
  }
}
class h{
  void m(){
    try{
      int age=12;
      if(age<18){
        throw new myexception();
      }
    }
    catch(myexception e){
      System.out.println("hehe12");
    }
  }
}
public class usdefex
 {
   public static void main(String args[])
   { 
    h o=new h();
    o.m();
   }
 }
