import java.util.List;

public interface StudentService {
	
	public List<Student> getAllStudents();
    public Student getStudentById(Long id);
    public Student updateStudent(String id,Student student);
    public List<Student> saveStudents(List<Student> student);
    public void deleteStudent(Long id);

}
