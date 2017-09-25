import java.util.ArrayList;
import java.util.Scanner;

public class Catalog
{
	public static void main(String[] args)
	{
		ArrayList<Movie> movies = new ArrayList<Movie>(10);
		ArrayList<Book> books = new ArrayList<Book>(10);
		ArrayList<Periodical> periodicals = new ArrayList<Periodical>(10);
		ArrayList<Room> rooms = new ArrayList<Room>(10);
		ArrayList<Student> student = new ArrayList<Student>(10);
		Scanner scan = new Scanner(System.in);
		int barcode  = 0;
		int answer = 0;
		int itemBarcode = 0;
		int itemNumber = - 1; // The item the student has currently; -1 means the student has no items
		String movieTitle, bookTitle, bookAuthor, periodicalName;
		String studentFName, studentLName, studentEmail = "";
		String fNameRemoved = "",lNameRemoved = "";
		int movieYear, movieRuntime, bookPages, bookIsbn, periodicalYear,roomNumber, roomCapasity, roomCom;
		int studentId = 0, studentPhone; 
		Movie m;
		Book b;
		Periodical p;
		Room r;
		Student s;
		boolean hasCom = false, hasItem = false, checkedOut = false;
		
		while(answer != 8)
		{
		
			System.out.println("________________________________________");
			System.out.println("\nWelcome to the Library Catalog");
			System.out.println("________________________________________\n");
		
			System.out.println("Press 1 to Add a new item to the catalog");
			System.out.println("Press 2 to Remove a lost item from the catalog");
			System.out.println("Press 3 to Register a new student");
			System.out.println("Press 4 to Unregister an old student");
			System.out.println("Press 5 to Check the status of an item");
			System.out.println("Press 6 to Checkout a particular item to a particular student");
			System.out.println("Press 7 to Return an item");
			System.out.println("Press 8 to Exit");
			
			answer = scan.nextInt();
			
			if (answer == 1) //Add a new item to the catalog
			{
					answer = 0;
					checkedOut  = false;
					System.out.println("________________________________________");
					System.out.println("What is kind of item is it");
					System.out.println("________________________________________");
					System.out.println("Press 1 for Movie");
					System.out.println("Press 2 for Book");
					System.out.println("Press 3 for Periodical");
					System.out.println("Press 4 for Room");
				
					answer = scan.nextInt();
				
					if(answer == 1) //For Movie
					{
							System.out.println("What is the Title of the movie? (Use _ for any spaces)");
							movieTitle = scan.next();
							System.out.println("What is the Year of the movie?");
							movieYear = scan.nextInt();
							System.out.println("What is the Runtime of the movie in minutes?");
							movieRuntime = scan.nextInt();
							
							
							m = new Movie(movieTitle, movieYear, movieRuntime, checkedOut, barcode);
							movies.add(m);
							barcode++;
										
							System.out.println("Successfully added " + movieTitle + " with a barcode number: "  + (barcode - 1) + " to the Catalog.");
					}
				
					else if(answer == 2) //For Book
					{
							System.out.println("What is the Title of the book?");
							bookTitle = scan.next();
							System.out.println("What is the Author of the book? (Use _ for any spaces)");
							bookAuthor = scan.next();
							System.out.println("How many pages are in the book?");
							bookPages = scan.nextInt();
							System.out.println("What is the ISBN of the book? (Do not use -)");
							bookIsbn = scan.nextInt();
							
							
							b = new Book(bookTitle, bookAuthor, bookPages, bookIsbn, checkedOut, barcode);
							books.add(b);
							barcode++;
							
							System.out.println("Successfully added " + bookTitle + " with a barcode number: "  + (barcode-1) + " to the Catalog.");
					}
				
					else if(answer == 3) //For Periodical
					{
							System.out.println("What is the Name of Periodical? (Use _ for any spaces)");
							periodicalName= scan.next();
							System.out.println("What year was the Periodical released?");
							periodicalYear = scan.nextInt();
						
							
							
							p = new Periodical(periodicalName,periodicalYear, checkedOut, barcode);
							periodicals.add(p);
							barcode++;
							
							System.out.println("Successfully added " + periodicalName  + " with a barcode number: "  + (barcode-1) + " to the Catalog.");
				
					}
				
					else if (answer == 4) //For Room
					{
							System.out.println("What is the Room Number?");
							roomNumber= scan.nextInt();
							System.out.println("What is the Capasity of the room?");
							roomCapasity = scan.nextInt();
							System.out.println("Does this room have a computer? (Press 1 for Yes or 2 for No)");
							roomCom = scan.nextInt();
							if (roomCom == 1)
								hasCom = true;
							
							r = new Room(roomNumber, roomCapasity, hasCom, checkedOut, barcode);
							rooms.add(r);
							hasCom = false;
							barcode++;
							
							System.out.println("Successfully added Room: " + roomNumber + " with a barcode number: "  + (barcode-1)  + " to the Catalog.");
				
					}
					else
					{
						System.out.println("Error: Please Type in a valid number.");
					}
				
					
			
			}
			
			else if (answer == 2) //Remove a lost item from the catalog
			{
					answer = 0;
					checkedOut  = true;
					System.out.println("________________________________________");
					System.out.println("What is kind of item is it");
					System.out.println("________________________________________");
					System.out.println("Press 1 for Movie");
					System.out.println("Press 2 for Book");
					System.out.println("Press 3 for Periodical");
					System.out.println("Press 4 for Room");
				
					answer = scan.nextInt();
					
					if(answer == 1) //For Movie
					{
							System.out.println("What is the Title of the movie? (Use _ for any spaces)");
							movieTitle = scan.next();
							System.out.println("What is the Year of the movie? ");
							movieYear = scan.nextInt();
							System.out.println("What is the Runtime of the movie in minutes?");
							movieRuntime = scan.nextInt();
							System.out.println("What is the barcode number?");
							itemBarcode =  scan.nextInt();
							
							m = new Movie(movieTitle, movieYear, movieRuntime, checkedOut, itemBarcode);
							for(int k = 0; k < movies.size(); ++k)
							{
								if((movies.get(k)).getBarcode() == m.getBarcode())
								{
						
									movieTitle = (movies.get(k)).getTitle();
									movies.remove(k);	
									System.out.println("Successfully removed " + movieTitle + " from the Catalog.");
								}	
							
							}
							
							
					}
				
					else if(answer == 2) //For Book
					{
							System.out.println("What is the Title of the book? (Use _ for any spaces)");
							bookTitle = scan.next();
							System.out.println("What is the Author of the book? (Use _ for any spaces)");
							bookAuthor = scan.next();
							System.out.println("How many pages are in the book?");
							bookPages = scan.nextInt();
							System.out.println("What is the ISBN of the book? (Do not use -)");
							bookIsbn = scan.nextInt();
							System.out.println("What is the barcode number?");
							itemBarcode =  scan.nextInt();
							
							
							b = new Book(bookTitle, bookAuthor, bookPages, bookIsbn, checkedOut, itemBarcode);
							for(int l = 0; l < books.size(); ++l)
							{
								if((books.get(l)).getBarcode() == b.getBarcode())
								{
						
									bookTitle = (movies.get(l)).getTitle();
									books.remove(l);	
									System.out.println("Successfully removed " + bookTitle + " from the Catalog.");
								}	
							
							}
					}
				
					else if(answer == 3)
					{
							System.out.println("What is the Name of Periodical? (Use _ for any spaces)");
							periodicalName= scan.next();
							System.out.println("What year was the Periodical released?");
							periodicalYear = scan.nextInt();
							System.out.println("What is the barcode number?");
							itemBarcode =  scan.nextInt();
							
							
							p = new Periodical(periodicalName,periodicalYear, checkedOut, itemBarcode);
							for(int n = 0; n < periodicals.size(); ++n)
							{
								if((periodicals.get(n)).getBarcode() == p.getBarcode())
								{
						
									periodicalName = (periodicals.get(n)).getName();
									periodicals.remove(n);	
									System.out.println("Successfully removed " + periodicalName + " from the Catalog.");
								}	
							
							}
				
					}
				
					else if (answer == 4)
					{
							System.out.println("What is the Room Number?");
							roomNumber= scan.nextInt();
							System.out.println("What is the Capasity of the room?");
							roomCapasity = scan.nextInt();
							System.out.println("Does this room have a computer? (Press 1 for Yes or 2 for No)");
							roomCom = scan.nextInt();
							if (roomCom == 1)
								hasCom = true;
							System.out.println("What is the barcode number?");
							itemBarcode =  scan.nextInt();
							
							r = new Room(roomNumber, roomCapasity, hasCom, checkedOut, itemBarcode);
							for(int o = 0; o < rooms.size(); ++o)
							{
								if((rooms.get(o)).getBarcode() == r.getBarcode())
								{
						
									roomNumber = (rooms.get(o)).getRoomNumber();
									rooms.remove(o);	
									System.out.println("Successfully removed Room Number: " + roomNumber + " from the Catalog.");
								}	
							
							}
							hasCom = false;
					}
					else
					{
						System.out.println("Error: Please Type in a valid number.");
					}
			
			}
			
			else if (answer == 3) // register a student
			{
				System.out.println("What is the Student's ID Number?");
				studentId = scan.nextInt();
				for(int j = 0;  j < student.size(); ++j)
				{
					do
					{
						System.out.println("Please enter Student's ID Number again for verification");
						studentId = scan.nextInt();
						if(studentId == (student.get(j)).getId())
							System.out.println("Error: ID already exists");
						
					}
					while (studentId == (student.get(j)).getId());
				}	
				System.out.println("What is the Student's First Name?");
				studentFName = scan.next();
				System.out.println("What is the Student's Last Name?");
				studentLName = scan.next();
				System.out.println("What is the Student's Email Address? (disreguard .com, .net, .org, etc.)");
				studentEmail = scan.next();
				for(int k = 0;  k < student.size(); ++k)
				{
					do
					{
						System.out.println("Enter Student's Email Address again for verification");
						studentEmail = scan.next();
						if(studentEmail.equals((student.get(k)).getEmail()))
							System.out.println("Error: E-Mail already exists");
					}
					while (studentEmail.equals((student.get(k)).getEmail()));
				}
				System.out.println("What is the student's phone number? (DO NOT TYPE IN DASHES OR SPACES)");
				studentPhone = scan.nextInt();
				s = new Student(studentId, studentFName, studentLName, studentEmail, studentPhone, hasItem, -1);
				student.add(s);
				
				System.out.println("Successfully added: " + studentFName + " " + studentLName + " to the System.");
			
			}
			
			else if (answer == 4) //unregister a student
			{
				System.out.println("'What is the Student's ID Number?");
				studentId = scan.nextInt();
				for(int i = 0; i < student.size(); ++i)
				{
					if(((student.get(i)).getId()) == studentId)
					{
						if(((student.get(i)).getHasItem()) == false)
						{
							fNameRemoved = (student.get(i)).getFName();
							lNameRemoved = (student.get(i)).getLName();
							student.remove(i);	
							System.out.println("Successfully removed: " + fNameRemoved + " " + lNameRemoved + " to the System.");
						}
						else
							System.out.println("Error: Student has an item checked out");
					}	

							
				}
				
			}
			
			else if (answer  == 5) // Check Status
			{
					answer = 0;
					checkedOut  = false;
					System.out.println("________________________________________");
					System.out.println("What is kind of item is it");
					System.out.println("________________________________________");
					System.out.println("Press 1 for Movie");
					System.out.println("Press 2 for Book");
					System.out.println("Press 3 for Periodical");
					System.out.println("Press 4 for Room");
				
					answer = scan.nextInt();
					
					if(answer == 1) //For Movie
					{
							System.out.println("What is the Title of the movie?");
							movieTitle = scan.next();
							System.out.println("What is the Year of the movie?");
							movieYear = scan.nextInt();
							System.out.println("What is the Runtime of the movie in minutes?");
							movieRuntime = scan.nextInt();
							System.out.println("What is the barcode number?");
							itemBarcode =  scan.nextInt();
							
							m = new Movie(movieTitle, movieYear, movieRuntime, checkedOut, itemBarcode);
							for(int q = 0; q < movies.size(); ++q) // checks for avaliable books
							{
								if((movies.get(q)) == m)
								{
						
									movieTitle = (movies.get(q)).getTitle();
									checkedOut = (movies.get(q)).getCheckedOut();
									if (checkedOut == true)
										for( int o = 0; 0 < student.size();  ++o)
										{
											if((student.get(o)).getItemNumber() == itemBarcode)
												System.out.println(movieTitle + " is already checked out by " + (student.get(o)).getFName() + ".");
										}
									else
									{
										m.setCheckedOut(true);
										for(q = 0; q < movies.size(); ++q) //checks for checked out books
										{
											if(movies.get(q) == m)
											{
						
												movieTitle = (movies.get(q)).getTitle();
												checkedOut = (movies.get(q)).getCheckedOut();
												if (checkedOut == true)
													System.out.println(movieTitle + " is already checked out.");
											}	
							
										}
									}
										
								}	
							
							}
							if(checkedOut == false)
										System.out.println(movieTitle + " is avaliable");
							
							
					}
				
					else if(answer == 2) //For Book
					{
							System.out.println("What is the Title of the book?");
							bookTitle = scan.next();
							System.out.println("What is the Author of the book?");
							bookAuthor = scan.next();
							System.out.println("How many pages are in the book?");
							bookPages = scan.nextInt();
							System.out.println("What is the ISBN of the book? (Do not put any dashes)");
							bookIsbn = scan.nextInt();
							System.out.println("What is the barcode number?");
							itemBarcode =  scan.nextInt();
							
							b = new Book(bookTitle, bookAuthor, bookPages, bookIsbn, checkedOut, itemBarcode);
							books.add(b);
							
							for(int t = 0; t < books.size(); ++t)
							{
								if(books.get(t) == b)
								{
						
									bookTitle = (books.get(t)).getTitle();
									checkedOut = (books.get(t)).getCheckedOut();
									if (checkedOut == true)
										System.out.println(bookTitle + " is already checked out.");
									else
									{
										b.setCheckedOut(true);
										for(t = 0; t < books.size(); ++t)
										{
											if(books.get(t) == b)
											{
						
												bookTitle = (books.get(t)).getTitle();
												checkedOut = (books.get(t)).getCheckedOut();
												if (checkedOut == true)
													System.out.println(bookTitle + " is already checked out.");
											}	
							
										}
									}
							
								}	
							
							}
							if(checkedOut == false)
								System.out.println(bookTitle + " is avaliable");
					}
				
					else if(answer == 3)
					{
							System.out.println("What is the Name of Periodical?");
							periodicalName= scan.next();
							System.out.println("What year was the Periodical released?");
							periodicalYear = scan.nextInt();
							System.out.println("What is the barcode number?");
							itemBarcode =  scan.nextInt();
							
							
							p = new Periodical(periodicalName,periodicalYear, checkedOut, itemBarcode);
							for(int u = 0; u < periodicals.size(); ++u)
							{
								if(periodicals.get(u) == p)
								{
						
									periodicalName = (periodicals.get(u)).getName();
									checkedOut = (periodicals.get(u)).getCheckedOut();
									if (checkedOut == true)
										System.out.println(periodicalName + " is already checked out.");
									else
									{
										p.setCheckedOut(true);
										for(u = 0; u < periodicals.size(); ++u)
										{
											if(periodicals.get(u) == p)
											{
						
												periodicalName = (periodicals.get(u)).getName();
												checkedOut = (periodicals.get(u)).getCheckedOut();
												if (checkedOut == true)
													System.out.println(periodicalName + " is already checked out.");
											}	
							
										}
									}
								
								}	
							
							}
							if(checkedOut  == false)
										System.out.println(periodicalName + " is avaliable");
				
					}
				
					else if (answer == 4)
					{
							System.out.println("What is the Room Number?");
							roomNumber= scan.nextInt();
							System.out.println("What is the Capasity of the room?");
							roomCapasity = scan.nextInt();
							System.out.println("Does this room have a computer? (Press 1 for Yes or 2 for No)");
							roomCom = scan.nextInt();
							if (roomCom == 1)
								hasCom = true;
							System.out.println("What is the barcode number?");
							itemBarcode =  scan.nextInt();
							
							r = new Room(roomNumber, roomCapasity, hasCom, checkedOut, itemBarcode);
							for(int v = 0; v < rooms.size(); ++v)
							{
								if(rooms.get(v) == r)
								{
						
									roomNumber = (rooms.get(v)).getRoomNumber();
									checkedOut = (rooms.get(v)).getCheckedOut();
									if (checkedOut == true)
										System.out.println("Room:  " + roomNumber + " is already checked out.");
									else
									{
										r.setCheckedOut(true);
										for(v = 0; v < rooms.size(); ++v)
										{
											if(rooms.get(v) == r)
											{
						
												roomNumber = (rooms.get(v)).getRoomNumber();
												checkedOut = (rooms.get(v)).getCheckedOut();
												if (checkedOut == true)
													System.out.println("Room:  " + roomNumber + " is already checked out.");
											}	
							
										}
									}
								}	
							
							}
							if(checkedOut == false)
										System.out.println("Room: " + roomNumber + " is avaliable");
							hasCom = false;
					}
					else
					{
						System.out.println("Error: Please Type in a valid number.");
					}
			
			}
			
			else if (answer == 6) //Check  Out Item
			{
					answer = 0;
					checkedOut  = true;
					System.out.println("________________________________________");
					System.out.println("What is kind of item is it");
					System.out.println("________________________________________");
					System.out.println("Press 1 for Movie");
					System.out.println("Press 2 for Book");
					System.out.println("Press 3 for Periodical");
					System.out.println("Press 4 for Room");
				
					answer = scan.nextInt();
					
					if(answer == 1) //For Movie
					{
							System.out.println("What is the Title of the movie? (Use _ for any spaces)");
							movieTitle = scan.next();
							System.out.println("What is the Year of the movie? ");
							movieYear = scan.nextInt();
							System.out.println("What is the Runtime of the movie in minutes?");
							movieRuntime = scan.nextInt();
							System.out.println("What is the barcode number?");
							itemBarcode =  scan.nextInt();
							System.out.println("What is the student's ID Number?");
							studentId = scan.nextInt();
							
							m = new Movie(movieTitle, movieYear, movieRuntime, checkedOut, itemBarcode);
						
							for( int k = 0; k < movies.size(); ++k)
							{
								if((movies.get(k)).getBarcode() == m.getBarcode())
								{
									for (int j = 0; j < student.size(); ++j)
									{
										if((student.get(j)).getId() ==  studentId)
										{
											movieTitle = (movies.get(k)).getTitle();
											(movies.get(k)).setCheckedOut(true);	
											(student.get(j)).setItemNumber(itemBarcode);
											System.out.println("Successfully checked out " + movieTitle + " from the Catalog.");
										}
									}
								}	
							
							}
							
							
					}
				
					else if(answer == 2) //For Book
					{
							System.out.println("What is the Title of the book? (Use _ for any spaces)");
							bookTitle = scan.next();
							System.out.println("What is the Author of the book? (Use _ for any spaces)");
							bookAuthor = scan.next();
							System.out.println("How many pages are in the book?");
							bookPages = scan.nextInt();
							System.out.println("What is the ISBN of the book? (Do not use -)");
							bookIsbn = scan.nextInt();
							System.out.println("What is the barcode number?");
							itemBarcode =  scan.nextInt();
							
							
							b = new Book(bookTitle, bookAuthor, bookPages, bookIsbn, checkedOut, itemBarcode);
							for(int l = 0; l < books.size(); ++l)
							{
								if((books.get(l)).getBarcode() == b.getBarcode())
								{
						
									bookTitle = (movies.get(l)).getTitle();
									books.remove(l);	
									System.out.println("Successfully removed " + bookTitle + " from the Catalog.");
								}	
							
							}
					}
				
					else if(answer == 3)
					{
							System.out.println("What is the Name of Periodical? (Use _ for any spaces)");
							periodicalName= scan.next();
							System.out.println("What year was the Periodical released?");
							periodicalYear = scan.nextInt();
							System.out.println("What is the barcode number?");
							itemBarcode =  scan.nextInt();
							
							
							p = new Periodical(periodicalName,periodicalYear, checkedOut, itemBarcode);
							for(int n = 0; n < periodicals.size(); ++n)
							{
								if((periodicals.get(n)).getBarcode() == p.getBarcode())
								{
						
									periodicalName = (periodicals.get(n)).getName();
									periodicals.remove(n);	
									System.out.println("Successfully removed " + periodicalName + " from the Catalog.");
								}	
							
							}
				
					}
				
					else if (answer == 4)
					{
							System.out.println("What is the Room Number?");
							roomNumber= scan.nextInt();
							System.out.println("What is the Capasity of the room?");
							roomCapasity = scan.nextInt();
							System.out.println("Does this room have a computer? (Press 1 for Yes or 2 for No)");
							roomCom = scan.nextInt();
							if (roomCom == 1)
								hasCom = true;
							System.out.println("What is the barcode number?");
							itemBarcode =  scan.nextInt();
							
							r = new Room(roomNumber, roomCapasity, hasCom, checkedOut, itemBarcode);
							for(int o = 0; o < rooms.size(); ++o)
							{
								if((rooms.get(o)).getBarcode() == r.getBarcode())
								{
						
									roomNumber = (rooms.get(o)).getRoomNumber();
									rooms.remove(o);	
									System.out.println("Successfully removed Room Number: " + roomNumber + " from the Catalog.");
								}	
							
							}
							hasCom = false;
					}
					else
					{
						System.out.println("Error: Please Type in a valid number.");
					}
			
			}
			
			else if (answer == 7)
			{
			
			}
			
			else if (answer == 8)
			{
				System.out.println("Goodbye!");
			}
			
			else
			{
				System.out.println("Error: Please Type in a valid number.");
			}
			
		}
		
	
		
	}
}