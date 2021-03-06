public class Student
{
	private int id;
	private String fName;
	private String lName;
	private String email;
	private int phone;
	private boolean hasItem;
	private int itemNumber;

	public Student()
	{
		id = 0;
		fName = "";
		lName = "";
		email = "";
		phone = 0;
		hasItem = false;
		itemNumber = -1;
	}
	
	public Student(int s_id, int s_itemNumber)
	{
		id = s_id;
		fName = "";
		lName = "";
		email = "";
		phone = 0;
		hasItem = false;
		itemNumber = s_itemNumber;
	}
	
	public Student(int s_id, String s_fName, String s_lName, String s_email, int s_phone, boolean s_hasItem, int s_itemNumber)
	{
		id = s_id;
		fName = s_fName;
		lName = s_lName;
		email = s_email;
		phone = s_phone;
		hasItem = s_hasItem;
		itemNumber = s_itemNumber;
	}
	
	public Student(Student s)
	{
		this(s.getId(),s.getFName(),s.getLName(),s.getEmail(),s.getPhone(), s.getHasItem(), s.getItemNumber());
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getFName()
	{
		return fName;
	}
	
	public String getLName()
	{
		return lName;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public int getPhone()
	{
		return phone;
	}
	
	public boolean getHasItem()
	{
		return hasItem;
	}
	
	public int getItemNumber()
	{
		return itemNumber;
	}
	
	public void setID(int s_id)
	{
		id = s_id;
	}
	
	public void setFName(String s_fName)
	{
		fName = s_fName;
	}
	
	public void setLName(String s_lName)
	{
		lName = s_lName;
	}
	
	public void setEmail(String s_email)
	{
		email = s_email;
	}
	
	public void setPhone(int s_phone)
	{
		phone = s_phone;
	}
	
	public void setHasItem(boolean s_hasItem)
	{
		hasItem = s_hasItem;
	}
	public void setItemNumber(int s_itemNumber)
	{
		itemNumber = s_itemNumber;
	}
	
	public boolean equals(Student s)
	{
		return ((id == s.getId()) && (fName.equals(s.getFName())) && (lName.equals(s.getLName())) && (email.equals(s.getEmail())) && (phone == s.getPhone()) && (hasItem == s.getHasItem()));
	}
	
	public String toString()
	{
		return "Student's ID: " + id + " Name: " + fName + " " + lName + "  E-mail: " + email + " Phone Number: " + phone + " Registered: " + hasItem;
	}
}
