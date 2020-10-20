package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import trackPoint.TrackPoint;

public class PointDAO implements DaoType<TrackPoint>{
	
	DbConnectionManager dbConManagerSingleton = null;
	
	@Override
	public List<TrackPoint> getActivityPointsById(int id) {
		List<TrackPoint> list = new ArrayList<>();
		dbConManagerSingleton =DbConnectionManager.getInstance();
		
		try {
			ResultSet resultSet = dbConManagerSingleton.excecuteQuery("SELECT Date, Time, ElapsedTim, Longitude, latitude, altitude, distance, heartrate,speed, cadence FROM points WHERE activity = " + id);
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
	
	
	@Override
	public List<TrackPoint> getAll() {
		List<TrackPoint> list = new ArrayList<>();
	
		dbConManagerSingleton =DbConnectionManager.getInstance();
		try {
			ResultSet resultSet = dbConManagerSingleton.excecuteQuery("SELECT Date, Time, ElapsedTim, Longitude, latitude, altitude, distance, heartrate,speed, cadence FROM points");
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
	
	@Override
	public void update(List<TrackPoint> tList) {
		

		PreparedStatement preparedStatement = null; 
		dbConManagerSingleton =DbConnectionManager.getInstance();
		//ResultSet resultSet = null;
		
		
		try {
			
			preparedStatement = dbConManagerSingleton.prepareStatement("Insert INTO points(Date, Time, ElapsedTim , Latitude ,Longitude ,Altitude ,Distance ,HeartRate , Speed ,Cadence) values(CAST(? AS DATE), CAST(? AS TIME), ?, ?, ?, ?, ?,?, ?, ?)");
			
			for(int i = 0; i < tList.size(); i++) {
			
			preparedStatement.setString(1, tList.get(i).getDate());
			preparedStatement.setString(2, tList.get(i).getTime());
			preparedStatement.setDouble(3, tList.get(i).getElapsedTime());
			preparedStatement.setDouble(4, tList.get(i).getLatitude());
			preparedStatement.setDouble(5, tList.get(i).getLongitude());
			preparedStatement.setDouble(6, tList.get(i).getAltitude());
			preparedStatement.setDouble(7, tList.get(i).getDistance());
			preparedStatement.setInt(8, tList.get(i).getHeartRate());
			preparedStatement.setDouble(9, tList.get(i).getSpeed());
			preparedStatement.setInt(10, tList.get(i).getCadence());
		
			preparedStatement.execute();
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
	}
	
	
}
