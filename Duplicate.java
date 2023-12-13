import java.util.Arrays;
public class Duplicate {
    public static void main(String[]args)
    {
        int n;
        int array[]=new int []{1,3,5,3,6,5,7,6};
        System.out.println("print duplict element is:");
        for (int i = 0; i < array.length; i++)
         {
            for (int  j= i+1; j < array.length; j++) 
            {

               if (array[i]==array[j])
               {
                System.out.println(array[j]);
               } 
            }
        }
        
    }
}
