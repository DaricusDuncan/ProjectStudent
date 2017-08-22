import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.*;

public class StudentServiceImpl implements StudentService{

	Map<Long,Student> studentMap = new HashMap<>();
	
	
	public List<Student> getAllStudents() {
		List<Student> studentList = new ArrayList<Student>();
		for(Object each: studentMap.values()){
			studentList.add((Student)each);
		}
		return studentList;
	}

	
	public Student getStudentById(String id) {
		
		return studentMap.get(id);
	}

	
	public Student updateStudent(String id,Student student) {
		
		Long longKey = Long.parseLong(id);
		if(studentMap.containsKey(longKey)){
			studentMap.replace(longKey, student);
			
		}
		else{
			System.out.println("Student could not be updated");
		}
		
		return student;
	}

	
	public List<Student> saveStudents(List<Student> students)
	{
		UUID uid = UUID.randomUUID();
		
		for(Student each: students){
			
			
		}
		
		return null;
	}

	
	public void deleteStudent(String id) {
		
		if(studentMap.containsKey(id)){
			studentMap.remove(id);
		}
		else{
			System.out.println("Student was not found in the Map");
		}
		
	}
	
	

	
	
}
