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

	
	public List<Student> saveStudent(List<Student> studentList)
	{
		long idGenerator = 0L;
		
//		if(!studentMap.containsKey(idGenerator)){
//			for(Object student: studentList){
//				studentMap.put(idGenerator, student);
//				idGenerator++;
//		    }
//			
//		}else{
//			while(studentMap.containsKey(idGenerator)){
//				idGenerator++;
//			}
//		}
//		
		
		for(Object student: studentList){
			while(studentMap.containsKey(idGenerator)){
				idGenerator++;
			}
			studentMap.put(idGenerator, student);
		}
		
		
		return studentList;
	}

	
	public void deleteStudent(Long id) {
		
	}

	
	
}
