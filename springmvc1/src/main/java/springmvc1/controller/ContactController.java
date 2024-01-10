package springmvc1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc1.model.User;
import springmvc1.service.Userservice;
/*import springmvc1.model.User;
*/
@Controller
public class ContactController {
	
	@Autowired
	private Userservice userservice;
	
	@ModelAttribute
	public void common(Model model) {
		model.addAttribute("model","\n"
				+ "Welcome to Student Login Page JNU.\n"
				+ "\n"
				+ "");
		/*
		 * model.addAttribute("m", "Welcome to Network Login Page JNU.\n" + "\n" + "\n"
		 * +
		 * "The resource you are trying to access requires proper user identification.\n"
		 * + "\n" + "Please Enter your JNU Internet credentials.\n" + "\n" +
		 * "Change Password .");
		 */
		
	}
	
	
	@RequestMapping("/Contact")
	public String showForm() {
			System.out.println("This is my Contact page");
		return "Contact";
	}
	
	
	@RequestMapping(path="/loginpage",method=RequestMethod.POST)
	
	public String handleForm(@ModelAttribute User user,Model model){
		
         System.out.println(user);
         if (user.getExampleInputName().isEmpty() || user.getExampleInputEmail1().isEmpty() || user.getExampleInputPassword1().isBlank()) {
			System.out.println("please enter a valid "+user.getExampleInputName() );
			model.addAttribute("mo"+"please enter a valid"+user.getExampleInputName());
        	 return "redirect:/Contact";
		}
         if (user.getExampleInputEmail1().isEmpty()) {
 			System.out.println("please enter a valid "+user.getExampleInputEmail1() );
         	 return "redirect:/Contact";
 		}
         if (user.getExampleInputPassword1().isBlank()) {
 			System.out.println("please enter a valid "+user.getExampleInputPassword1() );
         	 return "redirect:/Contact";
 		}
         this.userservice.createUser(user);
         return"contact";
	}
	
}



/*@RequestMapping(path="/loginpage",method=RequestMethod.POST)
public String handleForm(@RequestParam("exampleInputName") String name,
		@RequestParam("exampleInputEmail1")String email,
		@RequestParam("exampleInputPassword1")String password,
		Model model){
	User user=new User();
	user.setExampleInputName(name);
	user.setExampleInputEmail1(email);
	user.setExampleInputPassword1(password);
	System.out.println(user);
	model.addAttribute("user",user);
	
	  String name=(String)request.getParameter("exampleInputName");
	  System.out.println("User Name : "+name); String
	  email=(String)request.getParameter("exampleInputEmail1");
	  System.out.println("User Email : "+email); String password=(String)
	  request.getParameter("exampleInputPassword1");
	  System.out.println("User Password : "+ password); return "";
	 
	
	  System.out.println("User Name "+ name); System.out.println("User Email "+
	  email); System.out.println("User Password "+password);
	  model.addAttribute("name",name); model.addAttribute("Email",email);
	  model.addAttribute("Password",password);
	 
	 return"contact"; */

