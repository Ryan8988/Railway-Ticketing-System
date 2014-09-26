package com.mercury.resources;

import java.util.*;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mercury.beans.Station;
import com.mercury.beans.StationInfo;
import com.mercury.service.StationService;

@Path("/station")
public class StationResource {
	private StationService staSer;

	public StationResource() {
		if (staSer == null) {
			ApplicationContext actx = new ClassPathXmlApplicationContext("config.xml");
			staSer = (StationService) actx.getBean("stationService");
		}
	}

	@POST
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public StationInfo execute(
			@FormParam("stationName") String stationName,
			@FormParam("stationId") int stationId, 
			@FormParam("city") String city,
			@FormParam("state") String state) {
		Station station = new Station();

		station.setStationName(stationName);
		station.setStationId(stationId);
		station.setCity(city);
		station.setState(state);

//		 StationInfo stationInfo = new StationInfo();
//		 List<Station> list=new ArrayList<Station>();
//		 list.add(station);
//		 list.add(station);
//		 stationInfo.setStations(list);
//		 stationInfo.setMsg("Hi");
//		
//		 return stationInfo;
		return staSer.process(station);
	}
}
