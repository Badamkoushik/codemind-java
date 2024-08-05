import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
       double x;
       Scanner read=new Scanner(System.in);
       x=read.nextDouble();
       double res;
       res=4*x;
       if(res<=1000) {
           System.out.printf("YES
");
       }
       else if(res>1000)
       {
           System.out.printf("NO
");
       }
    }
}