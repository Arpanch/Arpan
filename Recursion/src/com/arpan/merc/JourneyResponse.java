package com.arpan.merc;

import java.util.ArrayList;
import java.util.List;

public class JourneyResponse {

	private boolean isJourneyPossible=false;
	
	private List<Stations> stations=new ArrayList<Stations>();

	public boolean isJourneyPossible() {
		return isJourneyPossible;
	}

	public void setJourneyPossible(boolean isJourneyPossible) {
		this.isJourneyPossible = isJourneyPossible;
	}

	public List<Stations> getStations() {
		return stations;
	}

	public void setStations(List<Stations> stations) {
		this.stations = stations;
	}
	
	

}
