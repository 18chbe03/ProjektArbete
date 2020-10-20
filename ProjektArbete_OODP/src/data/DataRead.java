package data;

//C:\\Users\\fredr\\OneDrive\\Dokument\\ObjektOrienteradProgramering\\Projekt\\CSV-filer\\csv\\CSV_TestFile.csv - Datas�kv�g
//C:\\Users\\chris\\OneDrive\\Skrivbord\\Skola\\Hösttermin2020\\Objektorienteraddesignochprogrammering\\csv\\CSV_TestFile.csv

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


import database.PointDAO;
import presentation.DataPresentation;
import trackPoint.TrackPoint;


public class DataRead {

	private String path;
	private String line = "";
	private TrackPoint ref;
	private ArrayList<TrackPoint> trackPointList = new ArrayList<TrackPoint>();
	
	public DataRead(String path) {
		this.path = path;
	}
	
	
	public ArrayList<TrackPoint> readFile() {
	try {
		BufferedReader br = new BufferedReader(new FileReader(path));
	
	
		
			while((line = br.readLine()) != null) {
				String[] values  = line.split(";");
				
				//System.out.println(values[0] + values[1] + values[2] + values[3] + values[4] + values[5]);
				
				ref = new TrackPoint();
				ref.setDate(values[0]);
				ref.setTime(values[1]);
				ref.setElapsedTime(Double.parseDouble(values[2]));
				ref.setLongitude(Double.parseDouble(values[3]));
				ref.setLatitude(Double.parseDouble(values[4]));
				ref.setAltitude(Double.parseDouble(values[5]));
				ref.setDistance(Double.parseDouble(values[6])); 
				ref.setHeartRate(Integer.parseInt(values[7]));
				ref.setSpeed(Double.parseDouble(values[8]));
				ref.setCadence(Integer.parseInt(values[9]));
				
					
				this.trackPointList.add(ref);
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		return this.trackPointList;
	}

}
