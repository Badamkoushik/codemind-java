import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        double a,b;
        Scanner read=new Scanner(System.in);
        a=read.nextDouble();
        b=read.nextDouble();
        double res;
        res=2*b;
        if(res<=a){
            System.out.printf("YES");
        }
        else
        {
            System.out.printf("NO
");
        }
    }
}