import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        float n;
        Scanner read=new Scanner(System.in);
        n=(Float)read.nextFloat();
        if(n<150)
        {
            System.out.printf("Person is Dwarf.");
        }
        else if(n>150&&n<=165)
        {
            System.out.printf("Person is average heighted.");
        }
        else if(n>165&&n<=195)
        {
            System.out.printf("Person is taller.");
        }
        else
        {
            System.out.printf("Abnormal height.");
        }
    }
}