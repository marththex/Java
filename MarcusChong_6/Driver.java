import java.util.Scanner;
import java.io.File;

public class Driver
{
	public static void main(String[] args)
	{
		Logger log = new Logger();
		int exit = 0, option;
		Scanner scan = new Scanner(System.in);
		String dirName = "";
		
		System.out.println("Would you like to dump your results on a log file? Press 'y' for yes or 'n' for no.");
		log.logIt();
		while(exit!= 6)
		{
			log.writeLine("You have (6) options\nPress 1 to List the contents of a directory provided by the user\nPress 2 to List the contents of a directory provided by the user as well as all of its sub directories\nPress 3 to Locate a file with a given name\nPress 4 to Locate files with a given file extension\nPress 5 to Concatenate the contents of 2 files whose names are provided by the user and output the result to a third file\nPress 6 to Exit");		
			option = scan.nextInt();
			
			if(option == 1)
			{
				File dir;
				
				log.writeLine("What is the name of the Directory?");
				dirName = scan.next();
				dir = new File(dirName);
				File[] filesList = dir.listFiles();      
				
				for(File file : filesList)
				{
						log.writeLine(file.getName());
				}
			}
			
			else if(option == 2)
			{
				File dir;
				log.writeLine("What is the name of the Directory?");
				dirName = scan.next();
				dir = new File(dirName);
				File[] filesList = dir.listFiles();      
				
				for(File file : filesList)
				{
						if(file.isFile())
						{
						log.writeLine(file.getAbsolutePath());
						}
						else if( file.isDirectory())
						{
							log.option2(file.getAbsolutePath());
						}
				}
				
			}
			
			else if(option == 3)
			{
				log.writeLine("Enter the file to be searched.. " );
				String name = scan.next();
				log.writeLine("Enter the directory where to search ");
				String directory = scan.next();
				log.option3(name,new File(directory));	
			}
			
			else if(option == 4)
			{
				
				log.writeLine("Enter the directory where to search ");
				String directory = scan.next();
				log.writeLine("Enter what kind of file to be searched.. (e.g. for text file type '.txt'" );
				String type = scan.next();
				log.option4(type, new File(directory));
				
			
			}
			
			else if(option == 5)
			{
				log.writeLine("What is the name of the first File?");
				String file1 = scan.next();
				log.writeLine("What is the name of the second File?");
				String file2 = scan.next();
				log.writeLine("What is the name of the File you want to concatenate?");
				String file3 = scan.next();
				log.option5(file1,file2,file3);
			}
			
			else
			{
				exit = 6;	
			}
				
		}
		
		System.out.println("Bye!");
		
	}
}