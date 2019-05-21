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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getMobilenumber() {
		return Mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		Mobilenumber = mobilenumber;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public static Finder<Long, Register> getFind() {
		return find;
	}

	public static void setFind(Finder<Long, Register> find) {
		Register.find = find;
	}
	
	
	
	
	
	
	
}
