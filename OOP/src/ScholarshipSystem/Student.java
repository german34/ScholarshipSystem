package ScholarshipSystem;

/**
 * Created by alice on 10/22/14.
 */
public class Student {

	private int studentID;
	private String password;
	private Criteria studentCrit;

	public Student()
	{
		studentID = -1;
		password = "";
		studentCrit = null; // does this do in java what I want it to do as if this is C++?
	}
	public Student(int id, String pw, double gpa, String major, int hours)
	{
		studentID = id;
		password = pw;
		// studentCrit = new Criteria( // pass gpa major & hours )
		// need Criteria constructor(s) to be written
		// other option is just to pass Criteria object and assign to studentCrit but I think this is better...data hiding? that might be what this is
	}

}
