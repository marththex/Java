public class Movie
{
	private String title;
	private int year;
	private int runtime;
	private boolean checkedOut;
	private int barcode;

	public Movie()
	{
		title = "";
		year = 0;
		runtime  = 0;
		checkedOut = false;
		barcode = 0;
	}
	
	public Movie(String m_title, int m_year, int m_runtime, boolean m_checkedOut, int m_barcode)
	{
		title = m_title;
		year = m_year;
		runtime  = m_runtime;
		checkedOut = m_checkedOut;
		barcode = m_barcode;
	}
	
	public Movie(Movie m)
	{
		this(m.getTitle(),m.getYear(),m.getRuntime(),m.getCheckedOut(), m.getBarcode());
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public int getRuntime()
	{
		return runtime;
	}
	
	public boolean getCheckedOut()
	{
		return checkedOut;
	}
	
	public int getBarcode()
	{
		return barcode;
	}
	
	public void setTitle(String m_title)
	{
		title = m_title;
	}
	
	public void setYear(int m_year)
	{
		year = m_year;
	}
	
	public void setRuntime(int m_runtime)
	{
		runtime = m_runtime;
	}
	
	public void setCheckedOut(boolean m_checkedOut)
	{
		checkedOut  = m_checkedOut;
	}
	
	public boolean equals(Movie m)
	{
		return ((title.equals(m.getTitle()) && (year == m.getYear()) && (runtime == m.getRuntime()) && (checkedOut == m.getCheckedOut())));
	}
	
	public String toString()
	{
		return "Title: " + title + " Year: " + year + "  Runtime: " + runtime + " Checked Out: " + checkedOut;
	}
}
