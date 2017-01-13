//Kai Rahm
//CS3240

import java.util.Scanner;

/**
 * A class to test the methods of the Linked class, using Student objects to create a simple list manager.
 * @author Kai
 *
 */
public class StudentDatabase {

	public static void main(String[] args) {
		Student s1 = new Student("Sherlock","Holmes",99,"CS1");
		Student s2 = new Student("Ash", "Ketchum", 80, "CS1");
		Student s3 = new Student("Irene", "Holmes",95, "CS2");
		
		Linked<Student> department = new Linked<Student>();
		
		department.insertFirst(s1);
		department.insertLast(s3);
		department.insertAt(1, s2);
		department.printList();
		System.out.println();
		
		Scanner input = new Scanner(System.in);
	    String choice = null;
	 
	    while (!"end".equals(choice)) {
	    	System.out.println("*******************************************************");
	    	System.out.println("Welcome to the Student Information Database menu!\n");
	       	System.out.println("Press 1 to insert a new record at end of the current list");
            System.out.println("Press 2 to insert a new record at beginning of the current list");
            System.out.println("Press 3 to insert a new record at a specific index location of the current list");
			System.out.println("Press 4 to delete a record");
			System.out.println("Press 5 to search the database (by last name)");
			System.out.println("Press 6 to print a range in the database");
			System.out.println("Press 7 to find the class average for a course");
			System.out.println("Press 8 to quit");
	    
	        choice = input.nextLine();
	        
	        if ("1".equals(choice)) {
	        	String fname;
	        	String lname;
	        	int grade;
	        	String courseCode;
	        	System.out.println("Please enter student information to create the new record: ");
	        	System.out.println("Student's first name: ");
	        	fname = input.nextLine();
	        	System.out.println("Student's last name: ");
	        	lname = input.nextLine();
	        	System.out.println("Student's course code: ");
	        	courseCode = input.nextLine();
	        	System.out.println("Student's grade in course: ");
	        	grade = Integer.parseInt(input.nextLine());
	        	department.insertLast(new Student(fname,lname,grade,courseCode));
	        	choice = null;
	          }
	        if ("2".equals(choice)) {
	        	String fname;
	        	String lname;
	        	int grade;
	        	String courseCode;
	        	System.out.println("Please enter student information to create the new record: ");
	        	System.out.println("Student's first name: ");
	        	fname = input.nextLine();
	        	System.out.println("Student's last name: ");
	        	lname = input.nextLine();
	        	System.out.println("Student's course code: ");
	        	courseCode = input.nextLine();
	        	System.out.println("Student's grade in course: ");
	        	grade = Integer.parseInt(input.nextLine());
	        	department.insertFirst(new Student(fname,lname,grade,courseCode));
	        	choice = null;
	        }
	        if ("3".equals(choice)) {
	        	String fname;
	        	String lname;
	        	int grade;
	        	String courseCode;
	        	System.out.println("Please enter student information to create the new record: ");
	        	System.out.println("Student's first name: ");
	        	fname = input.nextLine();
	        	System.out.println("Student's last name: ");
	        	lname = input.nextLine();
	        	System.out.println("Student's course code: ");
	        	courseCode = input.nextLine();
	        	System.out.println("Student's grade in course: ");
	        	grade = Integer.parseInt(input.nextLine());
	        	System.out.println("Index position to insert the record: ");
	        	int index = Integer.parseInt(input.nextLine());
	        	department.insertAt(index, new Student(fname,lname,grade,courseCode));
	        	choice = null;
	        }
	        if ("4".equals(choice)) {
	        	System.out.println("Please enter the index position of the record you would like to delete: ");
	        	int index = Integer.parseInt(input.nextLine());
	        	department.deleteItem(index);
	        	choice = null;
		    }
		    if ("5".equals(choice)) {
		    	System.out.println("Please enter the Last Name of the record you want to find: ");
		    	String lName = input.nextLine();
		    	for(int i=0; i < department.listCount(); i++){
		    		if(department.returnData(i).lName.equalsIgnoreCase(lName)){
		    			System.out.println("Record (#"+i+"):    "+String.format("%-17s", department.returnData(i)));
		    		}
		    	}
		    	choice = null;
		    }
		    if ("6".equals(choice)) {
		    	System.out.println("Please enter the lowest index position of the range you would like to print: ");
	        	int index1 = Integer.parseInt(input.nextLine());
	        	System.out.println("Please enter the highest index position of the range you would like to print: ");
	        	int index2 = Integer.parseInt(input.nextLine());
	        	department.printRange(index1, index2);
		    	choice = null;
		    }
		    if ("7".equals(choice)) {
		    	if(department.listCount() == 0){
		    		System.out.println("Cannot find class average in an empty list.");
		    	}else{
		    	System.out.println("Please enter the course code of class average you want to find: ");
		    	String course = input.nextLine();
		    	int scoreTotals = 0;
		    	int students = 0;
		    	for(int i=0; i < department.listCount(); i++){
		    		if(department.returnData(i).courseCode.equalsIgnoreCase(course)){
		    			scoreTotals += department.returnData(i).getGrade();
		    			students++;
		    		}
		    	}
		    	if(scoreTotals == 0){
		    		System.out.println("The course "+course+" was not found. Class average is: 0%");
			    	
		    	}else{
		    		System.out.println("The course "+course+" has a class average of: "+(scoreTotals/students)+"%");
		    	}
		    	choice = null;
		    }}
		    if ("8".equals(choice)) {
		        	System.out.println("Good bye!");  
		        choice = null;
		        exit();
		    }
		    System.out.println();
	    }
	    
	    input.close();
		
	}



	private static void exit() {
		System.exit(0);
	}

}
