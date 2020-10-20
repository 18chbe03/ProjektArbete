package database;
import java.util.List;
import trackPoint.TrackPoint;

public interface DaoType<T> {

	List<T> getAll();
	void update(List<T> tList);
	List<T> getActivityPointsById(int id);
	
}
