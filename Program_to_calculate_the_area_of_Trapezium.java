import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        double base1,base2,height;
        Scanner read=new Scanner(System.in);
        base1=read.nextDouble();
        base2=read.nextDouble();
        height=read.nextDouble();
        double area;
        area=(base1+base2)*height/2;
        System.out.printf("%.4f",area);
    }
}