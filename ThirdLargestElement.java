public class ThirdLargestElement {
    public static void main(String[]args)
    {
        int [] arr=new int []{12,11,3,9,4};
       System.out.println("third largest element in array:"+third(arr,5));
    }
    public static int third(int []arr,int size)
    {
        int temp;
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if (arr[i]>arr[j])
                 {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp; 
                }
            }
        }    
        return arr[size-3];
    }
}
