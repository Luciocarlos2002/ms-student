package nttdata.studentjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ProjectStudentJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectStudentJpaApplication.class, args);
	}

}
