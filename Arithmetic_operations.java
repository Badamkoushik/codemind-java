import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        int a,b;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        int sum,diff,pro,quo,rem;
        sum=a+b;
        diff=a-b;
        pro=a*b;
        quo=a/b;
        rem=a%b;
        System.out.printf("Sum:%d
",sum);
        System.out.printf("Difference:%d
",diff);
        System.out.printf("Product:%d
",pro);
        System.out.printf("Quotient:%d
",quo);
        System.out.printf("Remainder:%d
",rem);
    }
}