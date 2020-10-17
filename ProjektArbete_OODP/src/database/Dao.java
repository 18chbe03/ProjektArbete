package database;
import java.util.List;
import trackPoint.TrackPoint;

public interface Dao<T> {

	List<T> getAll();
	void update(List<T> tList);
	
}
