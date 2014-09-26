package com.mercury.dao;

import java.util.List;

import com.mercury.beans.Station;

public interface StationDao {
	public void save(Station station);
	public List<Station> query();
	public void delete(Station station);
	public void update(Station station);
	public Station findByStationName(String stationName);	
}
