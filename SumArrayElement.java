import java.util.Scanner;
import java.util.Arrays;
public class SumArrayElement {
    public static void main(String[] args) 
    {
        int sum=0;
        int arr[]=new int[]{22,12,11,14,15};
        System.out.println("sum of array element is:");
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
    
}
