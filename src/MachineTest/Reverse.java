package MachineTest;

public class Reverse {

    public static void main(String[] args) {
        String s="!trams era uoY";
        String st="";
        for(int i=s.length()-1;i>=0;i--){
            st+=s.charAt(i);

        }
        System.out.println(st);
    }
}
