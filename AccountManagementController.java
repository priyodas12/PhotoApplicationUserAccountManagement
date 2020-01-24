package com.workspace.accountController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountManagementController {
	
	@GetMapping("/checkController")
	public String checkController() {
		return "working fine!";
	}
	
	@GetMapping("/details")
	public String getAllDetailsController() {
		return "to be implemented!";
	}
	
	@PutMapping("/reset/password")
	public String resetPasswordController() {
		return "to be implemented";
	}
	
	@PutMapping("/reset/username")
	public String resetUsernameController() {
		return "to be implemented";
	}
	
	@PutMapping("/delete/user")
	public String deleteUser() {
		return "to be implemented";
	}

}
