
/**
 * CS 2003 - Lab 1
 * Code to find the maximum integer in a given file
 * NOTE:
 * there are bugs including those causing compilation errors and
 * resulting in runtime logical problems
 *
 * @Kasey Mills
 */






import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class SeatMap 
{

	public static void main(String args[]) 
	{
			Scanner newFile;
			String [][] namesArray = new String[3][10];
			int column = -1;
			int rows = 0;
			String names;
			
			
			
			try 
			{
				newFile = new Scanner (new File("names.dat"));

				while (newFile.hasNext()) 
				{
					
					if (column == 2)
					{
						column = 0;
						rows++;
					}
					else
					{
						column++;
					}
					
					names = newFile.nextLine();
					names = namesArray[rows][column];
					
					System.out.println(namesArray[rows][column]);

				}	
					
			
				
			}
			
			catch (FileNotFoundException e) 
			{
				// TODO Auto-generated catch block
				System.out.println("error");
			}
			
	}

		
		
	
	
}
