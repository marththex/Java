public class Periodical
{
	private String name;
	private int release;
	private boolean checkedOut;
	private int barcode;


	public Periodical()
	{
		name = "";
		release = 0;
		checkedOut = false;
	}
	
	public Periodical(String p_name, int p_release, boolean p_checkedOut, int p_barcode)
	{
		name = p_name;
		release = p_release;
		checkedOut = p_checkedOut;
		barcode = p_barcode;
	}
	
	public Periodical(Periodical p)
	{
		this(p.getName(),p.getRelease(), p.getCheckedOut(), p.getBarcode());
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getRelease()
	{
		return release;
	}
	
	public boolean getCheckedOut()
	{
		return checkedOut;
	}
	
	public int getBarcode()
	{
		return barcode;
	}

	public void setName(String p_name)
	{
		name = p_name;
	}
	
	public void setRelease(int p_release)
	{
		release = p_release;
	}
	
	public void setCheckedOut(boolean p_checkedOut)
	{
		checkedOut = p_checkedOut;
	}
	
	public boolean equals(Periodical p)
	{
		return ((name.equals(p.getName())) && (release == p.getRelease()) && (checkedOut == p.getCheckedOut()));
	}
	
	public String toString()
	{
		return "Name: " + name + " Release: " + release + " Checked Out: "  + checkedOut;
	}
}
