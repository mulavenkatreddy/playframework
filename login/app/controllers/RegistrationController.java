package controllers;
import java.util.List;

import javax.inject.Inject;

import models.Register;
import play.data.FormFactory;
import play.data.*;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.registerpage;
import views.html.sample;
public class RegistrationController extends Controller{
	
	@Inject
	FormFactory formFactory;
	
	public Result register() {
		Form<Register> registerForm = formFactory.form(Register.class);
		
		//return ok(views.html.registerpage.render());
		//return ok(registerpage.render(registerForm));
		return ok(registerpage.render(registerForm));

	}
	
	public Result login() {
		return ok(views.html.loginpage.render());
	}
	
	public Result save() {
		@SuppressWarnings("deprecation")
		Form<Register> registerForm = formFactory.form(Register.class).bindFromRequest();
		Register user = registerForm.get();
		System.out.println(user);
		user.save();
		List<Register> users = Register.find.all();
		return ok(sample.render(users));
	}
	
	public Result getUsers() {
		List<Register> users = Register.find.all();
		return ok();
	}
	

}
