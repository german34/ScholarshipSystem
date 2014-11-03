package ScholarshipSystem;

import java.util.*;

/**
 * Created by alice on 10/22/14.
 */
public class Admin {

	private int adminID;
	private String password;

	// java provides default constructor that does exactly this;
	// good practice to be explicit with it?
	public Admin()
	{
		adminID = -1;
		password = "";
	}
	public Admin(int id, String pw)
	{
		adminID = id;
		password = pw;
	}

	public void setAdminID(int id) { adminID = id; }
	public void setPassword(String pw) { password = pw; } // how does security work we just don't know

	public int getAdminID() { return adminID; }
	public String getPassword() { return password; } // ditto

	public void addScholarship()
	{
		// I/O skeleton just to show what info will be needed from admin.
		
		// TODO: Create new Scholarship object with provided data: need Scholarship constructor(s) to be written.
		
		// TODO: Create Criteria object for scholarship requirements -
		// pass GPA, major, hours to Scholarship for it to pass to
		// Criteria? Need Criteria constructor(s) to be written.

		Scanner stdin = new Scanner(System.in);

		System.out.println("Enter the scholarship name: ");
		String name = stdin.nextLine();

		System.out.println("Enter the scholarship amount: ");
		double amount = stdin.nextDouble();

		System.out.println("Enter the maximum number of students: ");
		int studentLimit = stdin.nextInt();

		System.out.println("Enter deadline: ");
		String deadline = stdin.nextString();

	}

}
