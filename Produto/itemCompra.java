package CrudLoja.Produto;

import java.io.Serializable;

public class itemCompra implements Serializable{

	private int qntde;
	private Produto produto;
	
	public itemCompra() {
		
	}

	public itemCompra(int qntde, Produto produto) {
		super();
		this.qntde = qntde;
		this.produto = produto;
	}

	public int getQntde() {
		return qntde;
	}

	public void setQntde(int qntde) {
		this.qntde = qntde;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	
}//itemcompra
