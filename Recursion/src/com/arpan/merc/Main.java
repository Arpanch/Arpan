package com.arpan.merc;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		int distance=100;
		int chargingLevel=10;
		
		List<Stations> stations=new ArrayList<>();
		populateStations(stations);
		
		JourneyResponse journeyResponse = isJourneyPossible(distance,chargingLevel,stations);
		
		System.out.println(journeyResponse.isJourneyPossible());
		System.out.println(journeyResponse.getStations());
		
		
		
	}

	private static JourneyResponse isJourneyPossible(int distance, int chargingLevel, List<Stations> stations) {
		JourneyResponse journeyRes=new JourneyResponse();
		List<Stations> resultantStations=new ArrayList<Stations>();
		boolean noOfStations=findMinStationJourney(distance,0, chargingLevel,stations,resultantStations);
		if(noOfStations) {
			journeyRes.setJourneyPossible(true);
			journeyRes.setStations(resultantStations);
		}
		
		return journeyRes;
	}

	private static boolean findMinStationJourney(int distnaceToTravel,int travelDistance, int chargingLevel, List<Stations> stations,
			List<Stations> resultantStations) {
		if(chargingLevel>=totalDistance) {
			return true;
		}
		for(int i=0;i<stations.size();i++) {
			if(stations.get(i).getDitanceFromSource()<distance)
		}
	}

	private static void populateStations(List<Stations> stations) {
		Stations s1=new Stations("s1",10,18);
		Stations s2=new Stations("s2",30,19);
		Stations s3=new Stations("s3",35,25);
		Stations s4=new Stations("s4",50,30);
		
		stations.add(s1);
		stations.add(s2);
		stations.add(s3);
		stations.add(s4);
	}
}
