import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        double a,b;
        Scanner read=new Scanner(System.in);
        a=read.nextDouble();
        b=read.nextDouble();
        if(a>=b)
        {
            System.out.printf("%.0f",a);
        }
        else if(b>=a) 
        {
            System.out.printf("%.0f",b);
        }
    }
}