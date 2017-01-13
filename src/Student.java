//Kai Rahm
//CS3240

public class Student{
	String fName; 
	String lName;
	int grade;
	String courseCode;
	
	
	public Student(){
		super();
	}
	public Student(String fn, String ln){
		super();
		this.fName = fn;
		this.lName = ln;
	}
	public Student(String firstName, String lastName, int grade){
		super();
		this.fName = firstName;
		this.lName = lastName;
		this.grade = grade;
	}
	public Student(String firstName, String lastName, int grade, String courseCode){
		super();
		this.fName = firstName;
		this.lName = lastName;
		this.courseCode = courseCode;
		this.grade = grade;
	}
	public void setFName(String firstName){
		this.fName = firstName;
	}
	public String getFName(){
		return(this.fName);
	}
	public void setLFName(String lastName){
		this.lName = lastName;
	}
	public String getLName(){
		return(this.lName);
	}
	public void setGrade(int grade){
		this.grade = grade;
	}
	public int getGrade(){
		return(this.grade);
	}
	public void setCourseCode(String cCode){
		this.courseCode = cCode;
	}
	public String getCourseCode(){
		return(this.courseCode);
	}
	
	public String toString(){
		return(this.lName+" "+String.format("%-12s", this.fName)+" "+String.format("%-10s", this.courseCode)+" "+this.grade+"%");
		//return(this.lName+", "+this.fName);
	}
	

}
