package springgro.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springgro.example.demo.Entity.Student;
import springgro.example.demo.repository.StudentRepo;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;


    public Student saveDetails(Student student){
  return studentRepo.save(student);


    }

public List<Student> fetchAll(){

        return studentRepo.fetchAllfromCustom();
}
    public Student fetchUsingName(){

        return studentRepo.fetchUsingName("viijesh",2);
    }
    public Student fetchUsingMark(int mark){

        return studentRepo.fetchUsingMark(mark);
    }


}
