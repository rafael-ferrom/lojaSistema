package CrudLoja.Produto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Compra implements Serializable{

	private int qntdProdutos;
	private int id;
	private Date dataCompra;
	private double valorTotal;
	private String documentoidentificacao;
	private double valorPagoAgora;
	
	List<itemCompra> itemCompras = new ArrayList<>();
	
	public Compra() {
		
	}
	
	public Compra(int qntdProdutos, int id, Date dataCompra, double valorTotal, String documentoidentificacao,
			double valorPagoAgora, List<itemCompra> itemCompras) {
		super();
		this.qntdProdutos = qntdProdutos;
		this.id = id;
		this.dataCompra = dataCompra;
		this.valorTotal = valorTotal;
		this.documentoidentificacao = documentoidentificacao;
		this.valorPagoAgora = valorPagoAgora;
		this.itemCompras = itemCompras;
	}



	public double valorFaltante() {
		return (valorTotal - valorPagoAgora);
	}//valorfaltante

	public int getQntdProdutos() {
		return qntdProdutos;
	}

	public void setQntdProdutos(int qntdProdutos) {
		this.qntdProdutos = qntdProdutos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getDocumentoidentificacao() {
		return documentoidentificacao;
	}

	public void setDocumentoidentificacao(String documentoidentificacao) {
		this.documentoidentificacao = documentoidentificacao;
	}

	public double getValorPagoAgora() {
		return valorPagoAgora;
	}

	public void setValorPagoAgora(double valorPagoAgora) {
		this.valorPagoAgora = valorPagoAgora;
	}

	public List<itemCompra> getItemCompras() {
		return itemCompras;
	}

	public void setItemCompras(List<itemCompra> itemCompras) {
		this.itemCompras = itemCompras;
	}

	@Override
	public String toString() {
		return "Compra [qntdProdutos=" + qntdProdutos + ", id=" + id + ", dataCompra=" + dataCompra + ", valorTotal="
				+ valorTotal + ", documentoidentificacao=" + documentoidentificacao + ", valorPagoAgora="
				+ valorPagoAgora + ", itemCompras=" + itemCompras + "]";
	}
	
	

}//compra