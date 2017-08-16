import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.*;

public class StudentServiceImpl implements StudentService{

	Map<Long,Object> studentMap = new HashMap<>();
	
	
	public List<Student> getAllStudents() {
		List<Student> studentList = new ArrayList<Student>();
		for(Object each: studentMap.values()){
			studentList.add((Student)each);
		}
		return studentList;
	}

	
	public Student getStudentById(Long id) {
		Student student = new Student();
		student = (Student) studentMap.get(id);
		
		return student;
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
	
	public Set<Long> getKeys(){
		Set<Long> keySet = studentMap.keySet();
		return keySet;
	}

	
	
}
