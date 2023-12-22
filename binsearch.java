import java.util.*;
public class bs{
  public void search(int A[],int l,int h,int key){
    while(l<=h){
      int mid=(l+h)/2;
      if (key<A[mid]){
        h=mid-1;
      }
      else if(key>A[mid]){
        l=mid+1;
      }
      else if(key==A[mid]){
        System.out.println("Found at"+mid);
        break;
      }
    }
  }
  int p,temp;
  public int partition(int A[],int l,int r){
    p=l;
    while(l<r){
      while(A[p]<A[r] && p<r){
      r--;
    }
    if(A[p]>A[r]){
      temp=A[p];
      A[p]=A[r];
      A[r]=temp;
      p=r;
      l++;
    }
    while(A[p]>A[l] && p>l){
      l++;
    }
    if(A[p]<A[l]){
      temp=A[p];
      A[p]=A[l];
      A[l]=temp;
      p=l;
      r--;
    }
    }
    
    return p;
  }
  public void quicksort(int A[],int l,int r){
    if(l<r){
      p=partition(A,l,r);
      quicksort(A,l,p-1);
      quicksort(A,p+1,r);
    }
  }
  public void heapify(int A[],int n,int i){
    int largest=i;
    int l=2*i+1;
    int r=2*i+2;
    if(l<n && A[l]>A[largest]){
      largest=l;
    }
    if(r<n && A[r]>A[largest]){
      largest=r;
    }
    if(largest!=i){
      temp=A[i];
      A[i]=A[largest];
      A[largest]=temp;
      heapify(A,n,largest);
    }
  }
  public void heapsort(int A[],int n){
    for(int i=n/2-1;i>=0;i--){
      heapify(A,n,i);
    }
    for(int i=n-1;i>=0;i--){
      temp=A[i];
      A[i]=A[0];
      A[0]=temp;
      heapify(A,i,0);
    }
  }
  public static void main(String args[])
   { 
    int[] A=new int[10];
    Scanner sc=new Scanner(System.in);
    System.out.println("vakues : ");
    for(int i=0;i<5;i++){
      A[i]=sc.nextInt();
    }
    bs b=new bs();
    //System.out.println("item : ");
    //int item=sc.nextInt();
    //b.search(A,0,4,item);
    //b.quicksort(A,0,4);
    b.heapsort(A,5);
    for(int i=0;i<5;i++){
      System.out.println(A[i]);
    }
   }
 }
