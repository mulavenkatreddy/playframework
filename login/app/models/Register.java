package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.ebean.Finder;
import io.ebean.Model;

@Entity
@Table(name = "register")
public class Register extends Model{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	public String  firstName;
	public String lastName;
	public String mobileNumber;
	public String emailId;
	public String pass;
	
	
	public static Finder<Long,Register> find = new Finder<>(Register.class);
	
	
	
	public Register() {
		
	}

	public Register(Long id, String firstName, String lastName, String mobilenumber, String emailId, String pass) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobilenumber;
		this.emailId = emailId;
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Register [id=" + id + ", FirstName=" + firstName + ", LastName=" + lastName + ", Mobilenumber="
				+ mobileNumber + ", EmailId=" + emailId + ", Password=" + pass + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobilenumber() {
		return mobileNumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobileNumber = mobilenumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public static Finder<Long, Register> getFind() {
		return find;
	}

	public static void setFind(Finder<Long, Register> find) {
		Register.find = find;
	}
	
	
	
	
	
	
	
}
