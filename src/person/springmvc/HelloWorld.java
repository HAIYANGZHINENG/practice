package person.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorld {
	
	@Autowired
	private UserService userService;
	
	public HelloWorld() {
		System.out.println("HelloWord:...");
	}
	
	
	/*@ModelAttribute
	public User getUser(@RequestParam(value="id",required=false) Integer id){
		User user = new User();
		user.setId(id);
		return user;
	}*/
	
	@RequestMapping("/success")
	public String testRe(){
		System.out.println("success");
		return "success";
	}
	
	@RequestMapping("/helloword")
	public String helloworld(User user){
		System.out.println(user + "...000");
		return "success";
	}
}
