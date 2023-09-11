package kr.co.noh.Controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * @throws Exception 
	 */
	//�⺻������
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		return "home";
	}
	
	//�׽�Ʈ������
	@RequestMapping(value = "test", method = RequestMethod.GET)
	public String test() {
		
		return "test";
	}
	
	//����������
	@RequestMapping(value = "dummy", method = RequestMethod.GET)
	public String dummy() {
		
		return "dummy";
	}
	
}
