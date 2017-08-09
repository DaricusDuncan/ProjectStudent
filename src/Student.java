
public class Student {
	
	
	private String name;
	private String major;
	private double gpa;
	private Long phone;
	private String birthday;
	
	Student(){
		
		
			
	}
	
	Student(String studentName,String studentMajor,Double studentGPA, Long studentPhone, String studentBirthday){
		
	this.name = studentName;
	this.major = studentMajor;
	this.gpa = studentGPA;
	this.phone = studentPhone;
	this.birthday = studentBirthday;
	
		
	}
	
	
	
	public void setName(String name){
		 this.name = name;
	}
	
	public void setMajor(String major){
		 this.major = major;
	}
	
	public void setGPA(Double gpa){
		 this.gpa = gpa;
	}
	
	public void setPhone( Long phone){
		 this.phone = phone;
	}
	
	public void setBirthday(String birthday){
		 this.birthday = birthday;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getMajor(){
		return this.major;
	}
	
	public Double getGPA(){
		return this.gpa;
	}
	
	public Long getPhone(){
		return this.phone;
	}
	
	public String getBirthday(){
		return this.birthday;
	}
	
	public void getProperties(){
		
		System.out.println(this.getName());
		System.out.println(this.getMajor());
		System.out.println(this.getGPA());
		System.out.println(this.getPhone());
		System.out.println(this.getBirthday());
		System.out.println();
		
		
	}
	

}
