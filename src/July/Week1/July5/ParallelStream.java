package July.Week1.July5;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStream {

    public static void main(String[] args) {


//        System.out.println(Runtime.getRuntime().availableProcessors());
////
//
//long startTime=System.currentTimeMillis();
//getStudentList()
//        .stream()
//        .filter(student ->  student.getAge()>25)
//        .forEach(student -> System.out.println(student));
//long endTime=System.currentTimeMillis();
//        System.out.println("Time taken by sequential stream "+ (endTime-startTime));
//
//
//        System.out.println("*******************************");
//
//
//
//        long startTime1=System.currentTimeMillis();
//        getStudentList()
//                .stream()
//                .parallel()
//                .filter(student ->  student.getAge()>25)
//                .forEach(student -> System.out.println(student));
//        long endTime1=System.currentTimeMillis();
//        System.out.println("Time taken by parallel stream "+ (endTime1-startTime1));

//
//
//


        getStudentList()
                .stream()
                .parallel()
                .filter(student -> {System.out.println("filter:applyig filter on student"+student.getStudentname()+"Processed by thread:"+Thread.currentThread().getName());
                        return student.getAge()>25;})
                .map(student -> student.getStudentname())
                .forEach(studentName -> System.out.println(studentName));
        getStudentList()
                .parallelStream()
                .filter(student -> student.getStudentname().startsWith("A"))
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }

















public static List<Student> getStudentList(){

    ArrayList<Student>studentList=new ArrayList<>();


    Student zareen = new Student(1, "Zareem K", 9123456780L, 21);
    Student ajay = new Student(2, "Ajay V", 9123456781L, 22);
    Student anjali = new Student(3, "Anjali S", 9123456782L, 23);
    Student rahul = new Student(4, "Rahul M", 9123456783L, 24);
    Student sneha = new Student(5, "Sneha P", 9123456784L, 26);
    Student arjun = new Student(6, "Arjun R", 9123456785L, 22);
    Student neha = new Student(7, "Neha T", 9123456786L, 21);
    Student vikram = new Student(8, "Vikram L", 9123456787L, 23);
    Student divya = new Student(9, "Divya N", 9123456788L, 26);
    Student kiran = new Student(10, "Kiran B", 9123456789L, 22);
    Student meera = new Student(11, "Meera C", 9123456790L, 25);
    Student naveen = new Student(12, "Naveen G", 9123456791L, 23);

// Now add each student to the list
    studentList.add(zareen);
    studentList.add(ajay);
    studentList.add(anjali);
    studentList.add(rahul);
    studentList.add(sneha);
    studentList.add(arjun);
    studentList.add(neha);
    studentList.add(vikram);
    studentList.add(divya);
    studentList.add(kiran);
    studentList.add(meera);
    studentList.add(naveen);

    return  studentList;
    }



}
