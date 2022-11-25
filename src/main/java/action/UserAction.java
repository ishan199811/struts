package action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import domain.Hello;
import domain.HelloDaoImpl;
import domain.User;
import plugin.HibernatePlugin;

public class UserAction extends Action{
	
	
	
	@Override
	public ActionForward  execute(ActionMapping mapping , ActionForm form , HttpServletRequest req ,HttpServletResponse ress)
	{
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		User user = new User();
		user.setEmail(email); 
		user.setName(name);
		SessionFactory sf = (SessionFactory) servlet.getServletContext().getAttribute(HibernatePlugin.SESSION_FACTORY_KEY);
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(user);
        session.flush();
		tx.commit();
		req.setAttribute("ress", "hello...."+email +":" + name);
		return mapping.findForward("success");
		
	}
	
	 
	

	
	/**
	 * To save or update user.
	 * @return String
	 */
	






}
