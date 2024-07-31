import java.util.Scanner;
    public class Example{
    public static void main(String[] args){
        int a;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        int res1,res2;
        res1=a*a;
        res2=a*4;
        System.out.println(res1 + " " + res2);
    }
}