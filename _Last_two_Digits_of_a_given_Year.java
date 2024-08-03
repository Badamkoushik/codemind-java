import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        int yr;
        Scanner read=new Scanner(System.in);
        yr=read.nextInt();
        int res=yr%100;
        System.out.printf("%02d",res);
    }
}