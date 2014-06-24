package db2redis;

import java.util.HashMap;
import java.util.Map;

public class ForumUser {

	private String login;
	
	private String city;
	
	private Date date;
	
	private Map<String, String> map;

	public ForumUser(String login, String city, Date date) {
		super();
		map = new HashMap<String, String>();
		this.login = login;
		this.city = city;
		this.date = date;
		refreshMap();
	}
	
	public ForumUser() {
		map = new HashMap<String, String>();
		refreshMap();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
		refreshMap();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
		refreshMap();
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date2) {
		this.date = date2;
		refreshMap();
	}
	
	private void refreshMap() {
		
		map.clear();
		
		if (login != null) {
			map.put("login", login);
		}
		
		if (city != null) {
			map.put("city", city);
		}
		
		if (date != null) {
			map.put("day", date.getDay());
			map.put("mounth", date.getMounth());
			map.put("year", date.getYear());
		}
	}
	
	public Map<String, String> getMap() {
		return map;
	}
	
}
