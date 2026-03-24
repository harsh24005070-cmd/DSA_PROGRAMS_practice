public class Maze2Ways {
    public static int maze(int sc,int sr,int ec,int er){
        if(sc>ec||sr>er)
            return 0;
        if(sc==ec && sr==er)
            return 1;
        // if(sc==ec)
        //     return maze(sc,sr+1,ec,er);
        // if(sr==er)
        //     return maze(sc+1,sr,ec,er);
        return maze(sc+1,sr,ec,er)+maze(sc,sr+1,ec,er);
    }
    public static void main(String[] args) {
        System.out.println(maze(1,1,3,4));
    }
}
