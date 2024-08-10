import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        int n;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        if(n<3)
        {
            System.out.printf("LIGHT
");
        }
        else if(n>=3&&n<7)
        {
            System.out.printf("MODERATE
");
        }
        else
        {
            System.out.printf("HEAVY
");
        }
    }
}