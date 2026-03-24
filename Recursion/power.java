import java.util.Scanner;
public class power {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(pow(a,b));
    }
    static int pow(int a,int b){
        if(b==1) return a;
        if(b==0) return 1;
        int half=pow(a,b/2);
        if (b%2!=0)
            return half*half*a;
        else
            return half*half;
    }
}
