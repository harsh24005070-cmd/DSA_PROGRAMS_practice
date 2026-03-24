import java.util.Scanner;
public class allPossibleStrings {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        allsubsets(str,"");
    }
    static void allsubsets(String str,String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            allsubsets(str.substring(0,i)+str.substring(i+1,str.length()),ans+str.charAt(i));
        }
    }
}
