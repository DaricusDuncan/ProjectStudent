import java.util.*;


public class StudentClient {
	
	public static void main(String[] args){
		
		/*
		 * Create Array list of Students (Student Objects)
		 * 
		 */
		
		List<Student> studentArray = new ArrayList<Student>();
		
		/*
		 * Create Student1 object of type Student
		 * Student(String studentName,String studentMajor,Double studentGPA, Long studentPhone, String studentBirthday)
		 * 
		 */
		
		Student student1 = new Student("John Smith","Accounting",4.00,6625123467L,"01/12/1973");
		
		// Create Student2 object
		
		
		Student student2 = new Student("Sallie Mae","Biology",3.50,6015335497L,"04/18/1985");
		
		// Create Student3 object
		
		Student student3 = new Student("Jimmy Dean","Sausage",3.97,6234759876L,"06/28/1986");
		
		// Store Student objects into Student ArrayList
		
		studentArray.add(student1);
		studentArray.add(student2);
		studentArray.add(student3);
		
		
//		StudentService studentServices = new StudentServiceImpl();
//		
//		studentServices.saveStudents(studentArray);
//		
//		System.out.println(studentServices.getStudentById(1L));
//        studentServices.deleteStudent(1L);
//        
//        studentServices.updateStudent("0", student2);
//        
//        System.out.println(studentServices.getAllStudents());
//        
		
		UUID uid = UUID.randomUUID();
		System.out.println(uid.hashCode());


		
	}

}
