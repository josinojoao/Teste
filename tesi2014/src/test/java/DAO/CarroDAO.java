package DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import util.HibernateUtil;
import entity.Carro;

public class CarroDAO {
	
	//Criando DAO
	
	public Session getSession() {
		return HibernateUtil.getSessionFactory().openSession();
	}
	
	public void inserirCarro(Carro carro) {
		Session s = getSession();
		s.beginTransaction();
		s.save(carro);
		s.getTransaction().commit();
		s.close();
	}
	
	public void atualizarCarro(Carro carro) {
		Session s = getSession();
		s.beginTransaction();
		s.update(carro);
		s.getTransaction().commit();
		s.close();
	}
	
	public void deletarCarro(Carro carro) {
		Session s = getSession();
		s.beginTransaction();
		s.delete(carro);
		s.getTransaction().commit();
		s.close();
	}
	
	public List<Carro> listarCarros() {
		Session s = getSession();
		s.beginTransaction();
		Query qr = s.createQuery("from carro");
		return qr.list();
	}
	
}
