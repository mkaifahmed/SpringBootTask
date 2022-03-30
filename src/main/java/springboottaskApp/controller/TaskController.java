package springboottaskApp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
	@GetMapping("/task")
	public String welcome() {
		return "Task Demonstration";
	}
	
	@GetMapping("/task/showInfo")
	public List<String> showInfo() {
		return List.of("Kaif","Ahmed","Moulvi");
	}
	
	@GetMapping("/task/showHobbiesInfo")
	public List<String> showHobbies() {
		return List.of("Eat","Sleep","Repeat");
	}


}
