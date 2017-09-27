package person.springmvc;

import java.util.Date;

public class User {
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}


	private Date time;
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}

}
