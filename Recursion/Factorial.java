package DSA_PROGRAMS.Recursion;
import java.util.Scanner;
public class Factorial {
    static int fact(int n){
        if(n==1) 
        return 1 ;
        return n*fact(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=sc.nextInt();
        if(num==0)
            System.out.println(1);
        else
            System.out.println(fact(num));

    }
}
