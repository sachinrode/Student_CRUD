package projectdemo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_methods {

	List<Student> studentList=new ArrayList<Student>();
    Scanner sc=new Scanner(System.in);
   
    //method 1-searching the student data   
	public void searchStudentData() {
		System.out.println("***********SEARCH STUDENT DATA************");
		System.out.println("enter rollno to search:");
		int rolno=sc.nextInt();
        int length=studentList.size();
        int count=0;
        
        for(int i=0;i<length;i++)
        {
        	if(studentList.get(i).getRollNo() == rolno)
        	{  System.out.println("Student Record Are Present\n");
        		System.out.println("Rollno\t\tfirstName\t\tlastName\tage\t\tphNo\t\t\tcity");
        	 	Student s = studentList.get(i);
        	 	System.out.println(s);
        	 	count++;
        	}
        }
        if(count==0)
    	{
        	System.out.println("\nWRONG ROLL NUMBER[PLEASE ENTER VALID ROLL NUMBER]");
    	}
	}


    
 //method 2-inserting the student data   
	public void addStudentData() {
		System.out.println("***********ADD STUDENT DATA************");
		System.out.println("How Many Student Data You Want To Add:");
		int num=sc.nextInt();
		int count=1;
		int i=0;
		for( i=1;i<=num;i++)
		{
		System.out.println("\nEnter Student No "+ i + " Details:");
		System.out.println("Enter rollNo:");
		int rollNo=sc.nextInt();
		System.out.println("Enter firstName:");
		String firstName=sc.next();
		System.out.println("Enter lastName:");
		String lastName=sc.next();
		System.out.println("Enter age:");
		int age=sc.nextInt();
		System.out.println("Enter phno:");
		long phoneNo=sc.nextLong();
		System.out.println("Enter city:");
		String city=sc.next();
	    Student s1=new Student(rollNo, firstName, lastName, age, phoneNo, city);
		studentList.add(s1);
		count++;
		}
		if(count==i)
		{
		System.out.println("\n"+ i + " Records Added Successfully");	
		}
	}

  //method 3-display student data
	public void displayStudentData() {
		System.out.println("\t\t\t\t***********DISPLAY STUDENT OPERATION************\n");
		System.out.println("Rollno\t\tfirstName\t\tlastName\tage\t\tphNo\t\t\tcity");
		System.out.println(studentList+"\n");
	}

	 //method 4-update the student data   
   	public void updateStudentData() {
   		System.out.println("***********UPDATE STUDENT DATA************");
		System.out.println("enter roll no of student:");
		int rolno=sc.nextInt();
		System.out.println("enter mobile to update:");
		long mob=sc.nextLong();
        int length=studentList.size();
        int count=0;
        for(int i=0;i<length;i++)
        {
        	if(studentList.get(i).getRollNo() == rolno)
        	{   
        		
        		studentList.get(i).setPhoneNo(mob);
        		System.out.println("\nstudent record update successfully");
        	    count++;
        	}
        }
        if(count==0)
        {
        	System.out.println("\nWRONG ROLL NUMBER[PLEASE ENTER VALID ROLL NUMBER]");
        }
     }

    //method 5-delete the student data   
	public void deleteStudentData() {
		System.out.println("***********DELETE STUDENT DATA************");
		System.out.println("enter rollno to delete student record:");
		int rolno=sc.nextInt();
		int length=studentList.size();
		int count=0;
        for(int i=0;i<length;i++)
        {
        	if(studentList.get(i).getRollNo() == rolno)
        	{   
        		Student s = studentList.get(i);
        		studentList.remove(s);
        		System.out.println("\nstudent record Delete successfully");
        		count++;
        	}
        }
        if(count==0)
        {
        	System.out.println("\nWRONG ROLL NUMBER[PLEASE ENTER VALID ROLL NUMBER]");        	
        }

	}

}
