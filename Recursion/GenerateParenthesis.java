public class GenerateParenthesis{
    public static void generate(String ans,int n,int open,int close){
        if(close==n){
            System.out.println(ans);
            return;
        }
        if(open<n){
            generate(ans+"(",n,open+1,close);
        }
        if(close<n && close<open){
            generate(ans+")",n,open,close+1);
        }
    }
    public static void main(String[] args){
        
        generate("",4,0,0);
    }
}