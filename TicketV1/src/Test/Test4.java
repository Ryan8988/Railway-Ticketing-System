package Test;

import com.mercury.beans.Station;
import com.mercury.dao.HelloDao;

public class Test4 {
	public static void main(String[] args){
		HelloDao hd = null;
        Station station = new Station();
		
		station.setName("name");
		station.setSt_id(1);
		station.setCity("city");
		station.setState("state");
		hd.save(station);
	}
}
