package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Carro implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int  idCarro;
	@Column(nullable=false)
	private int ano;
	@Column (length=8)
	private String placa;
	@Column
	private String combustivel;
	@Column
	private float quilometragem;
	@Column
	private double preco;
	@Column
	private String chassi;
	@Column
	private String renavam;
	@Column
	private double valorLocacao;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="idModelo",name="fkModelo")
	private Modelo modelo;
	
	public int getIdCarro() {
		return idCarro;
	}
	
	public void setIdCarro(int idCarro) {
		this.idCarro = idCarro;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getCombustivel() {
		return combustivel;
	}
	
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	public float getQuilometragem() {
		return quilometragem;
	}
	
	public void setQuilometragem(float quilometragem) {
		this.quilometragem = quilometragem;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getChassi() {
		return chassi;
	}
	
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	public String getRenavam() {
		return renavam;
	}
	
	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}
	
	public double getValorLocacao() {
		return valorLocacao;
	}
	
	public void setValorLocacao(double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}
}
