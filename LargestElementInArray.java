import java.util.Scanner;
//import java.io.*;

public class LargestElementInArray {
    public static void main(String[]args)
    {
       int max,n;
       System.out.println("enter the array size");
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("enter the array element");
       for(int i=0;i<n;i++)
       {
          arr[i]=sc.nextInt();
       }
       System.out.println("print the array element");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("print the largest element in array");
        max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
           if (arr[i]>max) 
           {
            max=arr[i];
           }
        }
        System.out.println("the largest number in array is:" +max);
    }
}
