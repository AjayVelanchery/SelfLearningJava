package KhunalDSA.objectandClasss;

public class Constructors {

    public static void main(String[] args) {

        Student student=new Student();
        System.out.println(student.marks);

    }
    static class Student{

        int rollno;
        String name;
        float marks;
    Student(){
        this.rollno=10;
        this.name="Ajay";
        this.marks=20;
    }

    }


}
