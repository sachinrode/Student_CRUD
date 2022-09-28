package projectdemo1;

public class Student {

	private int rollNo;
	private String firstName;
	private String lastName;
	private int age;
	private long phoneNo;
	private String city;
	
	
	public Student(int rollNo, String firstName, String lastName, int age, long phoneNo, String city) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phoneNo = phoneNo;
		this.city = city;
	}


	public Student(int rollno) {
		// TODO Auto-generated constructor stub
	}


	public Student() {
		// TODO Auto-generated constructor stub
	}


	

	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public long getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
				return rollNo+ "           " +firstName+ "                  " +lastName+ "           " +age+ "           " +phoneNo+ "               " +city+"\n" ;
	}
	
	
	
	
	
}
