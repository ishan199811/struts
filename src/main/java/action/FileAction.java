package action;



import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;



import beans.FileUplooad;

public class FileAction extends Action{
	
//	@Override
//	 public ActionForward execute(
//			  ActionMapping mapping,
//			  ActionForm form,
//			  HttpServletRequest request,
//			  HttpServletResponse response) throws Exception{
//			  FileUplooad myForm = (FileUplooad)form;
//
//			  // Process the FormFile
//			  FormFile myFile = myForm.getFile();
//			  String contentType = myFile.getContentType();
//			  String fileName  = myFile.getFileName();
//			  int fileSize = myFile.getFileSize();
//			  byte[] fileData  = myFile.getFileData();
//			  System.out.println("contentType: " + contentType);
//			  System.out.println("File Name: " + fileName);
//			  System.out.println("File Size: " + fileSize);
//			  System.out.println("File Size: " + fileData);
//			  
//			  return mapping.findForward("success");
//	}
	
	@Override
	public ActionForward execute(ActionMapping mapping , ActionForm form,
			HttpServletRequest request , HttpServletResponse response)throws Exception {
		System.out.println("----------------------"+ request.getContextPath() );
	
	FileUplooad fileUploadForm=(FileUplooad) form;
	System.out.println("----------------------"+ fileUploadForm);
	if(fileUploadForm==null) {
		return mapping.findForward("input");
	}
	FormFile file= fileUploadForm.getFile();
	System.out.println("----------------------"+ file);
	
	String filePath= getServlet().getServletContext().getRealPath("/")+"upload";
	System.out.println("----------------------"+ filePath);
	File folder= new File(filePath);
	if(!folder.exists()) {
		folder.mkdir();
	}
	
	String fileName=file.getFileName();
	
	if(!("").equals(fileName));{
		System.out.println("Server path:"+ filePath);
		
		File newFile= new File(filePath , fileName);
		if(!newFile.exists()) {
			FileOutputStream fos= new FileOutputStream(newFile);
			fos.write(file.getFileData());
		fos.flush();
		fos.close();
		}
	request.setAttribute("uploadFilePath", newFile.getAbsoluteFile());
	request.setAttribute("uploadFileName", newFile.getName());
	
	
	}
	return mapping.findForward("success");
	}
	
	
}

