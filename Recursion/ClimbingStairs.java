// can climb at most 3 stairs at a time

import java.util.Scanner;
public class ClimbingStairs{
    public static int climbStairs(int n){
        if(n==0 || n==1)
            return 1;
        if(n==2)
            return 2;
        return climbStairs(n-1)+climbStairs(n-2)+climbStairs(n-3);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(climbStairs(n));
    }
}