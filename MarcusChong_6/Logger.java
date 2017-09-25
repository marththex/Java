import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Logger
{
	private boolean loggerEnable = false;
	private String logName = "";
	
	public Logger()
	{
		loggerEnable = false;
	}
	
	public Logger( boolean isEnable)
	{
		loggerEnable = isEnable;
	}
	
	public Logger( Logger l)
	{
		this(l.getLoggerEnable());
	}
	
	public boolean getLoggerEnable()
	{
		return loggerEnable;
	}
	
	public void setLoggerEnable(boolean isEnable)
	{
		loggerEnable = isEnable;
	}
	
	public String writeLine(String input)
	{
		
		if( loggerEnable == true)
		{
			Date date = new Date();
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(logName, true))))
			{
				out.println(date);
				out.println("______________________________________________________");
				out.println(input);

			}
		
			catch (FileNotFoundException e)
			{
				System.out.println(e.getMessage());
				System.exit(0);
			}
		
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		System.out.println(input);
		return input;
	} 
	
	public String logIt()
	{
	
		Scanner scan;
		char userInput = ' '; 
		String textName = "";
	
			scan = new Scanner(System.in);
			userInput = scan.next().charAt(0);
			try
			{
			if( userInput == 'y'|| userInput == 'Y')
			{
				setLoggerEnable(true);
				System.out.println("What is the name of the text file you want to dump your results on?");
				textName = scan.next();
				logName = textName;
			}
		
			else if(userInput != 'n'&& userInput != 'N')
			{
				throw new ResponseException();
			}
			}
			catch(ResponseException e)
			{
				System.out.println(e.getMessage());
				System.out.println("The program will now close");
				System.exit(0);
			}
			return logName;
		
	}
	
	public void option2(String textFile)
    {
  
    	File directory = new File(textFile);
        File[] fList = directory.listFiles();
        
        for (File file : fList)
        {
            if (file.isFile())
            {
                writeLine(file.getAbsolutePath());
            } 
            
            else if (file.isDirectory())
            {
                option2(file.getAbsolutePath());
            }
        }
    }
    
   public void option3(String name,File file)
    {
        File[] list = file.listFiles();
        if(list!=null)
        for (File fil : list)
        {
            if (fil.isDirectory())
            {
                option3(name,fil);
            }
            else if (name.equalsIgnoreCase(fil.getName()))
            {
                System.out.println(fil.getAbsolutePath());
            }
        }
    }
    
    public void option4(String ext,File file)
    {
        File[] list = file.listFiles();
        if(list!=null)
        for (File fil : list)
        {
            if (fil.isDirectory())
            {
                option4(ext,fil);
            }
            else if (extention(fil.getName(), ext))
            {
                System.out.println(fil.getAbsolutePath());
            }
        }
    }
    
    public void option5(String f1, String f2, String f3)
    {
    	Scanner scan1;
    	Scanner scan2;
    	PrintWriter outputStream;
    	try
    	{
    		scan1 = new Scanner(new File(f1));
    		scan2 = new Scanner(new File(f2));
    		outputStream = new PrintWriter(new FileOutputStream(f3));
    		while(scan1.hasNextLine())
    		{
    			outputStream.println(scan1.nextLine());
    		}
    		while(scan2.hasNextLine())
    		{
    			outputStream.println(scan2.nextLine());
    		}
    		outputStream.close();
    	}
    	
    	catch (FileNotFoundException e)
		{
			System.out.println(e.getMessage());
			System.exit(0);
		}
    }
    
  public boolean extention(String name, String ext)
  {
  	  String extention = "";
  	  int i = name.lastIndexOf('.');
  	  if(i >0)
  	  	  {
  	  	  	  extention = name.substring(i);
  	  	  }
  	  if (extention.equals(ext))
  	  {
  	  	  return true;
  	  }
  	  else
  	  	  return false;
  }   
	
}