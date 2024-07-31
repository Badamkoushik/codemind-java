import java.util.Scanner;
public class Example{
    public static void main(String[] args){
        float cp,sp;
        Scanner read=new Scanner(System.in);
        cp=read.nextFloat();
        sp=read.nextFloat();
        float res,res1;
        res=sp-cp;
        res1=(res/cp)*100;
        System.out.printf("%.2f",res1);
    }
}