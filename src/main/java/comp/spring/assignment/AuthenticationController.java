package comp.spring.assignment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.validation.Valid;







@Controller
public class AuthenticationController {
	
    @Autowired
    private PassengerRepository passRepository;
    
    @GetMapping("/")
    public String home()
    {
    	List<Passenger> users = passRepository.findByEmail("yashapatel17@gmail.com");
    	
    	for (Passenger pass : users) {
    	    System.out.println(pass.firstname);
    	}
    	
    return "login";
    }
    
  //Request mapping to process index page request
  	 @RequestMapping("/login")
  	 public @ResponseBody String login(
     		@RequestParam(value="email", required=true) String email,
            @RequestParam(value="password", required=true) String password
  			 ) 
  	 {
  		 	
  		List<Passenger> user = passRepository.findByEmail(email);
  		
  		String e = null, p = null;
    	for (Passenger pass : user) {
    	   e = pass.email;
    	   p = pass.password;
    	}
  		 

    	    
  			if(e != null && e.equals(email) && p != null && p.equals(password)) {
  				return "success";
  			}
  			else {
  				return "fail";
  			}
 
  		
		  	 
  	}
    
    @GetMapping("/register")
    public String register()
    {
    return "register";
    }
    
    
 

    

    @PostMapping("/add")
    public String add(@Valid Passenger passenger, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("errors", result.getAllErrors());
            return "register";
        }

        passRepository.save(passenger);
        return "redirect:/login";
    }

//    @PostMapping("/add")
//    public String add(@Valid @ModelAttribute Passenger passenger, BindingResult result) {
//        if (result.hasErrors()) {
//            System.out.println("got some err");
//        }
//
//        passRepository.save(passenger);
//        return "login";
//    }


    
    
//    @PostMapping("/add")
//
//    public String add(@Valid Passenger passenger, BindingResult result, Model model){
//
//    if (result.hasErrors()) {
//
//    return "add-dept"; }
//
////    deptRepository.save(department);
//
////    model.addAttribute("departments", deptRepository.findAll());
//
//    return "index";
//
//    }

    

}
