package CrudLoja.Cliente;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import CrudLoja.Produto.*;



public class Cliente implements Serializable{

	private String nome;
	private Endereco endereco;
	private Date dataCadastro;
	
	List<Compra> compras = new ArrayList<>();
	
	public Cliente() {
		
	}

	public Cliente(String nome, Endereco endereco, Date dataCadastro, List<Compra> compras) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.dataCadastro = dataCadastro;
		this.compras = compras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public List<Compra> getCompras() {
		return compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", endereco=" + endereco + ", dataCadastro=" + dataCadastro + ", compras="
				+ compras + "]";
	}
	
}//cliente