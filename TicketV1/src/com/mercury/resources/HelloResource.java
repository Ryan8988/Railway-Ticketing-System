package com.mercury.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mercury.beans.Station;
import com.mercury.beans.StationInfo;
import com.mercury.beans.Ticket;
import com.mercury.service.HelloService;

@Path("/hello")
public class HelloResource {
	private HelloService hs;
	
	public HelloResource() {
		if (hs==null) {
			ApplicationContext actx = new ClassPathXmlApplicationContext("config.xml");
			hs = (HelloService)actx.getBean("helloService");
		}
	}

	@POST
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public StationInfo execute(
			@FormParam("name") String name,
			@FormParam("st_id") int st_id,
			@FormParam("city") String city,
			@FormParam("state") String state){
		Station station = new Station();
		
		station.setName(name);
		station.setSt_id(st_id);
		station.setCity(city);
		station.setState(state);

//		StationInfo stationInfo = new StationInfo();
//		List<Station> list=new ArrayList<Station>();
//		list.add(station);
//		list.add(station);
//		stationInfo.setStations(list);
//		stationInfo.setMsg("Hi");
//		
//		return stationInfo;
		return hs.process(station);
	}
}
