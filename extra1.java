import java.util.*;
class Rectangle{
  int l,b;
    Rectangle(int len,int bred){
    this.l=len;
    this.b=bred;
  }
  int area(){
    return l*b;
  }
  int peri(){
    return 2*(l+b);
  }
  
}
class Square extends Rectangle{
  int s;
  Square(int side){
    s=side;
  }
  int area(int side){
    return s*s;
  }
  int peri(int side){
    return 4*s;
  }
}

 class extra1
 {
   public static void main(String args[])
   { 
    System.out.println("Enter l b : ");
    Scanner sc=new Scanner(System.in);
    int len=sc.nextInt();
    int bred=sc.nextInt();
    int side=sc.nextInt();
    Rectangle r = new Rectangle(len,bred);
    Square s = new Square(side);
    System.out.println("Area R = "+s.area());
    System.out.println("Area S = "+s.area(side));
   System.out.println("Perimeter R = "+s.peri());
   System.out.println("Perimeter S = "+s.peri(side));
   }
 }
