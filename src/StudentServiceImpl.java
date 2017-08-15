import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class StudentServiceImpl implements StudentService{

	Map<Long,Object> studentMap = new HashMap<>();
	
	
	public List<Student> getAllStudents() {
		return null;
	}

	
	public Student getStudentById(Long id) {
		return null;
	}

	
	public Student updateStudent(Student student) {
		return null;
	}

	
	public List<Student> saveStudent(List<Student> student)
	{
		long idGenerator = 0L;
		
		while(studentMap.containsKey(idGenerator)){
				idGenerator++;
			}
		studentMap.put(idGenerator, student);
		
		return student;
	}

	
	public void deleteStudent(Long id) {
		
	}

	
	
}
