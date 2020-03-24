/////////////////////////////////////////////////////////////////////////
// Program: CSV_Splitter.java
// Author: Joseph Martin
// Date: 3/17/2020
// Description: A program used to split CSV files and only take the
//              columns for each according to what user wants. Input
//              is the giant CSV file. Criteria is new CSV files can't
//              already exist, as it appends.
/////////////////////////////////////////////////////////////////////////

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSV_Splitter {
	
	public static void main(String args[]) throws IOException {
		
		//creates different files for each deer
		//TODO: Change all file paths to wherever you want them to be
		File F16 = new File("C:/Users/josep/Downloads/F16.csv");
		F16.createNewFile();
		File F17 = new File("C:/Users/josep/Downloads/F17.csv");
		F17.createNewFile();
		File F18 = new File("C:/Users/josep/Downloads/F18.csv");
		F18.createNewFile();
		File F19 = new File("C:/Users/josep/Downloads/F19.csv");
		F19.createNewFile();
		File F21 = new File("C:/Users/josep/Downloads/F21.csv");
		F21.createNewFile();
		File F22 = new File("C:/Users/josep/Downloads/F22.csv");
		F22.createNewFile();
		File F23 = new File("C:/Users/josep/Downloads/F23.csv");
		F23.createNewFile();
		File F24 = new File("C:/Users/josep/Downloads/F24.csv");
		F24.createNewFile();
		File F25 = new File("C:/Users/josep/Downloads/F25.csv");
		F25.createNewFile();
		File F26 = new File("C:/Users/josep/Downloads/F26.csv");
		F26.createNewFile();
		File F27 = new File("C:/Users/josep/Downloads/F27.csv");
		F27.createNewFile();
		File F28 = new File("C:/Users/josep/Downloads/F28.csv");
		F28.createNewFile();
		File F29 = new File("C:/Users/josep/Downloads/F29.csv");
		F29.createNewFile();
		File F32a = new File("C:/Users/josep/Downloads/F32a.csv");
		F32a.createNewFile();
		File F33 = new File("C:/Users/josep/Downloads/F33.csv");
		F33.createNewFile();
		File F34 = new File("C:/Users/josep/Downloads/F34.csv");
		F34.createNewFile();
		File F35 = new File("C:/Users/josep/Downloads/F35.csv");
		F35.createNewFile();
		
		//loads in file
		//TODO: Change this to correct file path of giant CSV file with all values
		Scanner scanner = new Scanner(new File("C:/Users/josep/Downloads/SampleCSV - Sheet1.csv"));
		
		//checks values between commas
		scanner.useDelimiter(",");
		
		//scanner.nextLine() skips the first line of labels and no data
		scanner.nextLine();
		
		while (scanner.hasNext()) {
			
			scanner.next(); //skips first line and goes straight to deer id (column 2)
			String temp = scanner.next();
			temp = temp.substring(1, temp.length() - 1); //gets rid of quotes around deer id
			
			//used to write the desired values into the appropriate file
			//TODO: change file path to appropriate CSV file destination
			BufferedWriter writer = new BufferedWriter(
                    new FileWriter("C:/Users/josep/Downloads/" + temp + ".csv", true)
                );  
			
//			System.out.print(temp);
			scanner.next();
			scanner.next();
			writer.write(scanner.next());
			writer.write(",");
			writer.write(scanner.next());
			writer.write(",");
			scanner.next();
			scanner.next();
			scanner.next();
			scanner.next();
			writer.write(scanner.next());
			writer.newLine();
			writer.close();
			scanner.nextLine();
		}
	         
		scanner.close();
	}
}
