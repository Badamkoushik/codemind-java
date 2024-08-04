import java.util.Scanner;
public class Example
{
    public static void main(String[] args)
    {
        int sec;
        Scanner read=new Scanner(System.in);
        sec=read.nextInt();
        System.out.printf("%d Hour(s) %d Minute(s)",sec/60,sec%60);
    }
}