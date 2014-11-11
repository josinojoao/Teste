package DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import util.HibernateUtil;
import entity.Carro;

public class MasterDAO {

	public Session getSession() {
		return HibernateUtil.getSessionFactory().openSession();
	}
	
	public void inserirObjeto(Object obj) {
		Session s = getSession();
		s.beginTransaction();
		s.save(obj);
		s.getTransaction().commit();
		s.close();
	}
	
	public void atualizarObjeto(Object obj) {
		Session s = getSession();
		s.beginTransaction();
		s.update(obj);
		s.getTransaction().commit();
		s.close();
	}
	
	public void deletarObjeto(Object obj) {
		Session s = getSession();
		s.beginTransaction();
		s.delete(obj);
		s.getTransaction().commit();
		s.close();
	}
}
