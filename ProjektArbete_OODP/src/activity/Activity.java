package activity;

import java.util.*;

import database.*;
import trackPoint.*;

public class Activity {

	
	private int activityId;
	private String activityName;
	private List<TrackPoint> pointList;
	
	public Activity(int activityId, String activityName) {
		this.activityId = activityId;
		this.activityName = activityName;
		
	}
	
	public String setActivityName() { // EJ KLAR!
		
		return null;
	}
	
	
	public void getActivity() {
		PointDAO pointsDao = new PointDAO();
		this.pointList = pointsDao.getAll();
	}
	
	public List<TrackPoint> getPointList() {
		
		return pointList; 
	}
	
	
	

}
