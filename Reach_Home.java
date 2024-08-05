import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        double a,b;
        Scanner read=new Scanner(System.in);
        a=read.nextDouble();
        b=read.nextDouble();
        double res;
        res=a*5;
        if(res>=b) {
            System.out.printf("YES");
        }
        else if(res<b){
           System.out.printf("NO"); 
        }  
    }
}