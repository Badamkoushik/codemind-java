import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        int test;
        Scanner read=new Scanner(System.in);
        test=read.nextInt();
        while(test>0)
        {
            int n,m,k;
            n=read.nextInt();
            m=read.nextInt();
            k=read.nextInt();
            int res=m-k;
            if(res>=n)
            {
                System.out.printf("YES
");
            }
            else
            {
                System.out.printf("NO
");
            }
            test--;
        }
    }
}