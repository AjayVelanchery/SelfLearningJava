package KhunalDSA.out.production.KhunalDSA.Recursion.backtracking;

public class Maze {

    public static void main(String[] args) {
        System.out.println(count(3,3));
        path(3,3,"");

    }

static int count(int r,int c){

    if(r==1||c==1){
        return 1;
    }
    int left=count(r-1,c);
    int right=count(r,c-1);
    return left+right;
}
static void path(int r,int c,String p){

        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(r>1){
            path(r-1,c,p+'D');
        }
        if(c>1){
            path(r,c-1,p+'R');
        }
}

}
