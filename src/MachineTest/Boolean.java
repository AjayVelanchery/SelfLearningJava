package MachineTest;

import java.util.Arrays;

public class Boolean {
    public static void main(String[] args) {
String []arr={"bridgeon", "10101", "3.14","53", "bridgeon"};
        System.out.println(Arrays.toString(opposite(arr)));    }

    static boolean[] opposite(String arr[]){
        boolean []s1=new boolean[arr.length];
        boolean result=true;
        for(int i=0;i<arr.length;i++){


            if(arr[i]=="bridgeon"){
               result= !result;
                s1[i]=result;
            }

        }
        return s1;
    }
}
