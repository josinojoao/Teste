package util;

import org.hibernate.Session;

public class TestaCarro {

	public static void main(String[] args) {
		//Commit online
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		//Criando novo carro
		Carro c = new Carro();
		c.setAno(2014);
		c.setChassi("TXTESTEXX");
		c.setCombustivel("Gasolina");
		c.setPlaca("MZV-777");
		c.setQuilometragem(19449);
		c.setRenavam("9458498545");
		c.setValorLocacao(1500);
		c.setPreco(155.6);
		
		s.save(c);
		s.getTransaction().commit();
		s.close();
		
	}
}
