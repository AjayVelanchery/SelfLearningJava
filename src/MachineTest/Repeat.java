package MachineTest;

public class Repeat {


    public static void main(String[] args) {

        System.out.println(repeat("String"));
    }
    static String repeat(String st){


        String st1="";

        for(char ch:st.toCharArray()){
            st1+=ch;
            st1+=ch;
        }
        return st1;
    }
}
