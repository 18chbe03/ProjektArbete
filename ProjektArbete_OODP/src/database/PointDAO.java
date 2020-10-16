package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import trackPoint.TrackPoint;

public class PointDAO {
	DbConnectionManager dbConManagerSingleton = null;
	
	public List<TrackPoint> getAll() {
		List<TrackPoint> list = new ArrayList<>();
	
		dbConManagerSingleton =DbConnectionManager.getInstance();
		try {
			ResultSet resultSet = dbConManagerSingleton.excecuteQuery("SELECT Date, Time, ElapsedTim, Longitude, latitude, altitude, distance, heartrate,speed, cadence   FROM points");
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
	
	public List<TrackPoint> update(TrackPoint p) {
		List<TrackPoint> list = new ArrayList<>();
		PreparedStatement preparedStatement = null; 
		
		ResultSet resultSet = null;
		
		
		
		try {
			preparedStatement = dbConManagerSingleton.prepareStatement("Insert INTO points(Date, Time, ElapsedTim , Latitude ,Longitude ,Altitude ,Distance ,HeartRate , Speed ,Cadence) values(CAST(? AS DATE), CAST(? AS TIME), ?, ?, ?, ?, ?,?, ?, ?)");
			
			preparedStatement.setString(1, p.getDate());
			preparedStatement.setString(2, p.getTime());
			preparedStatement.setDouble(3, p.getElapsedTime());
			preparedStatement.setDouble(4, p.getLatitude());
			preparedStatement.setDouble(5, p.getLongitude());
			preparedStatement.setDouble(6, p.getAltitude());
			preparedStatement.setDouble(7, p.getDistance());
			preparedStatement.setInt(8, p.getHeartRate());
			preparedStatement.setDouble(9, p.getSpeed());
			preparedStatement.setInt(10, p.getCadence());
			
			
			preparedStatement.execute();
			
			resultSet = preparedStatement.getResultSet();
			//resultSet.next();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list; 
		
		
		
		
	}
	
	

	
}
