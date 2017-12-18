package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

//	@Override
//	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
//			throws Exception {
//		ModelAndView model = new ModelAndView("hello");
//		return model;
//	}
	
	@RequestMapping(path="/hello", method=RequestMethod.GET)
	@ResponseBody
	public String hello() {
		return "hello";
	}
	

}
