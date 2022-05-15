package nttdata.studentjpa.service.impl;

import nttdata.studentjpa.model.Student;
import nttdata.studentjpa.repository.StudentRepository;
import nttdata.studentjpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getAllByIdStudent(String id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student createStudent(Student student) {
        student.setState("1");
        return studentRepository.save(student);
    }

    @Override
    public Student deleteStudent(String id) {
        Optional<Student> student = studentRepository.findById(id);
        Student student1 = null;
        if (student.isPresent()) {
            student1 = student.get();
            student1.setState("0");
        }
        return studentRepository.save(student1);
    }

    @Override
    public Student updateStudent(String id, Student student) {
        Student updateStudent = this.validation(id, student);
         return studentRepository.save(updateStudent);
    }
    public Student validation(String id ,Student student){
        Optional<Student> updateStudent = studentRepository.findById(id);
        Student student1 = new Student();
        if (updateStudent.isPresent()) {
            student1 = updateStudent.get();

            if(student.getName() != null){
                student1.setName(student.getName());
            }else {
                student1.setName(updateStudent.get().getName());
            }

            if (student.getLastName() != null){
                student1.setLastName(student.getLastName());
            }else{
                student1.setLastName(updateStudent.get().getLastName());
            }

            if (student.getPhoneNumber() != null){
                student1.setPhoneNumber(student.getPhoneNumber());
            }else{
                student1.setPhoneNumber(updateStudent.get().getPhoneNumber());
            }

            if (student.getDirection() != null){
                student1.setDirection(student.getDirection());
            }else{
                student1.setDirection(updateStudent.get().getDirection());
            }

            if (student.getState() != null){
                student1.setState(student.getState());
            }else{
                student1.setState(updateStudent.get().getState());
            }

        }
        return student1;
    }
}
