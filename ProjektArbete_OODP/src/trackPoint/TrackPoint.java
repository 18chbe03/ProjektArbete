package trackPoint;

public class TrackPoint {

	private String date;
	private String time;
	private double elapsedTime;
	private double longitude;
	private double latitude;
	private double altitude;
	private double distance;
	
	
	TrackPoint(){
		
	};
	
	
	public void setDate(String date) {
		this.date = date;
	}
	
	
	public void setTime(String time) {
		this.time = time;
	}
	
	
	public void setElapsedTime(double elapsedTime) {
		this.elapsedTime = elapsedTime;
	}
	
	
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	
	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}
	
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
}
