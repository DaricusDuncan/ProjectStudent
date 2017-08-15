import java.util.List;

public interface StudentService {
	
	public List<Student> getAllStudents();
    public Student getStudentById(Long id);
    public Student updateStudent(Student student);
    public List<Student> saveStudent(List<Student> student);
    public void deleteStudent(Long id);

}
