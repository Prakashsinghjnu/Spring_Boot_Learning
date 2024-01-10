package springmvc1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	@RequestMapping("/one")
	public static RedirectView one() {
		System.out.println("this is my one handler");
		RedirectView redirectview=new RedirectView();
		redirectview.setUrl("two");
		//redirectview.setUrl("https://www.google.com");
		return redirectview;
	}
	@RequestMapping("/two")
	public static String two() {
		System.out.println("this  is my seconed handler");
		return "Contact ";
	}
}
/* @RequestMapping("/one")
	public static String one() {
		System.out.println("this is my one handler");
		return "redirect:/two";
	}
	@RequestMapping("/two")
	public static String two() {
		System.out.println("this  is my seconed handler");
		return "Contact ";
	}*/
