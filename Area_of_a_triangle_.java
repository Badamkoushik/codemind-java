import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        double base,height;
        Scanner read=new Scanner(System.in);
        base=read.nextDouble();
        height=read.nextDouble();
        double res;
        res=0.5*base*height;
        System.out.printf("%.0f",res);
    }
}