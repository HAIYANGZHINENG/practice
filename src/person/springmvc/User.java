package person.springmvc;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
	
	public User() {
		System.out.println("user");
	}
	
	
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date time;
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", time=" + time + "]";
	}

	
}
