package application;

import java.util.List;

import javax.swing.SwingUtilities;

import activity.Activity;
import database.DaoType;
import database.PointDAO;
import presentation.DataPresentation;
import trackPoint.TrackPoint;
import view.ActivityClockGUI;


public class Application {

	public static void main(String [] args ) {
		
		Activity activity = new Activity(1, "BRÄNNBOOLL");
		//DaoType<TrackPoint> pointDao = new PointDAO();
		
		activity.getActivity();

	DataPresentation dp = new DataPresentation(); 
	
	System.out.println("AvgSpeed: " + dp.getAverageSpeed(activity));
	System.out.println("MaxSpeed: " + dp.getMaxSpeed(activity));
	System.out.println("MinSpeed: " + dp.getMinSpeed(activity));
	System.out.println("Totaldistance: " + dp.getTotalDistance(activity));
	System.out.println("AvgHR: " + dp.getAvargeHeartRate(activity));
	System.out.println("MaxHr: " + dp.getMaxHeartRate(activity));
	System.out.println("MinHR: "  + dp.getMinHeartRate(activity));
		

        //SwingUtilities.invokeLater(() -> new ActivityClockGUI());
    
        System.out.println();
        
	}

		
//DaoType<TrackPoint> pointDao = new PointDAO();
	//	TrackPoint update = new TrackPoint ("2016-09-24" , "11:50:03", 0, 18.1765415, 59.359862, 26, 0.3,0,0,0 );
	//	DataPresentation dp = new DataPresentation("");
		
	//	List <TrackPoint> list = pointDao.getActivityPointsById(2);

	//	for(int i = 0; i < list.size(); i++) {
			//System.out.println(list.get(i).toString());	
		
		//System.out.print(pointDao.getAll());
		}

	//	System.out.println("Den genomsnittliga pulsen under rundan var: " + dp.getAvargeHeartRate());
	//	System.out.println("Maxpuls under rundan var: " + dp.getMaxHeartRate());*/
	
		//DaoType<TrackPoint> pointDao = new PointDAO();
		
		/*DataRead dr = new DataRead("C:\\Users\\fredr\\Documents\\Objektorienterad prog\\Projekt\\Datafiler\\csv\\activity_3412661142.csv");
		List<TrackPoint> list = new ArrayList<TrackPoint>();
		list = dr.readFile();
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
		List<TrackPoint> listTest = new ArrayList<TrackPoint>();
		TrackPoint update = new TrackPoint ("2016-09-24" , "11:50:03", 0, 18.1765415, 59.359862, 26, 0.3,0,0,0 );
		listTest.add(update);
		
		pointDao.update(list);*/
	//}


//}