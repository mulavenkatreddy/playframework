package controllers;

import play.mvc.Controller;
import views.html.*;
import play.mvc.Result;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    	
    }
    
    public Result sample() {
    	//return ok(views.html.sample.render());
    	//return ok(views.html.loginpage.render());
    	return null;
    }
    
    public Result message() {
    	return ok ("hello");
    }
    
//    public Result printname(String name,String lastName) {
//    	//return ok(name+" "+lastName);
//    	return ok(sample.render(name,lastName));
//    }
    
 

}
