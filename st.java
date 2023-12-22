import java.util.*;
public class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner sc=new Scanner(System.in);
    System.out.println("String : ");
    String str=sc.nextLine();
    int sum=0;
    StringTokenizer s=new StringTokenizer(str," ");
    while(s.hasMoreTokens()){
      int n=Integer.parseInt(s.nextToken());
      System.out.println(n);
      sum+=n;
    }
    System.out.println(sum);
   }
 }
