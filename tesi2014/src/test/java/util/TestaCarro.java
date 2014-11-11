package util;

import java.util.List;

import DAO.CarroDAO;
import entity.Carro;

public class TestaCarro {

	public static void main(String[] args) {
		/*Teste antigo
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		Carro c = new Carro();
		c.setAno(2014);
		c.setChassi("TXTESTEXX");
		c.setCombustivel("Gasolina");
		c.setPlaca("MZV-777");
		c.setQuilometragem(19449);
		c.setRenavam("9458498545");
		c.setValorLocacao(1500);
		c.setPreco(155.6);
		 */
		
		//Teste novo
		
		CarroDAO cdao = new CarroDAO();
		Carro c = new Carro();
		c.setAno(2014);
		c.setChassi("KAJDKÇLJAKJLD");
		c.setCombustivel("Gasosa");
		c.setPlaca("MZV-888");
		c.setQuilometragem(0);
		c.setRenavam("9458498545");
		c.setValorLocacao(1500);
		c.setPreco(155.6);
		//cdao.inserirCarro(c);
		c.setIdCarro(2);
		cdao.atualizarCarro(c);
		List<Carro> lista = cdao.listarCarros();
		
		for(Carro carro : lista) {
			System.out.println(carro);
			
		}
	}
}
