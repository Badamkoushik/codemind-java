import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        int a,b;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        float res;
        res=(a+b)/2f;
        System.out.printf("Average of %d and %d is: %.2f",a,b,res);
    }
}