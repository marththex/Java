import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DNA
{
	private String input;
	private String output;
	
	public DNA()
	{
		input = "input.txt";
		output = "output.txt";
	}
	
	public DNA(String in, String out)
	{
		input = in;
		output = out;
	}
	
	public DNA( DNA d)
	{
		this(d.getInput(),d.getOutput());
	}
	
	public String getInput()
	{
		return input;
	}
	
	public String getOutput()
	{
		return output;
	}
	
	public void setInput(String in)
	{
		input = in;
	}
	
	public void setOutput(String out)
	{
		output = out;	
	}
	
	public boolean isEquals(Object o)
	{
		DNA d = (DNA)o;
		return input.equals(d.getInput()) && output.equals(d.getOutput());
	}
	
	public String toString()
	{
		return "Input: " + input + " Output: " + output;	
	}
	
	public String inputOutput()
	{
		Scanner inputStream = null;
		PrintWriter outputStream = null;
		String temp;
		String comp = "";
		String revComp = "";
		try
		{
			inputStream = new Scanner(new FileInputStream(input));
			outputStream = new PrintWriter(new FileOutputStream(output));	
			while(inputStream.hasNextLine())
			{
				temp = inputStream.nextLine();
				comp = complement(temp);
				outputStream.println(comp);
			}
			
			inputStream = new Scanner(new FileInputStream(input));	
			
			while(inputStream.hasNextLine())
			{
				temp = inputStream.nextLine();
				revComp = revComplement(temp);
				outputStream.println(revComp);
			}
			
			inputStream.close();
			outputStream.close();
			
		}
		
		catch (FileNotFoundException e)
		{
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		return comp + revComp;
		
	}
	
	public String complement(String temp)
	{
		String comp = "";
		for(int i = 0; i < temp.length(); ++i)
		{
			if(temp.charAt(i) == 'a')
				comp += "t";
			else if(temp.charAt(i) == 't')
				comp += "a";
			else if(temp.charAt(i) == 'c')
				comp += "g";
			else
				comp += "c";
					
		}
		return comp;
	}
	
	public String revComplement(String temp)
	{
		String revComp = "";
		String comp = complement(temp);
		for(int i = comp.length()- 1; i >= 0; --i)
		{
			revComp += comp.charAt(i);
		}
		
		return revComp;
	}

}