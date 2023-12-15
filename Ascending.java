//short the array element in ascending order.
import java.util.Arrays;

public class Ascending {
    public static void main(String[] args) 
    {
        int temp;
        int [] arr=new int []{12,11,3,9,4};
        System.out.println("print original array element is:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if (arr[i]>arr[j])
                 {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp; 
                }
            }
            System.out.println();
             System.out.println("print the sort element in ascending order:"+arr[i]);
             
        }
       // System.out.println("print the sort element in ascending order:"+arr[i]);
    }
    
}
