import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        int n;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        if(n>40)
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