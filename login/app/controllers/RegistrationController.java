package controllers;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;

import models.Login;
import models.Register;
import play.data.FormFactory;
import play.data.*;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.loginpage;
import views.html.registerpage;
import views.html.sample;
public class RegistrationController extends Controller{
	
	@Inject
	FormFactory formFactory;
	
	public Result register() {
		Form<Register> registerForm = formFactory.form(Register.class);
		
		return ok(registerpage.render(registerForm));

	}
	
	public Result login() {
		Form<Login> loginForm = formFactory.form(Login.class);
		return ok(loginpage.render(loginForm));
	}
	
	public Result save() {
		@SuppressWarnings("deprecation")
		Form<Register> registerForm = formFactory.form(Register.class).bindFromRequest();
		Register user = registerForm.get();
		Optional<Register> validateuser = Register.find.all().stream().filter(data ->data.emailId.equals(user.emailId)).findFirst();
		if(!validateuser.isPresent()) {
			user.save();
			return ok(views.html.registersucess.render());
		}
		else {
			return ok(views.html.alreadyregistered.render());
		}
		
		
	}
	
	public Result verifyLogin() {
		
		@SuppressWarnings("deprecation")
		Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();
		Login logindetails = loginForm.get();
		Optional<Register> user = Register.find.all().stream().filter(data ->data.emailId.equals(logindetails.emailId)).findFirst();
		if(user.isPresent()) {
			if(user.get().pass.equals(logindetails.password)&& user.get().emailId.equals(logindetails.emailId)){
				
				return ok(views.html.loginsucess.render());
			}
			else {
				return ok(views.html.loginmismatch.render());
			}
			
		}
		else {
			return ok(views.html.usernotfound.render());
		
		}
	}
	
	public Result getUsers() {
		List<Register> users = Register.find.all();
		return ok(sample.render(users));
	}
	

}
