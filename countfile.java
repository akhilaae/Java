import java.util.*;
import java.io.*;
public class Dcoder
 {
   public static void main(String args[])
   { 
    FileReader fr=new FileReader("x.txt");
    int i,c=0,l=0,w=0;
    while((i=fr.read())!=-1){
      char ch=(char)i;
      if(ch=='\n'){
        l++;w++;
      }
      else if(ch==' '){
        w++;
      }
      else{
        c++;
      }
    }
    w++;l++;
   }
 }
