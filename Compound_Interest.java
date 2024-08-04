import java.util.Scanner;
public class Example{
    public static void main(String[] args)
    {
        double p,r,t;
        Scanner read=new Scanner(System.in);
        p=read.nextDouble();
        r=read.nextDouble();
        t=read.nextDouble();
        double ci;
        ci=p*Math.pow(1+r/100.0,t)-p;
        System.out.printf("%.2f",ci);
    }
}