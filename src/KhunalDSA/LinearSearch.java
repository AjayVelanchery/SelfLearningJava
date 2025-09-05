package KhunalDSA;

public class LinearSearch {


    public static void main(String[] args) {

//        String name="Ajay";
//        char target='u';
//
//        System.out.println(search(name,target));


        int [][]arr={{2,3,4,5,6},
        {3,4,5,6},
                {33,4,5,31}};
    int target=5;

        System.out.println(search2d(arr,target));
    }

    static boolean search2d(int [][]arr,int target){

        for(int row=0;row< arr.length;row++){

            for(int column=0;column<arr[row].length;column++){

                if(arr[row][column]==target){
                    return true;
                }
            }
        }
        return false;
    }


    static char search(String ch,char c){

        for(char c1:ch.toCharArray()){
            if(c1==c){
                return c;
            }
        }
    return '1';
    }

}
