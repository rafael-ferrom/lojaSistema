package CrudLoja.Cliente;


import java.util.Date;
import java.util.List;
import CrudLoja.Produto.*;

public class ClientePj extends Cliente{

	
	private String cnpj;
	private String razaoSocial;
	private int prazoMax;

	public ClientePj(String nome, Endereco endereco, Date dataCadastro, List<Compra> compras, String cnpj,
			String razaoSocial, int prazoMax) {
		super(nome, endereco, dataCadastro, compras);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.prazoMax = prazoMax;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public int getPrazoMax() {
		return prazoMax;
	}

	public void setPrazoMax(int prazoMax) {
		this.prazoMax = prazoMax;
	}
	
	
}//clientepj