package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import activity.Activity;
import trackPoint.TrackPoint;

public class ActivityDAO  {

	DbConnectionManager dbConManagerSingleton = null;
	
	public void update(int id, String name) {
		
		PreparedStatement preparedStatement = null; 
		dbConManagerSingleton =DbConnectionManager.getInstance();
		
		try {
			
			preparedStatement = dbConManagerSingleton.prepareStatement("Insert INTO activity(activity_id, activity_name) values(?, ?)");
			
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);

			preparedStatement.execute();
			
		}
		 catch (SQLException e) {
			e.printStackTrace();
		}	
		
	}
	
	public List<Activity> getAllActivitys() {
		
		dbConManagerSingleton =DbConnectionManager.getInstance();
		List<Activity> activityList = new ArrayList<Activity>();
		
		try {
			ResultSet resultSet = dbConManagerSingleton.excecuteQuery("SELECT activity_id, activity_name FROM activity");
			while(resultSet.next()) {
				activityList.add(new Activity(resultSet.getInt(1),
						resultSet.getString(2).trim())
						);
			}
			dbConManagerSingleton.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return activityList;
	}
}
	

