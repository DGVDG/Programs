//merge tow array into one array in java
import Java.Util.Scanner;
Class Mergearray {
 public static void main(String arr[]) {
    Scanner S=new Scanner(System.in);
    int size1=Integer.parseInt(arr[0]);
    int size2=Integer.parseInt(arr[1]);
    int arr1[]=new int(size1);
    int arr2[]=new int(size2);
    int size=size1+size2;
    for(int i=0;i<size1;i++) 
     {
      System.out.println("Enter element of array 1 :"+i);
      arr1[i]=s.nextInt();
     }
     for(int i=0;i<size2;i++) 
     {
      System.out.println("Enter element of array 2 :"+i);
      arr2[i]=s.nextInt();
     }
    System.out.println("Accessing array");
     for(int i=0;i<size1;i++)
      {
       System.out.println("arr1["+i+"]:"+arr1[i]);
      }
      for(int i=0;i<size2;i++)
      {
       System.out.println("arr2["+i+"]:"+arr2[i]);
      }
    System.out.println("merge array");
    for(i=0;i<size;i++)
     {
       mergearr[i]=arr1[i];
     }
    for(i=0,k=size1;k<size&&i<size2;i++,k++);
     {
       mergearr[k]=arr2[i];
     }  
    System.out.println("merge array");
    for(i=0;i<size;i++)  
     {  
       System.out.println(mergearr[i]+"   ");
     }
  }
 }
