import java.util.Scanner;
public class Example
{
    public static void main(String[] args){
        int a;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        float b;
        b= a*1/3.6f;
        System.out.printf("%.2f",b);
        
    }
}