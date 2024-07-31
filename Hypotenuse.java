import java.util.Scanner;
public class example{
    public static void main(String[] args)
    {
        float a,b,res;
        Scanner read=new Scanner(System.in);
        a=read.nextFloat();
        b=read.nextFloat();
        res=(float) Math.sqrt((a*a)+(b*b));
        System.out.printf("%.2f",res);
    }
}