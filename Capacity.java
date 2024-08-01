import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        c=read.nextInt();
        int res;
        res=2*a*b*c*512;
        int res1;
        res1=res/1024;
        System.out.printf("%d KB",res1);
    }
}