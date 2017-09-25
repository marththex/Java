public class Room
{
	private int roomNumber;
	private int capacity;
	private boolean hasCom;
	private boolean checkedOut;
	private int barcode;

	public Room()
	{
		roomNumber = 0;
		capacity= 0;
		hasCom = false;
		checkedOut = false;
		barcode = 0;
	}
	
	public Room(int r_roomNumber, int r_capacity, boolean r_hasCom, boolean r_checkedOut, int r_barcode)
	{
		roomNumber = r_roomNumber;
		capacity= r_capacity;
		hasCom = r_hasCom;
		checkedOut = r_checkedOut;
		barcode = r_barcode;
	}
	
	public Room(Room r)
	{
		this(r.getRoomNumber(),r.getCapacity(),r.getHasCom(), r.getCheckedOut(),r.getBarcode());
	}
	
	public int getRoomNumber()
	{
		return roomNumber;
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	
	public boolean getHasCom()
	{
		return hasCom;
	}
	
	public boolean getCheckedOut()
	{
		return checkedOut;
	}
	
	public int getBarcode()
	{
		return barcode;
	}
	
	public void setRoomNumber(int r_roomNumber)
	{
		roomNumber = r_roomNumber;
	}
	
	public void setCapasity(int r_capacity)
	{
		capacity= r_capacity;
	}
	
	public void setHasCom(boolean r_hasCom)
	{
		hasCom = r_hasCom;
	}
	
	public void setCheckedOut(boolean r_checkedOut)
	{
		checkedOut = r_checkedOut;
	}
	
	public boolean equals(Room r)
	{
		return ((roomNumber == r.getRoomNumber()) && (capacity== r.getCapacity()) && (hasCom == r.getHasCom()) && (checkedOut == r.getCheckedOut()));
	}
	
	public String toString()
	{
		return "Room Number: " + roomNumber + " Capacity: " + capacity+ "  Has a Computer: " + hasCom + "  Checked Out: " + checkedOut;
	}
}
