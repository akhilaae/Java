import java.util.*;
class gar{
  public int i=100;
}
public class Dcoder
 {
   public static void main(String args[])
   { 
    gar g=new gar();
    g=null;
    System.gc();
    System.out.println("done");
    System.out.println(i);
   }
 }
