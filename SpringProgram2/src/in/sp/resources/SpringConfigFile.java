package in.sp.resources;

import in.sp.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {

    @Bean
    public  Student  stdId1(){
        Student std=new Student();
        std.setName("amit");
        std.setRollno(103);
        std.setEmail("anut@gmail.com");
        return std;
    }
}
