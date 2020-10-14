package data;

//C:\\Users\\fredr\\OneDrive\\Dokument\\ObjektOrienteradProgramering\\Projekt\\CSV-filer\\csv\\CSV_TestFile.csv - Datasökväg

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class DataRead {

	private String path;
	private String line = "";
	
	DataRead(String path) {
		this.path = path;
	}
	
	
	public void readFile() {
	try {
		BufferedReader br = new BufferedReader(new FileReader(path));
		
		
			while((line = br.readLine()) != null) {
				String[] values  = line.split(";");
				
				System.out.println(values[2]);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		
		DataRead dr = new DataRead("C:\\Users\\fredr\\OneDrive\\Dokument\\ObjektOrienteradProgramering\\Projekt\\CSV-filer\\csv\\CSV_TestFile.csv");
		dr.readFile();
			
	}

	
	
}
