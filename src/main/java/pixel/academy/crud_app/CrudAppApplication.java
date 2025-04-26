package pixel.academy.crud_app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pixel.academy.crud_app.dao.StudentDAO;
import pixel.academy.crud_app.entity.Student;


@SpringBootApplication
public class CrudAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			//createStudent(studentDAO);

			readStudent(StudentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		// create a Student object
		System.out.println("Creating new student object ...");
		Student newStudent = new Student("John", "Doe", "john@pixelacademy.md");


		// save the Student object to the database using DAO
		System.out.println("Saving the student ...");
		studentDAO.save(newStudent);

		// display the ID of the saved student
		System.out.println("Saved student. Generated id: " + newStudent.getId());

	}

	private  void readStudent(StudentDAO studentDAO) {

	}

}
