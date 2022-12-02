package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import domain.Heelodao;
import domain.Hello;
import domain.HelloDaoImpl;
import plugin.HibernatePlugin;

public class HomeController extends Action{
	
	
	
	Heelodao hell=new HelloDaoImpl();
	Hello hello=new Hello();
	@SuppressWarnings("unchecked")
	@Override
	public ActionForward execute(ActionMapping mapping , ActionForm form , HttpServletRequest req , HttpServletResponse res) {
System.out.println("---------------------------------------------hello------------------------------");
		 SessionFactory factory = (SessionFactory) servlet.getServletContext().getAttribute(HibernatePlugin.SESSION_FACTORY_KEY);

		 if(req.getParameter("id")!=null) {
			 UserActionDelete u=new UserActionDelete();
			 u.execute(mapping, form, req, res);
		 }
	        // creating session object
	        Session session = factory.openSession();

	        // creating transaction object
	        Transaction t = session.beginTransaction();

	       
	        List<Hello> list = null;
	        list=session.createCriteria(Hello.class).list();
	        System.out.println(list);
	        t.commit();
	        session.close();
	        req.setAttribute("listUsers", list);
	        return mapping.findForward("success");
	
  }
}
