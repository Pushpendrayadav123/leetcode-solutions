import java.io.*;
import java.util.Arrays;
public class CopyArrayElement{
    public static void main(String[]args)
    {
        int [] arr= new int [] {13,26,39,52};
        System.out.println("print the orignal array is:");
        for(int i=0;i<arr.length;i++)
        {
             System.out.print(arr[i]+"  ");
        }
        int [] arr1= new int [arr.length];
        for(int i=0;i<arr.length;i++)
        {
            arr1[i]=arr[i];
        }
        System.out.println();
        System.out.println("print the copy element is:");
        for(int i=0;i<arr.length;i++)
        {
              System.out.print(arr1[i]+"  ");
        }
    }
}