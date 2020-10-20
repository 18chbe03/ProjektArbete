package application;

import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingUtilities;

import activity.Activity;
import database.ActivityDAO;
import database.DaoType;
import database.PointDAO;
import presentation.DataPresentation;
import trackPoint.TrackPoint;
import view.ActivityClockGUI;


public class Application {

	public static void main(String [] args ) {
		
		//Activity activity1 = new Activity(1, "Löprunda");
		//activity1.importData("C:\\Users\\fredr\\OneDrive\\Dokument\\ObjektOrienteradProgramering\\Projekt\\CSV-filer\\csv\\öppetSpårSälenMora\\activity_3412661142.csv");
		//activity1.addActivity()
		ActivityDAO activityDao = new ActivityDAO();
		List<Activity> activityList = new ArrayList<Activity>();
		activityList = activityDao.getAllActivitys();
		
		System.out.println(activityList.get(0).getName());
		activityList.get(0).setActivityList();
		
		
		DataPresentation dp = new DataPresentation();
		
		System.out.println("AvgSpeed: " + dp.getAverageSpeed(activityList.get(0)));
		/*System.out.println("MaxSpeed: " + dp.getMaxSpeed(activityList.get(0)));
		System.out.println("MinSpeed: " + dp.getMinSpeed(activityList.get(0)));
		System.out.println("Totaldistance: " + dp.getTotalDistance(activityList.get(0)));
		System.out.println("AvgHR: " + dp.getAvargeHeartRate(activityList.get(0)));
		System.out.println("MaxHr: " + dp.getMaxHeartRate(activityList.get(0)));
		System.out.println("MinHR: "  + dp.getMinHeartRate(activityList.get(0)));*/
		

        //SwingUtilities.invokeLater(() -> new ActivityClockGUI());
    
        System.out.println();
	}
        
}

		
