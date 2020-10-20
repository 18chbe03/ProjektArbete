package presentation;

import java.util.*;


import trackPoint.*;

public class DataPresentation {

	public List<TrackPoint> pointList;

	DataPresentation(List<TrackPoint> pointList) {
		this.pointList = pointList;
	}

	public double getTotalDistance() { // TOTALDISTANS
		double sumTD = 0;
		for (int i = 0; i < pointList.size(); i++) {
			sumTD = pointList.get(i).getDistance();
		}

		return sumTD;
	}

	public double getAvargeHeartRate() { // MEDELPULS
		double sumHR = 0;
		for (int i = 0; i < pointList.size(); i++) {
			sumHR = sumHR + pointList.get(i).getHeartRate();
		}
		double avgHR = sumHR / pointList.size();
		return avgHR;
	}

	public double getMaxHeartRate() { // MAXPULS
		double maxHR = 0;
		for (int i = 0; i < pointList.size(); i++) {
			if (maxHR < pointList.get(i).getHeartRate())
				maxHR = pointList.get(i).getHeartRate();
		}
		return maxHR;
	}
	
	public double getMinHeartRate() { //MINPULS
		double minHR = pointList.get(0).getHeartRate(); 
		for (int i = 0; i < pointList.size(); i++) {
			if(minHR > pointList.get(i).getHeartRate())
				minHR = pointList.get(i).getHeartRate();
	}
		return minHR;
	}

	public double getAverageAltitude() { // MEDELALTITUD

		double sumA = 0;
		for (int i = 0; i < pointList.size(); i++) {
			sumA = sumA + pointList.get(i).getAltitude();
		}

		double avgA = sumA / pointList.size();
		return avgA;
	}

	public double getMaxAltitude() {  // MAXALTITUD
		double maxA = 0;
		for (int i = 0; i < pointList.size(); i++) {
			if (maxA < pointList.get(i).getAltitude())
				maxA = pointList.get(i).getAltitude();
		}
		return maxA;

	}
	
	public double getMinAltitude() { //MINALTITUDE
		double minA = pointList.get(0).getAltitude(); 
		for (int i = 0; i < pointList.size(); i++) {
			if(minA > pointList.get(i).getAltitude())
				minA = pointList.get(i).getAltitude();
	}
		return minA;
	}
	
	

	public double getAverageSpeed() { //MEDELHASTIGHET 
		double sumAS = 0;
		for (int i = 0; i < pointList.size(); i++) {
			if(i != 0) {
			sumAS = sumAS + pointList.get(i).getSpeed();
			}
		}
		double avgAS = sumAS / pointList.size();
		return avgAS;	
	}

	public double getMaxSpeed() {   //MAXHASTIGHET
		double maxMS = 0;
		for (int i = 0; i < pointList.size(); i++) {
			if (maxMS < pointList.get(i).getSpeed())
				maxMS = pointList.get(i).getSpeed();
		}
		return maxMS;
	}
	
	public double getMinSpeed() { //MINHASTIGHET (inte klar, sortera bort nollvärden ifrån tabellen)
		
	
		double minS = pointList.get(0).getSpeed(); 
		for (int i = 0; i < pointList.size(); i++) {
			if(minS > pointList.get(i).getSpeed())
				minS = pointList.get(i).getSpeed();
	}
		return minS;
	}
	

	public double getAverageCadence() { //MEDELKADENS 
		double sumAC = 0;
		for (int i = 0; i < pointList.size(); i++) {
			if(i != 0) {
			sumAC = sumAC + pointList.get(i).getCadence();
			}
		}
		double avgAC = sumAC / pointList.size();
		return avgAC;	

	}

	public double getMaxCadence() {   //MAXKADENS
		double maxC = 0;
		for (int i = 0; i < pointList.size(); i++) {
			if (maxC < pointList.get(i).getCadence())
				maxC = pointList.get(i).getCadence();
		}
		return maxC;
	}
	
	
	public double getMinCadence() { //MINKADENS  (INTE KLAR, SORTERA BORT NOLLVÄRDEN)
		double minC = 0; 
		
		for (int i = 0; i < pointList.size(); i++) {
			
			if(minC > pointList.get(i).getCadence())
				minC = pointList.get(i).getCadence();
	}
		return minC;
	}
	


	public double getAverageInclination() {   // MEDELLUTNING (INTE KLAR)
		double avgAI = 0;
	
		
		return avgAI;	
	}

	public double getMaxInclination() {   // MAXLUTNING (INTE KLAR)
	
		double maxI = 0;
		
	return 0;
	}
	
	
	public double getMinInclination() {  //MINSTALUTNING (INTE KLAR)
		
		
		
		return 0; 
	}
	}


