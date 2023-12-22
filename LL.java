import java.util.*;
class Node{
  int data;
  Node next;
}
class linkedlist{
  Node head;
  public void insert(int item){
    Node node=new Node();
    node.data=item;
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
    Node n=new Node();
    n=head;
    Node pre=new Node();
    while(n.next!=null && n.data!=item){
      pre=n;
      n=n.next;
    }
    pre.next=n.next;
  }
}
public class Dcoder
 {
   public static void main(String args[])
   { 
    linkedlist l=new linkedlist();
    Scanner sc=new Scanner(System.in);
    int ch;
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
