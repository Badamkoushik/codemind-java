import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        int days;
        Scanner read=new Scanner(System.in);
        days=read.nextInt();
        int years,weeks;
        years=days/365;
        weeks=days%365/7;
        System.out.printf("%d
",years);
        System.out.printf("%d
",weeks);
    }
}