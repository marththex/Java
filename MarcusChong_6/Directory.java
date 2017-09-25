import java.io.File;

public class Directory
{
	Logger log = new Logger(true)
	private String textName;
	
	public Directory()
	{
		textName = "";
	}
	
	public Directory(String textFile)
	{
		textName = textFile;
	}
    public void option2(String textFile)
    {
        File directory = new File(directoryName);
   
        File[] fList = directory.listFiles();
        
        for (File file : fList)
        {
            if (file.isFile())
            {
                log.writeln(file.getAbsolutePath());
            } 
            
            else if (file.isDirectory())
            {
                listFilesAndFilesSubDirectories(file.getAbsolutePath());
            }
        }
    }
    