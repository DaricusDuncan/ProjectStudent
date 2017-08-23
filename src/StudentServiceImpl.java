import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.ArrayList;
import java.util.HashMap;

public class StudentServiceImpl implements StudentService{

	Map<String,Student> studentMap = new HashMap<>();
	
	
	public List<Student> getAllStudents() {
		List<Student> studentList = new ArrayList<Student>();
		for(Student each: studentMap.values()){
			studentList.add(each);
		}
		return studentList;
	}

	
	public Student getStudentById(String id) {
		
		return studentMap.get(id);
	}

	
	public Student updateStudent(String id,Student student) {
		
		if(studentMap.containsKey(id)){
			studentMap.replace(id, student);
			
		}
		else{
			System.out.println("Student could not be updated");
		}
		
		return student;
	}

	
	public List<Student> saveStudents(List<Student> students)
	{
		
		for(Student each: students){
			
			UUID uid = UUID.randomUUID();			
            studentMap.put(uid.toString(), each);
			
			
		}
		
		return students;
	}

	
	public void deleteStudent(String id) {
		
		if(studentMap.containsKey(id)){
			studentMap.remove(id);
		}
		else{
			System.out.println("Student was not found in the Map");
		}
		
	}
	
	public Set<String> getStudentKeys(){
		
		return studentMap.keySet();
	}
	

	
	
}

