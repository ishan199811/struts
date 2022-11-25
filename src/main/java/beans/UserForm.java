package beans;

import org.apache.struts.action.ActionForm;

public class UserForm extends ActionForm {
	
	private static final long serialVersionUID = 5416840150379719646L;
	private String name ;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
