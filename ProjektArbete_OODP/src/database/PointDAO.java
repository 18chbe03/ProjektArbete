package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import trackPoint.TrackPoint;

public class PointDAO /*implements DaoType<TrackPoint>*/{
	
	DbConnectionManager dbConManagerSingleton = null;
	
	public List<TrackPoint> getActivityPointsById(int id) {
		List<TrackPoint> list = new ArrayList<>();
		dbConManagerSingleton =DbConnectionManager.getInstance();
		
		try {
			ResultSet resultSet = dbConManagerSingleton.excecuteQuery("SELECT date, time, elapsed_time, longitude, latitude, altitude, distance, heartrate,speed, cadence FROM point WHERE activity_id = " + id);
			while(resultSet.next()) {
				list.add(new TrackPoint(resultSet.getString(1).trim(),
						resultSet.getString(2).trim(),
						resultSet.getDouble(3),
						resultSet.getDouble(4),
						resultSet.getDouble(5),
						resultSet.getDouble(6),
						resultSet.getDouble(7),
						resultSet.getInt(8),
						resultSet.getDouble(9),
						resultSet.getInt(10)
						)
						);
			}
			dbConManagerSingleton.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return list;
	}
	
	
	public List<TrackPoint> getAll() {
		List<TrackPoint> list = new ArrayList<>();
	
		dbConManagerSingleton =DbConnectionManager.getInstance();
		try {
			ResultSet resultSet = dbConManagerSingleton.excecuteQuery("SELECT date, time, elapsed_time, longitude, latitude, altitude, distance, heartrate,speed, cadence FROM point");
			while(resultSet.next()) {
				list.add(new TrackPoint(resultSet.getString(1).trim(),
						resultSet.getString(2).trim(),
						resultSet.getDouble(3),
						resultSet.getDouble(4),
						resultSet.getDouble(5),
						resultSet.getDouble(6),
						resultSet.getDouble(7),
						resultSet.getInt(8),
						resultSet.getDouble(9),
						resultSet.getInt(10)
						)
						);
			}
			dbConManagerSingleton.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	

	public void update(List<TrackPoint> tList, int activityId) {
		

		PreparedStatement preparedStatement = null; 
		dbConManagerSingleton =DbConnectionManager.getInstance();
		
		
		try {
			
			preparedStatement = dbConManagerSingleton.prepareStatement("Insert INTO point(activity_id, date, time, elapsed_time, latitude, longitude, altitude, distance, heartRate, speed, cadence) values(?, CAST(? AS DATE), CAST(? AS TIME), ?, ?, ?, ?, ?,?, ?, ?)");
			
			for(int i = 0; i < tList.size(); i++) {
			
			preparedStatement.setInt(1, activityId);
			preparedStatement.setString(2, tList.get(i).getDate());
			preparedStatement.setString(3, tList.get(i).getTime());
			preparedStatement.setDouble(4, tList.get(i).getElapsedTime());
			preparedStatement.setDouble(5, tList.get(i).getLatitude());
			preparedStatement.setDouble(6, tList.get(i).getLongitude());
			preparedStatement.setDouble(7, tList.get(i).getAltitude());
			preparedStatement.setDouble(8, tList.get(i).getDistance());
			preparedStatement.setInt(9, tList.get(i).getHeartRate());
			preparedStatement.setDouble(10, tList.get(i).getSpeed());
			preparedStatement.setInt(11, tList.get(i).getCadence());
			
			
			preparedStatement.execute();
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
	}
	
	
}
