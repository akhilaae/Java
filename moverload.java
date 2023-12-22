import java.util.*;
public class moverload
 {
   double area(int r){
     return 3.14*r*r;
   }
   double area(int l, int b){
     return l*b;
   }
   double area(int l,int b,int h){
     return 0.5*l*b;
   }
   public static void main(String args[])
   { 
    System.out.println("Enter ch : ");
    Scanner sc=new Scanner(System.in);
    int ch=sc.nextInt();
    moverload m=new moverload();
    switch(ch){
      case 1:{
        System.out.println("Radius : ");
        int r=sc.nextInt();
        System.out.println(m.area(r));
        break;
      }
      case 2:{
        System.out.println("L and B : ");
        int l=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(m.area(l,b));
        break;
      }
      case 3:{
        System.out.println("l,b,h : ");
        int l=sc.nextInt();
        int b=sc.nextInt();
        int h=sc.nextInt();
        System.out.println(m.area(l,b,h));
        break;
      }
    }
   }
 }
        