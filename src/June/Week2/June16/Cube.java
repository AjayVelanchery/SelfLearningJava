package June.Week2.June16;

public class Cube {

    int length;
    int bredth;
    int height;

    public  int getCubeVolume(){
        return (length *bredth*height);
    }

    Cube(){

//        System.out.println("we are in constructor");

        length =10;
        bredth=10;
        height=10;
    }

    Cube(int l,int b,int h){


        length =l;
        bredth=b;
        height=h;
    }
}
