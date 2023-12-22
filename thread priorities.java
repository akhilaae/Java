import java.io.*;
import java.util.*;
import java.lang.*;
class PThread implements Runnable{ 
  public void run(){ 
    System.out.println("Thread is running..");
  } 
} 
public class Q5 { 
  public static void main(String[] args) { 
    Thread t1=new Thread(new PThread());
    Thread t2=new Thread(new PThread());
    Thread t3=new Thread(new PThread());
    t1.setPriority(4);
    t2.setPriority(2);
    t3.setPriority(7);
    System.out.println("Priority of Thread 1:"+t1.getPriority());
    System.out.println("Priority of Thread 2:"+t2.getPriority());
    System.out.println("Priority of Thread 3:"+t3.getPriority());
    System.out.println("Sets Priority of Thread 1 to maximum and Priority of Thread 3 to minimum");
    t1.setPriority(t1.MAX_PRIORITY);
    t3.setPriority(t3.MIN_PRIORITY);
    System.out.println("Priority of Thread 1:"+t1.getPriority());
    System.out.println("Priority of Thread 3:"+t3.getPriority());
    System.out.println("Current running Thread is:"+Thread.currentThread().getName());
    System.out.println("Priority of "+Thread.currentThread().getName()+" is "+Thread.currentThread().getPriority());
    System.out.println("Sets Priority of current thread to 10");
    Thread.currentThread().setPriority(10);
    System.out.println("Priority of "+Thread.currentThread().getName()+" is "+Thread.currentThread().getPriority());
  } 
}
