package com.mercury.service;


import java.util.*;

import com.mercury.beans.Station;
import com.mercury.beans.StationInfo;
import com.mercury.dao.HelloDao;
import com.mercury.dao.impl.HelloDaoImpl;

public class HelloService {
	private HelloDao hd;
	
	public HelloDao getHd() {
		return hd;
	}
	public void setHd(HelloDao hd) {
		this.hd = hd;
	}

	public StationInfo process(Station station) {
		hd.save(station);
		StationInfo stationInfo = new StationInfo();
		stationInfo.setMsg("Hello " + station.getName() + ", welcome to JavaEE!");
		stationInfo.setStations(hd.queryAll());
		
//		List<Station> list=new ArrayList<Station>();
//		list.add(station);
//		list.add(station);
//		stationInfo.setStations(list);
		return stationInfo;
	}
}
