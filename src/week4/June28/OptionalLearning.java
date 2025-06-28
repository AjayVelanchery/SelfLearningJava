package week4.June28;

import java.util.Optional;

public class OptionalLearning {
    public static void main(String[] args) {

        String[] s=new String[10];
//     String word=s[5].toLowerCase();
        s[3]="Hai Ajay";
        System.out.println(s[3]);
     Optional<String>empty=Optional.ofNullable(s[3]);
     Optional<String>empty1=Optional.ofNullable(s[2]);
        System.out.println(empty1);
        System.out.println(empty1.orElse("Ajay"));

        System.out.println(empty);


    }
}
