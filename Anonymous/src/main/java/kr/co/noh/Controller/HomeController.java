package kr.co.noh.Controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	 */
	//기본페이지
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		return "home";
	}
	
	//테스트페이지
	@RequestMapping(value = "test", method = RequestMethod.GET)
	public String test() {
		
		return "test";
	}
	
	//더미페이지
	@RequestMapping(value = "dummy", method = RequestMethod.GET)
	public String dummy() {
		
		return "dummy";
	}
	
}
