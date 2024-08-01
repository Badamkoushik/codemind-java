import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        int avg,a;
        Scanner read=new Scanner(System.in);
        avg=read.nextInt();
        a=read.nextInt();
        int b;
        b=(2*avg-a);
        System.out.println(b);
    }
}