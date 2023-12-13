import java.util.Arrays;
public class EvenPositionNo {
    public static void main(String[] args) 
    {
        int arr[]=new int[]{2,3,4,5,6,7,8};
        System.out.println("print even position number");
        for (int i=1;i<arr.length;i=i+2) 
        {
            System.out.println(arr[i]);
        }
    }
    
}
