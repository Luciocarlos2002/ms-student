package nttdata.studentjpa.service;

import nttdata.studentjpa.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getAllStudent();
    Optional<Student> getAllByIdStudent(String id);
    Student createStudent(Student student);
    Student deleteStudent(String id);
    Student updateStudent(String id, Student student);
}
