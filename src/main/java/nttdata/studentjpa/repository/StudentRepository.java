package nttdata.studentjpa.repository;

import nttdata.studentjpa.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {

}
