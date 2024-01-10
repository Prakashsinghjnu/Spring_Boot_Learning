package springmvc1.controller;
import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String Home(Model model) {
		System.out.println("This is my home page");
		model.addAttribute("name","Prakash");
		model.addAttribute("id",141);
		ArrayList<String> list=new ArrayList<String>();
		list.add("anoop");
		list.add("Misu");
		list.add("Jigar");
		list.add("Dhumal");
		list.add("Sadda");
		
		model.addAttribute("l",list);
		return "index";
	}
	@RequestMapping("/about")
	public String About() {
		System.out.println("This is about page");
		return "about";
	}
	@RequestMapping(path ="/help", method=RequestMethod.GET)
	public  ModelAndView  help() {
		System.out.println("this id help page");
		ModelAndView modelandview= new ModelAndView();
		modelandview.addObject("key","sadda");
		modelandview.addObject("key1","sanju");
		modelandview.addObject("id",14);
		modelandview.setViewName("help");
		LocalDateTime now= LocalDateTime.now();
		modelandview.addObject("datetime",now);
		//marks
		List<Integer> list=new ArrayList<Integer>();
		list.add(80);
		list.add(33);
		list.add(90);
		list.add(70);
		list.add(99);
		list.add(8877);
		modelandview.addObject("marks",list);
		return modelandview;
}
}
