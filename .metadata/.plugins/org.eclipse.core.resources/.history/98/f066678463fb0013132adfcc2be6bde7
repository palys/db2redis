package db2redis;

public class Date implements Comparable<Date> {

	private String day;
	
	private String mounth;
	
	private String year;

	public Date(String day, String mounth, String year) {
		super();
		this.day = day;
		this.mounth = mounth;
		this.year = year;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMounth() {
		return mounth;
	}

	public void setMounth(String mounth) {
		this.mounth = mounth;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	private Long toLong() {
		return Long.parseLong(day) + Long.parseLong(mounth) * 31 + Long.parseLong(year) * 400;
	}

	@Override
	public int compareTo(Date o) {
		if (o == null) {
			return -1;
		}
		return this.toLong().compareTo(o.toLong());
	}
	
	
}
