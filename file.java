import java.util.*;
import java.io.*;
public class file
 {
   public static void main(String args[]) throws Exception
   { 
     try{
      FileWriter fw=new FileWriter("hehe.txt");
      Scanner sc=new Scanner(System.in);
      System.out.println("Hello, Dcoder!");
      String s = sc.nextLine();
      fw.write(s);
      System.out.println("wrote");
      fw.close();
     }
    catch(IOException e){
      System.out.println("IOexp");
    }
    try{
      FileReader fr=new FileReader("hehe.txt");
      int i;
      while((i=fr.read())!=-1){
        System.out.println((char)i);
      }
      fr.close();
    }
    catch(IOException e){
      System.out.println("IOexp");
    }
   }
 }
