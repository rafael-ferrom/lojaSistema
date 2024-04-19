package CrudLoja.Produto;

import java.util.Date;
import java.io.Serializable;


public class Produto implements Serializable {

	private String codigo;
	private String nome;
	private String descricao;
	private double preco;
	private boolean perecivel;
	private Date dataValidade;

	public Produto() {

	}

	public Produto(String codigo, String nome, String descricao, double preco, boolean perecivel, Date dataValidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.perecivel = perecivel;
		this.dataValidade = dataValidade;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isPerecivel() {
		return perecivel;
	}

	public void setPerecivel(boolean perecivel) {
		this.perecivel = perecivel;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", descricao=" + descricao + ", preco=" + preco
				+ ", perecivel=" + perecivel + ", dataValidade=" + dataValidade + "]";
	}

}
