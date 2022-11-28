package beans;


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
import domain.Heelodao;
import domain.Hello;
import domain.HelloDaoImpl;
import plugin.HibernatePlugin;


public class HelloController extends Action {
	
	
	Heelodao hell=new HelloDaoImpl();
	Hello hello=new Hello();
	
	
	@SuppressWarnings("unchecked")
	@Override
	public ActionForward execute( ActionMapping mapping ,ActionForm form, HttpServletRequest request , HttpServletResponse response ) throws Exception
	{
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		SessionFactory sf = (SessionFactory) servlet.getServletContext().getAttribute(HibernatePlugin.SESSION_FACTORY_KEY);
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
 List<Hello> h=null;
        
		hello.setAddress(address);
		hello.setName(name);
		session.saveOrUpdate(hello);
		h=session.createCriteria(Hello.class).list();
		for(Hello hel:h) {
		System.out.println(hel.getAddress());
		request.setAttribute("res", "hello...."+hel.getAddress() +":");
		}
		System.out.println("-----------"+name+"--------------"+address);
		session.flush();
		tx.commit();
//        hell.saveOrUpdate(hello);
	
		


		return mapping.findForward("success");
	}
	
//	public ActionForward execute(ActionMapping mapping,ActionForm form,
//			HttpServletRequest request,HttpServletResponse response) 
//		  throws Exception {
//		 
//	        SessionFactory sessionFactory = 
//			         (SessionFactory) servlet.getServletContext()
//		                            .getAttribute(HibernatePlugin.SESSION_FACTORY_KEY);
//
//			Session session = sessionFactory.openSession();
//				
//			HelloFormBackup chelloForm = (HelloFormBackup) form;
//			Hello hello = new Hello();
//			String name=request.getParameter("name");
//        	String address=request.getParameter("address");
//			
//			BeanUtils.copyProperties(hello, helloForm);
//				
//			//save it
//			
//
//			hello.setAddress(address);
//			hello.setName(name);
//	
//			session.beginTransaction();
//			session.save(customer);
//			session.getTransaction().commit();
//				
//			return mapping.findForward("success");
//			  
//		  }
}
