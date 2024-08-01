import java.util.Scanner;
public class Example{
    public static void main(String[] args){
        int a;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        float res;
        res=2.54f*a;
        System.out.printf("%.2f", res);
    }
}