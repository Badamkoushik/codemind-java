import java.util.Scanner;
public class Example{
public static void main(String[] args){
    int sec,H,M,S;
    Scanner read=new Scanner(System.in);
    sec=read.nextInt();
    H=sec/3600;
    M=(sec%3600)/60;
    S=sec%60;
    System.out.printf("H:M:S-%d:%d:%d",H,M,S);
}
}