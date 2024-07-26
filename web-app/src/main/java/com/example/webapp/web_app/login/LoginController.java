package com.example.webapp.web_app.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

/* SessionAttributes : 유지시킬 값을 세션처리 (값을 사용하는 모든 controller에 정의) */
@Controller
@SessionAttributes("name")  
public class LoginController {

	private AuthenticationService authenticationService;

	public LoginController(AuthenticationService authenticationService) {
		this.authenticationService = authenticationService;
	}

	/// login => com.in28minutes.springboot.myfirstwebapp.login.LoginController =>
	/// login.jsp

	/* GET controller */
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String gotoLoginPage() {
		return "login";
	}

	/* POST controller */
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String gotoWelcomePage(@RequestParam String name,
			@RequestParam String password, ModelMap model) {

		if (authenticationService.authenticate(name, password)) {
			/* pass to jsp name value */
			model.put("name", name);

			/* return welcome jsp */
			return "welcome";
		}

		model.put("errorMessage", "Invalid Credentials!");

		/* return login jsp */
		return "login";
	}

}
