import java.util.*;
import java.io.*;
public class Dcoder
 {
   public static void main(String args[])
   { 
    FileReader fr=new FileReader("x.txt");
    int i,k=2;
    System.out.println("1.");
    while((i=fr.read())!=-1){
      if((char)i=='\n'){
        System.out.println(k+".");
        k++;
      }
      else{
        System.out.println((char)i);
      }
    }
    fr.close();
   }
 }
