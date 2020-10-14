package trackPoint;

public class TrackPoint {

	private String date;
	private String time;
	private double elapsedTime;
	private double longitude;
	private double latitude;
	private double altitude;
	private double distance;
	
	
	public TrackPoint(String date, String time, double elapsedTime, double longitude, double latitude, double altitude, double distance){
		this.date = date;
		this.time = time;
		this.elapsedTime = elapsedTime;
		this.longitude = longitude;
		this.latitude = latitude;
		this.altitude = altitude;
		this.distance = distance;
	};
	
	public TrackPoint() {
		
	}
	
	
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
	
	@Override
	public String toString() {
		
		String row = this.date + "," + this.time + "," + Double.toString(this.elapsedTime) + "," + Double.toString(this.longitude) + "," + Double.toString(this.latitude) + "," + Double.toString(this.altitude) + "," + Double.toString(this.distance);
		
		return row;
	}
	
}
