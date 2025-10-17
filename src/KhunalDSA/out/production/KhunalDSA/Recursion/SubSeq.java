package KhunalDSA.out.production.KhunalDSA.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSeq {
    public static void main(String[] args) {
      subseq("","abc");
        System.out.println(subsetret("","abc"));

        System.out.println(subseqAsciiRet("","abc"));
int []arr={1,2,2};
List<List<Integer>> ans=subsetDup(arr);
for (List<Integer>list:ans){
    System.out.println(list);
}

    }

    static void subseq(String p,String up){
if(up.isEmpty()){
    System.out.println(p);
    return;
}
        char ch=up.charAt(0);
    subseq(p+ch,up.substring(1));
    subseq(p,up.substring(1));

    }

    public static ArrayList<String> subsetret(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subsetret(p+ch,up.substring(1));
        ArrayList<String> right=subsetret(p,up.substring(1));
        
        left.addAll(right);
        return left;
    }


    static ArrayList<String> subseqAsciiRet(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch=up.charAt(0);
        ArrayList<String> first=subseqAsciiRet(p+ch,up.substring(1));
        ArrayList<String>second=subseqAsciiRet(p,up.substring(1));
        ArrayList<String>third=subseqAsciiRet(p+(ch+0),up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return  first;
    }

    static List<List<Integer>> subset(int[]arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
                List<Integer>internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
    return outer;
    }

    static List<List<Integer>> subsetDup(int[]arr){
        Arrays.sort(arr);
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());

        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            start=0;
if(i>0&&arr[i]==arr[i-1]){
    start=end+1;
}end=outer.size()-1;
            int n=outer.size();
            for(int j=start;j<n;j++){
                List<Integer>internal=new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
