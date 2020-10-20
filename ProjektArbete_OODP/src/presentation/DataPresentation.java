package presentation;



import activity.Activity;


public class DataPresentation {

	
	public double getTotalDistance(Activity activity) { // TOTALDISTANS
		double sumTD = 0;
		for (int i = 0; i < activity.getPointList().size(); i++) {
			sumTD = activity.getPointList().get(i).getDistance();
		}
		return sumTD;
	}

	public double getAvargeHeartRate(Activity activity) { // MEDELPULS
		double sumHR = 0;
		for (int i = 0; i < activity.getPointList().size(); i++) {
			sumHR = sumHR + activity.getPointList().get(i).getHeartRate();
		}
		double avgHR = sumHR / activity.getPointList().size();
		return avgHR;
	}

	public double getMaxHeartRate(Activity activity) { // MAXPULS
		double maxHR = 0;
		for (int i = 0; i < activity.getPointList().size(); i++) {
			if (maxHR < activity.getPointList().get(i).getHeartRate())
				maxHR = activity.getPointList().get(i).getHeartRate();
		}
		return maxHR;
	}
	
	public double getMinHeartRate(Activity activity) { //MINPULS
		double minHR = activity.getPointList().get(0).getHeartRate(); 
		for (int i = 0; i < activity.getPointList().size(); i++) {
			if(minHR > activity.getPointList().get(i).getHeartRate())
				minHR = activity.getPointList().get(i).getHeartRate();
	}
		return minHR;
	}

	public double getAverageAltitude(Activity activity) { // MEDELALTITUD

		double sumA = 0;
		for (int i = 0; i < activity.getPointList().size(); i++) {
			sumA = sumA + activity.getPointList().get(i).getAltitude();
		}

		double avgA = sumA / activity.getPointList().size();
		return avgA;
	}

	public double getMaxAltitude(Activity activity) {  // MAXALTITUD
		double maxA = 0;
		for (int i = 0; i < activity.getPointList().size(); i++) {
			if (maxA < activity.getPointList().get(i).getAltitude())
				maxA = activity.getPointList().get(i).getAltitude();
		}
		return maxA;

	}
	
	public double getMinAltitude(Activity activity) { //MINALTITUDE
		double minA = activity.getPointList().get(0).getAltitude(); 
		for (int i = 0; i < activity.getPointList().size(); i++) {
			if(minA > activity.getPointList().get(i).getAltitude())
				minA = activity.getPointList().get(i).getAltitude();
	}
		return minA;
	}
	
	

	public double getAverageSpeed(Activity activity) { //MEDELHASTIGHET 
		double sumAS = 0;
		for (int i = 0; i < activity.getPointList().size(); i++) {
			if(i != 0) {
			sumAS = sumAS + activity.getPointList().get(i).getSpeed();
			}
		}
		double avgAS = sumAS / activity.getPointList().size();
		return avgAS;	
	}

	public double getMaxSpeed(Activity activity) {   //MAXHASTIGHET
		double maxMS = 0;
		for (int i = 0; i < activity.getPointList().size(); i++) {
			if (maxMS < activity.getPointList().get(i).getSpeed())
				maxMS = activity.getPointList().get(i).getSpeed();
		}
		return maxMS;
	}
	
	public double getMinSpeed(Activity activity) { //MINHASTIGHET (inte klar, sortera bort nollvärden ifrån tabellen)
		
	
		double minS = activity.getPointList().get(0).getSpeed(); 
		for (int i = 0; i < activity.getPointList().size(); i++) {
			if(minS > activity.getPointList().get(i).getSpeed())
				minS = activity.getPointList().get(i).getSpeed();
	}
		return minS;
	}
	
	
	
	

	

	public double getAverageCadence(Activity activity) { //MEDELKADENS 
		double sumAC = 0;
		for (int i = 0; i < activity.getPointList().size(); i++) {
			if(i != 0) {
			sumAC = sumAC + activity.getPointList().get(i).getCadence();
			}
		}
		double avgAC = sumAC / activity.getPointList().size();
		return avgAC;	

	}

	public double getMaxCadence(Activity activity) {   //MAXKADENS
		double maxC = 0;
		for (int i = 0; i < activity.getPointList().size(); i++) {
			if (maxC < activity.getPointList().get(i).getCadence())
				maxC = activity.getPointList().get(i).getCadence();
		}
		return maxC;
	}
	
	
	public double getMinCadence(Activity activity) { //MINKADENS  (INTE KLAR, SORTERA BORT NOLLVÄRDEN)
		double minC = 0; 
		
		for (int i = 0; i < activity.getPointList().size(); i++) {
			
			if(minC > activity.getPointList().get(i).getCadence())
				minC = activity.getPointList().get(i).getCadence();
	}
		return minC;
	}
	


	public double getAverageInclination(Activity activity) {   // MEDELLUTNING (INTE KLAR)
		
		
		double avgAI = 0;
	
		
		return avgAI;	
	}

	public double getMaxInclination(Activity activity) {   // MAXLUTNING (INTE KLAR)
	
		double maxI = 0;
		
	return 0;
	}
	
	
	public double getMinInclination(Activity activity) {  //MINSTALUTNING (INTE KLAR)
		
		
		
		return 0; 
	}
	}


