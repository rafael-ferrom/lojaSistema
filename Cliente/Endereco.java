package CrudLoja.Cliente;

import java.io.Serializable;

public class Endereco implements Serializable {

	private String rua;
	private int numero;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;

	public Endereco() {

	}

	public Endereco(String rua, int numero, String bairro, String cep, String cidade, String estado) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}

	public static Endereco ler(String linha) {
		String[] partes = linha.split(",");
		if (partes.length == 6) {
			String rua = partes[0];
			int numero = Integer.parseInt(partes[1]);
			String bairro = partes[2];
			String cep = partes[3];
			String cidade = partes[4];
			String estado = partes[5];
			return new Endereco(rua, numero, bairro, cep, cidade, estado);
		}
		return null; // Trate dados inválidos
	}

	public String salvar() {
		return rua + "," + numero + "," + bairro + "," + cep + "," + cidade + "," + estado;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cep=" + cep + ", cidade="
				+ cidade + ", estado=" + estado + "]";
	}

}// endereco