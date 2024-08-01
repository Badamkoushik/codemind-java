import java.util.Scanner;
public class Example{
    public static void main(String[] args){
        int a,b;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        int res;
        res=b/a;
        System.out.println(res);
    }
}