package June14;




interface Test1{
    int add(int a,int b);
}

interface Test2{
    int sub(int a,int b);
}

class Test3 implements Test1,Test2{
  public   int add(int a,int b){
        return a+b;
    }
   public int sub(int a,int b){
        return a-b;
    }
}
public class InterfaceLearning {

    public static void main(String[] args) {
        Test3 ob=new Test3();
        System.out.println(ob.add(2,3));
        System.out.println(ob.sub(3,2));
    }
}
