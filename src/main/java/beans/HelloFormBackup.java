package beans;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class HelloFormBackup extends ActionForm{
private static final long serialVersionUID = 1L;
private String name;


private String address;
public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
@Override
public ActionErrors validate(ActionMapping mapping, HttpServletRequest request ) {
ActionErrors ae = new ActionErrors();
	if(name.equals("")) {
		ae.add("name", new ActionMessage("msg"));
		}
	if(address.equals("")) {
		ae.add("address", new  ActionMessage("msd"));
	}
	return ae;


}


}
