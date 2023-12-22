import java.util.*;
abstract class shape{
  public abstract int numberofsides();
}
class rect extends shape{
  public int numberofsides(){
    return 4;
  }
}
class tri extends shape{
  public int numberofsides(){
    return 3;
  }
}
class hex extends shape{
  public int numberofsides(){
    return 6;
  }
}
class poly
 {
   public static void main(String args[])
   { 
    rect r=new rect();
    System.out.println(r.numberofsides());
    tri t=new tri();
    System.out.println(t.numberofsides());
    hex h=new hex();
    System.out.println(h.numberofsides());
   }
 }
