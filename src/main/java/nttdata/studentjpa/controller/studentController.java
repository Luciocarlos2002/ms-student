package nttdata.studentjpa.controller;

import nttdata.studentjpa.model.Student;
import nttdata.studentjpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class studentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/allStudents")
    public List<Student> getAllStudents(){
        return studentService.getAllStudent();
    }

    @GetMapping(value = "/{id}")
    public Optional<Student> getAllByIdStudent(@PathVariable String id){
        return studentService.getAllByIdStudent(id);
    }

    @PostMapping(value = "/create")
    public Student getCreatStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @PutMapping(value = "/delete/{id}")
    public Student getDeleteStudent(@PathVariable String id){
        return studentService.deleteStudent(id);
    }

    @PutMapping(value = "/update/{id}")
    public Student getUpdateStudent(@PathVariable String id, @RequestBody Student student){
        return studentService.updateStudent(id, student);
    }

}
