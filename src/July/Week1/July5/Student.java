package July.Week1.July5;

public class Student {
private int id;
private String studentname;
private long mobilenumber;
private  int age;

    public Student(int id, String studentname, long mobilenumber, int age) {
        this.id = id;
        this.studentname = studentname;
        this.mobilenumber = mobilenumber;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public long getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(long mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentname='" + studentname + '\'' +
                ", mobilenumber=" + mobilenumber +
                ", age=" + age +
                '}';
    }
}
