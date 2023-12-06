//the armstrong number.
import java.io.*;
import java.util.Scanner;

public class ArmstrongNo {
    //int temp,rem,result=0;
    public static void main(String [] args)
    {
      int temp,rem,result=0;
      System.out.print("enter the armstrog number is ");
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      System.out.println(num); 
      temp=num;
      while(num>0)
      {
        rem=num%10;
        result=(rem*rem*rem)+result;
        num=num/10;
      }
      if (temp==result) 
      {
        System.out.println("the number is armstrong number");

        
      }
      else
      {
        System.out.println("the number is not armstrog number");
      }
    }

    
}
