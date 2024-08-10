import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        int a;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        if(a>98)
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