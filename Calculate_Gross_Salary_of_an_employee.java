import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        double bs,hra,da;
        Scanner read=new Scanner(System.in);
        bs=read.nextDouble();
        hra=read.nextDouble();
        da=read.nextDouble();
        double pf=12.0/100*bs;
        double res=bs+hra+da+pf;
        System.out.printf("%.2f
%.2f",pf,res);
    }
}