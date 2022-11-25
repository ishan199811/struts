package domain;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;

import plugin.HibernatePlugin;




public class HelloDaoImpl implements Heelodao {

	@SessionTarget
	Session session;
	
	@TransactionTarget
	Transaction transaction;

	
	
	@Override
	public void saveOrUpdate(Hello hello) {
		
		 
		  session.save(hello);
		  
		 }

	@SuppressWarnings("unchecked")
	@Override
	public List<Hello> listUser() {
		List<Hello> list=null;
		try {
		 list=session.createCriteria("from Hello").list();
		}
		catch(Exception e){
	e.printStackTrace();
		}
		return list;
		}
	

	@Override
	public Hello listUserById(Long helloId) {
		Hello list=null;
		try {
			list=(Hello) session.get(Hello.class, helloId);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void deleteUser(Long helloId) {
		
		try {
		Hello hello=(Hello) session.get(Hello.class, helloId);
		session.delete(hello);
		}
		catch(Exception e){
			transaction.rollback();
			e.printStackTrace();
			}
		}
}
