import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        int n;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        int res;
        res=n*(n+1)/2;
        System.out.printf("%d",res);
    }
}