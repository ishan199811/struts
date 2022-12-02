package action;

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
import plugin.HibernatePlugin;

public class UserActionDelete extends Action{
	
	@SuppressWarnings("unchecked")
	@Override
	public ActionForward execute(ActionMapping mapping , ActionForm form , HttpServletRequest request , HttpServletResponse response) {
		
		
		
		String id =request.getParameter("id");
		Long id1=Long.parseLong(id);
		SessionFactory sf = (SessionFactory) servlet.getServletContext().getAttribute(HibernatePlugin.SESSION_FACTORY_KEY);
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
       Hello h= (Hello) session.get(Hello.class, id1);
       List<Hello> list = null;
       list=session.createCriteria(Hello.class).list();
       request.setAttribute("listUsers", list);
       session.delete(h);
		
       session.flush();
		tx.commit();
		
		return mapping.findForward("success");
	}

}
