package db2redis;

import java.util.HashMap;
import java.util.Map;

public class ForumPost {

	private String thread;
	
	private String content;
	
	private Date date;
	
	private String user;
	
	private Map<String, String> map = new HashMap<String, String>();

	public ForumPost(String thread, String content, Date date, String user) {
		super();
		this.thread = thread;
		this.content = content;
		this.date = date;
		this.user = user;
		refreshMap();
	}
	
	private void refreshMap() {  // FIXME
		map.clear();
		
		if (content != null) {
			map.put("content", content);
		}
		
		if (date != null) {
			map.put("day", date.getDay());
			map.put("mounth", date.getMounth());
			map.put("year", date.getYear());
		}
		
	}
	
	public ForumPost() {
		
	}

	public String getThread() {
		return thread;
	}

	public void setThread(String thread) {
		this.thread = thread;
		refreshMap();
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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
