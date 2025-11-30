package MachineTest;

public class MaxWord {


    public static void main(String[] args) {

        String[] words={"hello world"};
        System.out.println(MaxWord.maxWords(words));

    }

    public static int maxWords(String []arr){

        int max=0;
        for(String sentence:arr) {

        String []words=sentence.trim().split("\\s+");

        int wordCount=words.length;
        max=Math.max(max,wordCount);

        }






        return max;
    }
}
