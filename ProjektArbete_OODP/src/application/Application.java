package application;

import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingUtilities;

import activity.*;
import database.ActivityDAO;
import database.DaoType;
import database.PointDAO;
import presentation.DataPresentation;
import trackPoint.TrackPoint;
import view.ActivityClockGUI;


public class Application {

	public static void main(String [] args ) {
		
		/*String path1 = "C:\\Users\\fredr\\OneDrive\\Dokument\\ObjektOrienteradProgramering\\Projekt\\CSV-filer\\csv\\öppetSpårSälenMora\\activity_3412661142.csv";
		
		Activity activity1 = new Activity(1, "Löprunda");
		activity1.importData("C:\\Users\\fredr\\OneDrive\\Dokument\\ObjektOrienteradProgramering\\Projekt\\CSV-filer\\csv\\öppetSpårSälenMora\\activity_3412661142.csv");
		activity1.addActivityToDB();*/
	
		ActivityManager activityManager = new ActivityManager();
		List<Activity> activityList = new ArrayList<Activity>();
		activityList = activityManager.getAllActivitys();
		
		
		System.out.println(activityList.get(0).getName());
		
		
		DataPresentation dp = new DataPresentation();
		
		System.out.println("AvgSpeed: " + dp.getAverageSpeed(activityList.get(0)));
		System.out.println("MaxSpeed: " + dp.getMaxSpeed(activityList.get(0)));
		System.out.println("MinSpeed: " + dp.getMinSpeed(activityList.get(0)));
		System.out.println("Totaldistance: " + dp.getTotalDistance(activityList.get(0)));
		System.out.println("AvgHR: " + dp.getAvargeHeartRate(activityList.get(0)));
		System.out.println("MaxHr: " + dp.getMaxHeartRate(activityList.get(0)));
		System.out.println("MinHR: "  + dp.getMinHeartRate(activityList.get(0)));
		

        //SwingUtilities.invokeLater(() -> new ActivityClockGUI());
    
        System.out.println();
	}
        
}

		
