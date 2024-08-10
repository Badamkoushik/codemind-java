import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        int x1,y1,x2,y2;
        Scanner read=new Scanner(System.in);
        x1=read.nextInt();
        y1=read.nextInt();
        x2=read.nextInt();
        y2=read.nextInt();
        int res1,res2;
        res1=x1+y1;
        res2=x2+y2;
        if(res1<res2)
        {
           System.out.printf("%d
",res1);
        }
        else
        {
           System.out.printf("%d
",res2); 
        }
    }
}