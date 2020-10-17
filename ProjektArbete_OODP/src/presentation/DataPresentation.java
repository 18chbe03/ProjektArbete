package presentation;
import java.util.*;
import database.*;
import trackPoint.*;

public class DataPresentation {

	private Dao<TrackPoint> pointsDao = new PointDAO();
	private List<TrackPoint> pointList = pointsDao.getAll();
			
	public double getAvargeHeartRate() {
		double sumHR = 0;
		for(int i = 0; i < pointList.size(); i++) {
			sumHR = sumHR + pointList.get(i).getHeartRate();
		}
		double avgHR = sumHR / pointList.size();
		return avgHR;
	}
	
	public double getMaxHeartRate() {
		double maxHR = 0;
		for(int i = 0; i < pointList.size(); i++) {
			if(maxHR < pointList.get(i).getHeartRate())
				maxHR =  pointList.get(i).getHeartRate();
		}
		return maxHR;
	}
	
}
 