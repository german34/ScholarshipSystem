package ScholarshipSystem;
import java.util.*;
import java.text.*;
/**
 * Created by alice on 10/22/14.
 */
public class Scholarship 
{
	private int awardAmount;
	private int totalNumOfAwardees;
	private	String deadline; //in MM/dd/yyyy
	private String scholarshipName;
	private Criteria scholarship_criteria;
	private int counter;
	//database for students?  

	public Scholarship()
	{
		awardAmount = 0;
		scholarshipName = "";
		totalNumOfAwardees  = 0;
		deadline = "01/01/2000";
		counter = 0;
	}

	public Scholarship(int amount, String name, String d, int limit)
	{
		scholarshipName = name;
		awardAmount = amount;
		deadline = d;
		totalNumOfAwardees = limit;
		counter = 0;
	}

	public boolean isFull()
	{
		return (counter == totalNumOfAwardees;)
	}

	public Boolean onTime()
	{
		DateFormat dateFormat = new SimpleDate("MM/dd/yyyy"); //in MM/dd/yyyy
		Date date = new Date();
		Date todayDate = dateFormat.format(date);
		Date deadlineDate = dateFormat.format(deadline);
		
		if(todayDate.before(deadline))
		{
			return true;
		}

		 else
		 {
		 	return false;
		 }
	}

	public boolean isEligible(Student stu)
	{
		if (onTime() && !isFull() && stu.crit==scholarship_criteria) //overloaded = operator for criteria
		{
			return true;
		}
		else
			return false;
	}

	public boolean newApplicant()
	{
		//database queery
		counter++;
	}

	public void display()
	{
		//database
	}

	public void setAwardAmount(int num)
	{
		awardAmount = num;
	}

	public void setTotalNumOfAwardees(int num)
	{
		totalNumOfAwardess = num;
	}

	public void setScholarshipName(String s)
	{
		scholarshipName = s;
	}

	public void setDeadline(Date dead)
	{
		deadline = dead;
	}

	public int getAwardAmount()
	{
		return awardAmount;
	}

	public int getTotalNumOfAwardees()
	{
		return totalNumOfAwardees;
	}

	public String getScholarshipName()
	{
		return scholarshipName;
	}

	public Date getDeadline()
	{
		return deadline;
	}
}
