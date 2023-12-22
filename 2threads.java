import java.io.*;
import java.util.*;
class even implements Runnable {
  public void run() {
    System.out.println("Even numbers are");
    for (int i = 0; i <= 100; i++) { 
      if (i % 2 == 0) { 
        System.out.print(i+" ");
      } 
    } 
  } 
} 
class odd implements Runnable { 
  public void run() { 
    System.out.println("\nOdd numbers are");
    for (int i = 0; i <= 100; i++) { 
      if (i % 2 == 1) { 
        System.out.print(i+" ");
      } 
    } 
  } 
} 
public class Q4 { 
  public static void main(String[] args) 
  { 
    try{ 
      Thread t1 = new Thread(new even());
      Thread t2 = new Thread(new odd());
      t1.start();
      t1.join();
      t2.start();
    }
    catch(InterruptedException e){ 
      e.printStackTrace();
    } 
  } 
}
