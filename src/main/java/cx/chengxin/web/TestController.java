package cx.chengxin.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {


	@RequestMapping("/codes")
	public String index(){
		return "codes";
	}

	@RequestMapping("/index")
	public String home(){
		return "index";
	}
	

	@RequestMapping("/about")
	public String about(){
		return "about";
	}

	@RequestMapping("/blog")
	public String contact1(){
		return "blog";
	}
	
	@RequestMapping("/guanshang")
	public String guanshang(){
		return "guanshang";
	}
	
	@RequestMapping("/caoyu")
	public String jihuayu(){
		return "caoyu";
	}
	
	@RequestMapping("/gallery1")
	public String gallery1(){
		return "gallery1";
	}
	
	@RequestMapping("/gallery2")
	public String gallery2(){
		return "gallery2";
	}
}
