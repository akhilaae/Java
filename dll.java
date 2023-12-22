import java.util.*;
class Node{
  int data;
  Node prev;
  Node next;
}
class dll{
  Node head;
  public void insert(int item){
    Node node=new Node();
    node.data=item;
    node.prev=null;
    node.next=null;
    if(head==null){
      head=node;
    }
    else{
      Node n=new Node();
      n=head;
      while(n.next!=null){
        n=n.next;
      }
      n.next=node;
    }
  }
  public void display(){
    Node n=new Node();
    n=head;
    while(n.next!=null){
      System.out.println(n.data);
      n=n.next;
    }
    System.out.println(n.data);
  }
  public void delete(int item){
    try{
      Node n=new Node();
      Node pre=new Node();
      n=head;
      //pre=head.prev;
      while(n.next!=null && n.data!=item){
        n=n.next;
        //pre=n.prev;
      }
      pre.next=n.next;
    }
    catch(NullPointerException e){
      System.out.println("handled");
    }
  }
}
public class Dcoder
 {
   public static void main(String args[])
   { 
    int ch;
    dll l=new dll();
    Scanner sc=new Scanner(System.in);
    do{
      System.out.println("1.insert\n2.display\n3.delete\nEnter choice : ");
      ch=sc.nextInt();
      switch(ch){
        case 1:{
          System.out.print("Enter item");
          int item=sc.nextInt();
          l.insert(item);
          break;
        }
        case 2:{
          l.display();
          break;
        }
        case 3:{
          System.out.print("Enter item");
          int item=sc.nextInt();
          l.delete(item);
          break;
        }
      }
    }
    while(ch<=3);
   }
 }
