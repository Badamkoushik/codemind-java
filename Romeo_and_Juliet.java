import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        int x,y,z;
        Scanner read=new Scanner(System.in);
        x=read.nextInt();
        y=read.nextInt();
        z=read.nextInt();
        int a,b,c;
        a=x*5;
        b=y*10;
        c=a+b;
        int res;
        res=c/z;
        System.out.printf("%d",res);
    }
}