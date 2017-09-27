package person.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
	
	@Autowired
	private UserService userService;
	
	public HelloWorld() {
		System.out.println("HelloWord:...");
	}
	
	
	public User getUser(){
		User user = new User();
		return user;
	}
	
	
	@RequestMapping("/helloword")
	public String helloworld(String a){
		System.out.println(a);
		return "success";
	}
}
