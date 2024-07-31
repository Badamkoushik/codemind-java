import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        float cp,sp,loss,res;
        Scanner read=new Scanner(System.in);
        cp=read.nextFloat();
        sp=read.nextFloat();
        loss=cp-sp;
        res=(loss/cp)*100;
        System.out.printf("%.2f",res);
    }
}