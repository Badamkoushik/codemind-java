import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        int n;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        int res;
        res=n%2;
        if(res==0&&n!=2)
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