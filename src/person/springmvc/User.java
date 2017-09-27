package person.springmvc;

import java.util.Date;

public class User {
	
	public User() {
		System.out.println("user");
	}
	
	
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		if(id == 0)
			return;
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
