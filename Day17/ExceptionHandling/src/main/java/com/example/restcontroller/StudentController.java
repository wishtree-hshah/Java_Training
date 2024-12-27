package com.example.restcontroller;

import com.example.dto.StudentErrorResponse;
import com.example.entity.Student;
import com.example.exception.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    private List<Student> allStudents = new ArrayList<>();

    @PostMapping("/students")
    public Student addNewStudent(@RequestBody Student student){
        if(student.getId()==0){
            student.setId(allStudents.size()+1);
        }
        allStudents.add(student);
        return student;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return allStudents;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable int studentId){
        Student matchingStudent = allStudents.stream()
                .filter(student -> student.getId() == studentId)
                .findFirst()
                .orElse(null);
        if(matchingStudent == null){
            throw new StudentNotFoundException("Student not found with id: " + studentId);
        }
        return matchingStudent;
    }

    @PatchMapping("/students/{studentId}")
    public Student updateStudent(@RequestBody Student updateStudent,@PathVariable int studentId){
        Student matchingStudent = allStudents.stream()
                .filter(student -> student.getId() == studentId)
                .findFirst()
                .orElse(null);

        if(matchingStudent!=null){
            if(updateStudent.getName()!=null){
                matchingStudent.setName(updateStudent.getName());
            }
            if(updateStudent.getCity()!=null){
                matchingStudent.setCity(updateStudent.getCity());
            }
            if(updateStudent.getEmail()!=null){
                matchingStudent.setEmail(updateStudent.getEmail());
            }
            if(updateStudent.getGender()!=null) {
                matchingStudent.setGender(updateStudent.getGender());
            }
        }

        return matchingStudent;
    }

    @DeleteMapping("/students/{studentId}")
    public String deleteStudentById(@PathVariable int studentId){
        Student matchingStudent = allStudents.stream()
                .filter(student -> student.getId() == studentId)
                .findFirst()
                .orElse(null);
        allStudents.remove(matchingStudent);
        return "Student with " + studentId + " removed successfully";
    }
}
