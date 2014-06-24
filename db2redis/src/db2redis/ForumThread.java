package db2redis;

import java.util.HashMap;
import java.util.Map;

public class ForumThread {
	
	private String title;
	
	private Date date;
	
	private String user;
	
	private Map<String, String> map = new HashMap<String, String>();

	public ForumThread(String title, Date date, String user) {
		super();
		this.title = title;
		this.date = date;
		this.user = user;
		refreshMap();
	}
	
	public ForumThread() {
		
	}
	
	private void refreshMap() {
		
		map.clear();
		
		map.put("title", title);
		
		if (date != null) {
			map.put("day", date.getDay());
			map.put("mounth", date.getMounth());
			map.put("year", date.getYear());
		}
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
		refreshMap();
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
		refreshMap();
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
		refreshMap();
	}
	
	public Map<String, String> getMap() {
		return map;
	}
	
	
}
