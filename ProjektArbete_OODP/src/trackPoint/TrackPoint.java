package trackPoint;

public class TrackPoint implements TrackingPointType{

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
	
	@Override
	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public void setTime(String time) {
		this.time = time;
	}
	
	@Override
	public void setElapsedTime(double elapsedTime) {
		this.elapsedTime = elapsedTime;
	}
	
	@Override
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	
	@Override
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	
	@Override
	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}
	
	@Override
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	@Override
	public String getDate() {
		return this.date;
	}
	
	@Override
	public String getTime() {
		return this.time;
	}
	
	@Override
	public double getElapsedTime() {
		return this.elapsedTime;
	}
	
	@Override
	public double getLongitude() {
		return this.longitude;
	}
	
	@Override
	public double getLatitude() {
		return this.latitude;
	}

	@Override
	public double getAltitude() {
		return this.altitude;
	}

	@Override
	public double getDistance() {
		return this.distance;
	}
	
	
	@Override
	public String toString() {
		
		String row = this.date + ", " + this.time + ", " + Double.toString(this.elapsedTime) + ", " + Double.toString(this.longitude) + ", " + Double.toString(this.latitude) + ", " + Double.toString(this.altitude) + ", " + Double.toString(this.distance);
		
		return row;
	}
	
}
