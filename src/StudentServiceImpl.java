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

	
	public List<Student> saveStudents(List<Student> students)
	{
		long idGenerator = 0L;
		
		if(!studentMap.containsKey(idGenerator)){
			for(Object each: students){
				studentMap.put(idGenerator, each);
				idGenerator++;
		    }
			
		}else{
			while(studentMap.containsKey(idGenerator)){
				idGenerator++;
			}
		}
		
		return students;
	}

	
	public void deleteStudent(Long id) {
		
		if(studentMap.containsKey(id)){
			studentMap.remove(id);
		}
		else{
			System.out.println("Student was not found in the Map");
		}
		
	}

	
	
}
