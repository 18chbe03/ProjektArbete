package data;

//C:\\Users\\fredr\\OneDrive\\Dokument\\ObjektOrienteradProgramering\\Projekt\\CSV-filer\\csv\\CSV_TestFile.csv - Datas�kv�g
//C:\\Users\\chris\\OneDrive\\Skrivbord\\Skola\\Hösttermin2020\\Objektorienteraddesignochprogrammering\\csv\\CSV_TestFile.csv

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import trackPoint.TrackPoint;


public class DataRead {

	private String path;
	private String line = "";
	private TrackPoint ref;
	private ArrayList<TrackPoint> trackPointList = new ArrayList<TrackPoint>();
	
	DataRead(String path) {
		this.path = path;
	}
	
	
	public ArrayList<TrackPoint> readFile() {
	try {
		BufferedReader br = new BufferedReader(new FileReader(path));
	
		
			while((line = br.readLine()) != null) {
				String[] values  = line.split(";");
				
				ref = new TrackPoint();
				ref.setTime(values[0].toString());
				ref.setDate(values[1].toString());
				ref.setElapsedTime(Double.parseDouble(values[2]));
				ref.setLongitude(Double.parseDouble(values[3]));
				ref.setLatitude(Double.parseDouble(values[4]));
				ref.setAltitude(Double.parseDouble(values[5]));
				ref.setDistance(Double.parseDouble(values[6])); 
					
				trackPointList.add(ref);
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		return trackPointList;
	}
	
	
	public static void main(String[] args) {
		
		DataRead dr = new DataRead("C:\\Users\\fredr\\OneDrive\\Dokument\\ObjektOrienteradProgramering\\Projekt\\CSV-filer\\csv\\CSV_TestFile.csv");
		ArrayList<TrackPoint> test = dr.readFile();
		
		
		TrackPoint pointTest = test.get(0);
		System.out.println(pointTest.toString());
	}

	
	
}
