import java.util.Scanner;
public class Example{
    public static void main(String[] args){
        int avg,boy1,boy2;
        Scanner read=new Scanner(System.in);
        avg=read.nextInt();
        boy1=read.nextInt();
        boy2=read.nextInt();
        int boy3=(3*avg)-(boy1+boy2);
        System.out.println(boy3);
    }
}