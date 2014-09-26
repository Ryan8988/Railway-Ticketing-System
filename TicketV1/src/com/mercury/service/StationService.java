package com.mercury.service;

import com.mercury.beans.Station;
import com.mercury.beans.StationInfo;
import com.mercury.dao.StationDao;

public class StationService {
	private StationDao staDao;
	
	public StationDao getStaDao() {
		return staDao;
	}
	public void setStaDao(StationDao staDao) {
		this.staDao = staDao;
	}

	public StationInfo process(Station station) {
		staDao.save(station);
		StationInfo stationInfo = new StationInfo();
		stationInfo.setMsg("Hello " + station.getStationName() + ", welcome to JavaEE!");
		stationInfo.setStations(staDao.query());
		
//		List<Station> list=new ArrayList<Station>();
//		list.add(station);
//		list.add(station);
//		stationInfo.setStations(list);
		return stationInfo;
	}
}
