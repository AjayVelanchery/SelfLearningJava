package December;

import java.util.Collections;
import java.util.Objects;

public class Student implements Comparable <Student>{
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(gpa, student.gpa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gpa);
    }

    private String name;
    private double gpa;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


    @Override
    public int compareTo(Student student) {
        return  Double.compare( student.getGpa(),this.getGpa());
    }
}
