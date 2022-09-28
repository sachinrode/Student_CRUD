package projectdemo1;

import java.util.List;
import java.util.Scanner;


public class Application_Main {

	public static void main(String[] args) {
		Students_methods student=new Students_methods();
		Student s=new Student();
		
		int c=0;
	do
	{
		System.out.println("======================================");
		System.out.println("1.Search Student");
		System.out.println("2.Add Student");
		System.out.println("3.Display Student");
		System.out.println("4.Update Studet");
		System.out.println("5.Delete Student");
		System.out.println("======================================");
		System.out.println("Enter Your Choice:");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("----------------------------------------------------------------------------------");
			student.searchStudentData();
			System.out.println("----------------------------------------------------------------------------------");
			break;
			
		case 2:
			System.out.println("----------------------------------------------------------------------------------");
     	    student.addStudentData();			
			System.out.println("----------------------------------------------------------------------------------");
			break;
			
		case 3:			
			System.out.println("----------------------------------------------------------------------------------");
			student.displayStudentData();
			System.out.println("----------------------------------------------------------------------------------");
			break;
						
		case 4:
			System.out.println("----------------------------------------------------------------------------------");
			student.updateStudentData();
			System.out.println("----------------------------------------------------------------------------------");
			break;
			
		case 5:
			System.out.println("----------------------------------------------------------------------------------");
			student.deleteStudentData();
			System.out.println("----------------------------------------------------------------------------------");
			break;
			
		default:
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("please enter valid choice");
			break;
		
		}
		
		System.out.println("do you want to continue(y/n)");
	    c=sc.next().charAt(0);
	    
	    
		
	}
	while((c=='y' || c=='Y') ||  (c=='n' && c=='N'));
	
	System.out.println("Thank You!!!!");

	}

	
}
