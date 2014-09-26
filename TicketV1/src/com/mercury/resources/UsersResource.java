package com.mercury.resources;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mercury.beans.Station;
import com.mercury.beans.StationInfo;
import com.mercury.beans.Users;
import com.mercury.beans.UsersInfo;
import com.mercury.service.StationService;
import com.mercury.service.UsersService;
@Path("/users")
public class UsersResource {
	private UsersService staSer;

	public UsersResource() {
		if (staSer == null) {
			ApplicationContext actx = new ClassPathXmlApplicationContext("config.xml");
			staSer = (UsersService) actx.getBean("usersService");
		}
	}

	@POST
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public UsersInfo execute(
			@FormParam("user_id") int user_id,
			@FormParam("username") String username, 
			@FormParam("password") String password,
			@FormParam("first_name") String first_name) {
		Users users = new Users();

		users.setUser_id(user_id);
		users.setUsername(username);
		users.setPassword(password);
		users.setFirst_name(first_name);

		// StationInfo stationInfo = new StationInfo();
		// List<Station> list=new ArrayList<Station>();
		// list.add(station);
		// list.add(station);
		// stationInfo.setStations(list);
		// stationInfo.setMsg("Hi");
		//
		// return stationInfo;
		return staSer.process(users);
	}
}
