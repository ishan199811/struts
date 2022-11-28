package beans;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

public class FileUplooad extends ActionForm {

	
	private static final long serialVersionUID = 1L;
	FormFile file;

	public FormFile getFile() {
		return file;
	}

	public void setFile(FormFile file) {
		this.file = file;
	}
}
