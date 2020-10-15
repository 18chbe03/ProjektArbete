package trackPoint;

public interface TrackingPointType {
	void setDate(String date);
	void setDistance(double distance);
	void setAltitude(double altitude);
	void setLatitude(double latitude);
	void setLongitude(double longitude);
	void setElapsedTime(double elapsedTime);
	void setTime(String time);
	double getDistance();
	double getAltitude();
	double getLatitude();
	double getLongitude();
	double getElapsedTime();
	String getTime();
	String getDate();
}
