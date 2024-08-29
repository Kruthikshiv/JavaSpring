package com.springboot.RESTServices.DemoRESTController;

import com.springboot.RESTServices.Entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents(){

        List<Student> theStudents = new ArrayList<Student>();
        theStudents.add(new Student("Poornima","Patel"));
        theStudents.add(new Student("Kruthik","BS"));
        theStudents.add(new Student("Loki","God of Mischief"));
        theStudents.add(new Student("Wade","Willson aka Deadpool"));
        return theStudents;
    }
}
