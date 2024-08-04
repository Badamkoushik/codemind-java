import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        double radius,area,perimeter;
        Scanner read=new Scanner(System.in);
        radius=read.nextInt();
        area=3.14*radius*radius;
        perimeter=2*3.14*radius;
        System.out.printf("%.2f
%.2f",area,perimeter);
    }
}