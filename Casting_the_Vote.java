import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        int n;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        if(n>=18)
        {
            System.out.printf("YES
");
        }
        else if(n<18)
        {
            System.out.printf("NO
");
        }
    }
}