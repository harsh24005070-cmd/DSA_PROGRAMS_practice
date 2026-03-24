package DSA_PROGRAMS.BackTracking;

public class FourWaysMaze {
    public static void maze(int sc,int sr,int ec,int er,String s,boolean[][] isVisited){
        if(sr>er || sc>ec || sc<0 || sr<0)
            return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if(isVisited[sr][sc])
            return;
        isVisited[sr][sc]=true;
        // rignt
        maze(sc+1,sr,ec,er,s+"R",isVisited);
        // down
        maze(sc,sr+1,ec,er,s+"D",isVisited);
        // left
        maze(sc-1,sr,ec,er,s+"L",isVisited);
        // up
        maze(sc,sr-1,ec,er,s+"U",isVisited);
        isVisited[sr][sc]=false;
    }
    public static void main(String[] args) {
        int row=3;
        int col=2;
        boolean[][] isVisited=new boolean[row][col];
        maze(0,0,col-1,row-1,"",isVisited);
    }
}
