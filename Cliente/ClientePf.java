package CrudLoja.Cliente;

import java.util.Date;
import java.util.List;

import CrudLoja.Produto.*;

public class ClientePf extends Cliente {

	private String cpf;
	private int qntdParcelasMax;

	public ClientePf(String nome, Endereco endereco, Date dataCadastro, List<Compra> compras, String cpf,
			int qntdParcelasMax) {
		super(nome, endereco, dataCadastro, compras);
		this.cpf = cpf;
		this.qntdParcelasMax = qntdParcelasMax;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getQntdParcelasMax() {
		return qntdParcelasMax;
	}

	public void setQntdParcelasMax(int qntdParcelasMax) {
		this.qntdParcelasMax = qntdParcelasMax;
	}
	
	
}//clientepf