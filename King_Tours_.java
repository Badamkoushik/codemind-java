import java.util.Scanner;
public class Example{
    public static void main(String[] args){
        int a,b;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        int res;
        res=(a*5)+(b*7);
        System.out.println(res);
    }
}