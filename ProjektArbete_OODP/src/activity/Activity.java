package activity;

import java.util.*;

import data.DataRead;
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
	
	public int getActivityId() {
		return this.activityId;
	}
	
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	

	public List<TrackPoint> getPointList() {
		return this.pointList; 
	}
	
	
	public void setActivityList() {
        PointDAO pointsDao = new PointDAO();
        this.pointList = pointsDao.getActivityPointsById(this.activityId);
    }
	
	
	public void importData(String path) {
		PointDAO pointsDao = new PointDAO();
		DataRead dr = new DataRead(path);
		this.pointList = dr.readFile();
		pointsDao.update(pointList, this.activityId);
	}
	
	private void addActivity() {
		ActivityDAO activityDao = new ActivityDAO();
		activityDao.update(this.activityId, this.activityName);
	}
	
	public String getName() {
		return this.activityName;
	}
	

}
