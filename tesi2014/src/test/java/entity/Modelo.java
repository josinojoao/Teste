package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Modelo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idModelo;
	
	@Column
	private String descModelo;

	public int getIdModelo() {
		return idModelo;
	}
	
	@OneToMany(mappedBy="modelo")
	private List<Carro> carros;
	
	public List<Carro> getCarros() {
		return carros;
	}
	
	@ManyToOne
	@JoinColumn(referencedColumnName="idMarca", name="fkMarca")
	private Marca marca;

	public void setIdModelo(int idModelo) {
		this.idModelo = idModelo;
	}

	public String getDescModelo() {
		return descModelo;
	}

	public void setDescModelo(String descModelo) {
		this.descModelo = descModelo;
	}
	
}
