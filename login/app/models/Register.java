package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.ebean.Finder;
import io.ebean.Model;

@Entity
public class Register extends Model{

	@Id
	public Long id;
	public String  FirstName;
	public String LastName;
	public String Mobilenumber;
	public String EmailId;
	public String Password;
	
	
	public static Finder<Long,Register> find = new Finder<>(Register.class);
	
	
	
	public Register() {
		
	}

	public Register(Long id, String firstName, String lastName, String mobilenumber, String emailId, String password) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		Mobilenumber = mobilenumber;
		EmailId = emailId;
		Password = password;
	}

	@Override
	public String toString() {
		return "Register [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Mobilenumber="
				+ Mobilenumber + ", EmailId=" + EmailId + ", Password=" + Password + "]";
	}
	
	
	
	
	
	
	
}
