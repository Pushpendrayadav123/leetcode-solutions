import java.io.*;
public class Factorial {
    public static void main(String[] args) {
        int fact;
        int n=7;
        fact=factUR(n);
        System.out.println("the factorial of"+n+"is:"+fact);
    }
    static int factUR(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return (n*factUR(n-1));
        }
    }
}
