package util;

import org.hibernate.Session;

public class TestaCarro {

	public static void main(String[] args) {
	
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		
		Carro c = new Carro();
		c.setAno(1997);
		c.setChassi("AD09FD34KJDKFJA");
		c.setCombustivel("Flex");
		c.setCor("Azul");
		c.setPlaca("MZV-777");
		c.setQuilometragem(199);
		c.setRenavam("9458498545");
		c.setValorLocacao(1500);
		
		s.save(c);
		s.getTransaction().commit();
		s.close();
		
	}
}
