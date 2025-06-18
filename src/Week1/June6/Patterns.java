package Week1.June6;

public class Patterns {

    public static void main(String[] args) {


//         for(int i=0;i<=4;i++){
//
//             for(int j=1;j<=i;j++){
//
//                 System.out.print(j+" ");
//
//
//             }
//             System.out.println(" ");
//         }

//        for(int i=1;i<=4;i++){
//
//            for(int j=1;j<=4;j++){
//
//                System.out.print(j+" ");
//
//
//            }
//            System.out.println(" ");
//        }
//        for(int i=1;i<=4;i++){
//
//            for(int j=1;j<=5-i;j++){
//
//                System.out.print(j+" ");
//
//
//            }
//            System.out.println(" ");
//        }

//
//        for(int i=1;i<=5;i++){
//
//            for(int j=1;j<=5;j++){
//
//                if(j>5-i){
//                   {
//                       System.out.print("* ");
//
//                   }
//
//
//            }
//            else {
//                    System.out.print("  ");}
//            }
//            System.out.println();
//        }

//        for(int i=1;i<=5;i++){
//
//            for(int j=1;j<=5;j++){
//
//                if(j>=i&&j<=5){
//                    {
//                        System.out.print(" *");
//
//                    }
//
//
//                }
//                else {
//                    System.out.print("  ");}
//            }
//            System.out.println();
//        }

//       for(int i=1;i<=5;i++){
//
//            for(int j=1;j<=9;j++){
//
//                if(j>=6-i&&j<=i+4){
//                    {
//                        System.out.print("* ");
//
//                    }
//
//
//                }
//                else {
//                    System.out.print("  ");}
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=5;i++){
//
//            for(int j=1;j<=9;j++){
//
//                if(j>=i&&j<=10-i){
//                    {
//                        System.out.print("* ");
//
//                    }
//
//
//                }
//                else {
//                    System.out.print("  ");}
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=5;i++){
//
//            for(int j=1;j<=9;j++){
//
//                if(j>=6-i&&j<=i+4){
//                    {
//                        System.out.print("* ");
//
//                    }
//
//
//                }
//                else {
//                    System.out.print("  ");}
//            }
//            System.out.println();
//        }
//
//        for(int i=2;i<=5;i++){
//
//            for(int j=1;j<=9;j++){
//
//                if(j>=i&&j<=10-i){
//                    {
//                        System.out.print("* ");
//
//                    }
//
//
//                }
//                else {
//                    System.out.print("  ");}
//            }
//            System.out.println();
//        }

//
//         for(int i=1;i<=5;i++){
//                int k=5;
//             for ( int j=1;j<=i;j++){
//
//                 System.out.print(k+" ");
//                 k--;
//
//             }
//
//             System.out.println();
//         }

    int k=6;
        for(int i=1;i<=5;i++){
         k--;
            for(int j=1;j<=9;j++){

                if(j>=6-i&&j<=i+4){
                    {
                        System.out.print(k + " ");

                    }


                }
                else {
                    System.out.print("  ");}
            }
            System.out.println();
        }



    }
}
