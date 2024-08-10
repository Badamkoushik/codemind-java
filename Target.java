import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        int a,b,c,d;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        c=read.nextInt();
        d=read.nextInt();
        if(a>=10&&b>=10&&c>=10&&d>=10)
        {
           System.out.printf("YES
");
        }
        else
        {
            System.out.printf("NO
");
        }
    }
}