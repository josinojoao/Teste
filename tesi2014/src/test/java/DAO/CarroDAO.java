package DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import entity.Carro;

public class CarroDAO extends MasterDAO {
	
	public void inserirCarro(Carro carro) {
		inserirObjeto(carro);
	}
	
	public void atualizarCarro(Carro carro) {
		atualizarObjeto(carro);
	}
	
	public void deletarCarro(Carro carro) {
		deletarObjeto(carro);
	}
	
	public List<Carro> listarCarros() {
		Session s = getSession();
		s.beginTransaction();
		Query qr = s.createQuery("from Carro c");
		return qr.list();
		
	}
}
