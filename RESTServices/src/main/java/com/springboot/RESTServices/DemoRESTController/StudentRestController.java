package com.springboot.RESTServices.DemoRESTController;

import com.springboot.RESTServices.Entity.Student;
import jakarta.annotation.PostConstruct;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents = new ArrayList<Student>();
    @PostConstruct
    public void loadData(){
        theStudents.add(new Student("Poornima","Patel"));
        theStudents.add(new Student("Kruthik","BS"));
        theStudents.add(new Student("Loki","God of Mischief"));
        theStudents.add(new Student("Wade","Willson aka Deadpool"));
    }

    //define an endpoint to get a student using studentID
    @GetMapping("/students/{studentID}")
    //StudentId above in getMapping and below function should have same name
    public Student getStudentAtIndex(@PathVariable int studentID){
        //Here index stands for student ID

        if(studentID>=theStudents.size() || studentID<0 ){
            throw new StudentNotFoundException("Student id not found - "+ studentID);
        }

        return theStudents.get(studentID);
    }

    //define an endpoint to get list of students
    @GetMapping("/students")
    public List<Student> getStudents(){
        return theStudents;
    }
}

