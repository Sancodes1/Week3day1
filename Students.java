package Week3day2;

public class Students {
	
	public void getStudentInfo()
	{
		System.out.println("Studentinfo overloading");
	}
	public void getStudentInfo(int id)
	{
		System.out.println("Studentid - 786");
	}
	
	public void getStudentInfo(int id, String name)
	{
		System.out.println("Studentid - 786 Student name- Santhosh");
	}
	
	public void getStudentInfo( String email , double phoneNumber)
	{
		System.out.println("Studentemail - Santhoshn318@gmail.com phone number- 987456123");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students student = new Students();
		student.getStudentInfo();
		student.getStudentInfo(0);
		student.getStudentInfo(0, null);
		student.getStudentInfo(null, 0);

	}

}
