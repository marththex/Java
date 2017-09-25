public class Book
{
	private String title;
	private String author;
	private int pages;
	private int isbn;
	private boolean checkedOut;
	private int barcode;

	public Book()
	{
		title = "";
		author = "";
		pages  = 0;
		isbn = 0;
		checkedOut = false;
		barcode = 0;
		
	}
	
	public Book(String b_title, String b_author, int b_pages, int b_isbn, boolean b_checkedOut, int b_barcode)
	{
		title = b_title;
		author = b_author;
		pages  = b_pages;
		isbn = b_isbn;
		checkedOut = b_checkedOut;
		barcode = b_barcode;
	}
	
	public Book(Book b)
	{
		this(b.getTitle(),b.getAuthor(),b.getPages(),b.getIsbn(), b.getCheckedOut(), b.getBarcode());
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public int getPages()
	{
		return pages;
	}
	
	public int getIsbn()
	{
		return isbn;
	}
	
	public boolean getCheckedOut()
	{
		return checkedOut;
	}
	
	public int getBarcode()
	{
		return barcode;
	}
	
	public void setTitle(String b_title)
	{
		title = b_title;
	}
	
	public void setAuthor(String b_author)
	{
		author = b_author;
	}
	
	public void setPages(int b_pages)
	{
		pages = b_pages;
	}
	
	public void setIsbn(int b_isbn)
	{
		isbn = b_isbn;
	}
	public void setCheckedOut(boolean b_checkedOut)
	{
		checkedOut = b_checkedOut;
	}
	
	public boolean equals(Book b)
	{
		return ((title.equals(b.getTitle())) && (author.equals(b.getAuthor())) && (pages == b.getPages()) && (isbn == b.getIsbn()) && (checkedOut == b.getCheckedOut()));
	}
	
	public String toString()
	{
		return "Title: " + title + " Author: " + author + "  Pages: " + pages + " ISBN: " + isbn + " Checked Out: " + checkedOut;
	}
}
