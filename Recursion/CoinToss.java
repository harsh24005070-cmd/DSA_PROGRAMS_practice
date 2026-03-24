import java.util.*;
public class CoinToss {
    // for accessing with an object
    public void display(int n,String ans){
        toss(n,ans);
    }

    static void toss(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        toss(n-1,ans+"H");
        toss(n-1,ans+"T");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of coins : ");
        int n=sc.nextInt();
        toss(n,"");
    }
}
