import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        int a,b;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        if(a>b)
        {
            int res;
            res=a-b;
            System.out.printf("%d
",res);
        }
        else
        {
            System.out.printf("0
");
        }
    }
}