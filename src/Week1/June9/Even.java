package Week1.June9;

public class Even {

    public static void main(String[] args) {




    int [] arr={3,4,3,2};
    int [ ]ev=new int[arr.length];
    int []od=new int[arr.length];
    int evi=0;int odi=0;

    for(int i=0;i<arr.length;i++){

        if(arr[i]%2==0){
            ev[evi]=arr[i];
            evi++;
        }
        else{
            od[odi]=arr[i];
            odi++;
        }

    }
        System.out.println("Even numbers");
    for (int i=0;i<evi;i++)
    {
        System.out.println(ev[i]+" ");
    }

        System.out.println("Odd numbers");
    for(int i=0;i<odi;i++){
        System.out.println(od[i]+" ");
    }
    }
}
