package person.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloWorld {

	@Autowired
	private UserService userService;

	public HelloWorld() {
		System.out.println("HelloWord:...");
	}

	/*@ModelAttribute
	public User getUser() {
		User user = new User();
		user.setId(2);
		System.out.println(user);
		return user;
	}*/

	@RequestMapping("/success")
	public String testRe() {
		System.out.println("success");
		return "success";
	}

	@RequestMapping("/helloword")
	public String helloworld(User Auser) {
		System.out.println(Auser);
		System.out.println(1/0);
		return "success";
	}
	
	/*@ExceptionHandler
	public ModelAndView exception(Exception ex){
		ModelAndView mv = new ModelAndView("error");
	    mv.addObject("exception", ex);
	    return mv;
	}*/
}
