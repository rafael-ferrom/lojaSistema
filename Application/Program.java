package CrudLoja.Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import CrudLoja.Cliente.*;
import CrudLoja.Produto.*;


public class Program {

	public static void main(String[] args) {

		String caminhoCompra = "compras.txt";
		String caminhoCliente = "clientes.txt";
		String caminhoProduto = "produtos.txt";

		arquivoSistema arqs = new arquivoSistema();
		Cliente cliente = new Cliente();
		Endereco endereco = new Endereco();
		Produto produto = new Produto();
		Compra compra = new Compra();
		itemCompra itemCompra = new itemCompra();

		List<Cliente> clientes = new ArrayList<>();
		List<Produto> produtos = new ArrayList<>();
		List<itemCompra> itensCompra = new ArrayList<>();
		List<Compra> compras = new ArrayList<>();
		List<Compra> comprasc1 = new ArrayList<>();
		List<Compra> comprasc2 = new ArrayList<>();
		List<Compra> comprasc3 = new ArrayList<>();
		List<Compra> comprasc4 = new ArrayList<>();
		List<Compra> comprasc5 = new ArrayList<>();
		List<itemCompra> itensComprac1 = new ArrayList<>();
		List<itemCompra> itensComprac2 = new ArrayList<>();
		List<itemCompra> itensComprac3 = new ArrayList<>();
		List<itemCompra> itensComprac4 = new ArrayList<>();
		List<itemCompra> itensComprac5 = new ArrayList<>();

		SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");

		Date datap1 = null;
		Date datap2 = null;
		Date datap3 = null;
		Date datap4 = null;
		Date datap5 = null;
		Date datap6 = null;
		Date datap7 = null;
		Date datap8 = null;

		String d1 = "26/10/2024";
		String d2 = "15/7/2025";
		String d3 = "03/02/2028";
		String d4 = "29/02/2023";
		String d5 = "28/07/2023";
		String d6 = "11/03/2023";
		String d7 = "01/05/2023";
		String d8 = "07/07/2023";

		try {
			datap1 = dataFormat.parse(d1);
			datap2 = dataFormat.parse(d2);
			datap3 = dataFormat.parse(d3);
			datap4 = dataFormat.parse(d4);
			datap5 = dataFormat.parse(d5);
			datap6 = dataFormat.parse(d6);
			datap7 = dataFormat.parse(d7);
			datap8 = dataFormat.parse(d8);
		} // try
		catch (ParseException e) {
			e.printStackTrace();
		} // catch

		Endereco endP1 = new Endereco("Jardins", 22, "Diamante", "22172217", "Rio de Janeiro", "Rio de Janeiro");
		Endereco endP2 = new Endereco("Calango", 13, "bronze", "13313113", "Salvador", "Bahia");
		Endereco endP3 = new Endereco("Madrepérola", 47, "prata", "13322301", "Campinas", "São Paulo");
		Endereco endP4 = new Endereco("Prímola", 893, "ouro", "98762345", "Jundiai", "São Paulo");
		Endereco endP5 = new Endereco("Tucaono", 69, "Esmeralda", "19902999", "Sorocaba", "São Paulo");

		Produto p1 = new Produto("111-222-333", "Queijo gorgonzola", "Queijo com fungos", 89.99, true, datap1);
		Produto p2 = new Produto("124-346-770", "Presunto parma", "Presunto da região de parma", 499.99, true, datap2);
		Produto p3 = new Produto("156-890-754", "Vinho chileno", "Vinho de origem do chile", 300.00, true, datap3);
		Produto p4 = new Produto("578-908-876", "Taça de vidro",
				"Recipiente de vidro, normalmente usado para beber vinho", 24.99, false, null);
		Produto p5 = new Produto("345-987-999", "Abridor de vinhos", "Ferramenta usada para abrir vinhos", 19.99, false,
				null);

		itemCompra it1 = new itemCompra(4, p1);
		itemCompra it2 = new itemCompra(1, p2);
		itemCompra it3 = new itemCompra(2, p3);
		itemCompra it4 = new itemCompra(4, p4);
		itemCompra it5 = new itemCompra(1, p5);

		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		produtos.add(p5);

		itensComprac1.add(it1);
		itensComprac2.add(it2);
		itensComprac3.add(it3);
		itensComprac4.add(it4);
		itensComprac5.add(it5);

		Compra c1 = new Compra(4, 1, datap4, 359.96, "CPF", 0, itensComprac1);
		Compra c2 = new Compra(1, 2, datap5, 499.99, "CNPJ", 0, itensComprac2);
		Compra c3 = new Compra(2, 3, datap6, 600.00, "CPF", 0, itensComprac3);
		Compra c4 = new Compra(4, 4, datap7, 49.98, "CNPJ", 0, itensComprac4);
		Compra c5 = new Compra(1, 5, datap8, 19.98, "CPF", 0, itensComprac5);

		comprasc1.add(c1);
		compras.add(c1);
		comprasc2.add(c2);
		compras.add(c2);
		comprasc3.add(c3);
		compras.add(c3);
		comprasc4.add(c4);
		compras.add(c4);
		comprasc5.add(c5);
		compras.add(c5);

		Cliente cli5 = new Cliente("Romario", endP5, datap8, comprasc5);

		clientes.add(new ClientePj("Jair", endP1, datap4, comprasc1, "12.457.876/001-98", "Céus a vista", 30));
		clientes.add(new ClientePj("Luiz", endP2, datap5, comprasc2, "56.355.636/001-38", "Peixaria", 30));
		clientes.add(new ClientePf("Roberto", endP3, datap6, comprasc3, "534-456-701-56", 12));
		clientes.add(new ClientePf("Valter", endP4, datap7, comprasc4, "214-458-798-46", 12));
		clientes.add(new ClientePf("Romario", endP5, datap8, comprasc5, "984-348-324-46", 12));

		String op = null;
		String key = null;
		String key2 = null;

		produtos = (List<Produto>) arqs.recuperarObjeto(produtos, caminhoProduto);
		clientes = (List<Cliente>) arqs.recuperarObjeto(clientes, caminhoCliente);
		compras = (List<Compra>) arqs.recuperarObjeto(compras, caminhoCompra);

		do {

			key = JOptionPane.showInputDialog(
					"Escolha a opção \n1- Cadastro clientes\n2- Deletar Cliente pelo CPF ou CNPJ\n3- Deletar cliente pelo nome\n4- Cadastro de produtos\n5- Efetuação de uma compra\n6- Atualização da situação do pagamento de uma compra\n7- Relatórios\n8- Sair");

			switch (Integer.valueOf(key)) {
			case 1:
				String nomeCliente = JOptionPane.showInputDialog("Qual o nome do cliente ?");
				String nomeRua = JOptionPane.showInputDialog("Qual o nome da rua ?");
				String numRua = JOptionPane.showInputDialog("Qual o numero da rua ?");
				String nomeBairro = JOptionPane.showInputDialog("Qual o nome do bairro ?");
				String cep = JOptionPane.showInputDialog("Qual o seu CEP ?");
				String nomeCidade = JOptionPane.showInputDialog("Qual o nome da sua cidade ?");
				String nomeEstado = JOptionPane.showInputDialog("Qual o nome do seu estado ?");
				String dataCad = JOptionPane.showInputDialog("Qual a data do cadastro ? (dd/MM/yyyy)");
				endereco = new Endereco(nomeRua, Integer.valueOf(numRua), nomeBairro, cep, nomeCidade, nomeEstado);
				Date dataC = null;
				try {
					dataC = dataFormat.parse(dataCad);
				} // try
				catch (ParseException e) {
					e.printStackTrace();
				} // catch

				String documento = JOptionPane.showInputDialog("Seu documento sera CPF ou CNPJ");
				if (documento.equalsIgnoreCase("cpf")) {
					String cpf = JOptionPane.showInputDialog("Digite seu cpf");
					String numParcelas = JOptionPane.showInputDialog("Qual sera a quantidade maxima de parcelas ?");
					ClientePf cliepf = new ClientePf(nomeCliente, endereco, dataC, null, cpf,
							Integer.valueOf(numParcelas));
					clientes.add(cliepf);

				} // if
				else {
					String cnpj = JOptionPane.showInputDialog("Digite seu cnpj");
					String razaoSocial = JOptionPane.showInputDialog("Qual a sua razão social ?");
					String prazoMax = JOptionPane.showInputDialog("Em quantos dias sera efetuado o pagamento");
					ClientePj cliepj = new ClientePj(nomeCliente, endereco, dataC, null, cnpj, razaoSocial,
							Integer.valueOf(prazoMax));
					clientes.add(cliepj);

				} // else

				break;
			case 2:

				Iterator<Cliente> ite = clientes.iterator();
				String documentoCliente = JOptionPane
						.showInputDialog("QUal sera o documento utilizado para remoção ? CPF/CNPJ");
				if (documentoCliente.equalsIgnoreCase("cpf")) {
					String cpfDelete = JOptionPane.showInputDialog("Qual o CPF do cliente ?");
					while (ite.hasNext()) {
						Cliente c = ite.next();
						if (c instanceof ClientePf) {
							ClientePf clipf = (ClientePf) c;
							if (cpfDelete.equalsIgnoreCase(clipf.getCpf())) {
								ite.remove();
							} // if
						} // if
					} // while
				} // if
				else {
					String cnpjDelete = JOptionPane.showInputDialog("Qual o cnpj do cliente");
					while (ite.hasNext()) {
						Cliente cl = ite.next();
						if (cl instanceof ClientePj) {
							ClientePj cliPj = (ClientePj) cl;
							if (cliPj.getCnpj().equalsIgnoreCase(cnpjDelete)) {
								ite.remove();
							} // if
						} // if
					} // while
				} // else

				JOptionPane.showMessageDialog(null, "Cliente removido");
				break;
			case 3:
				Iterator<Cliente> iterator = clientes.iterator();
				String nomeClienteDeletado = JOptionPane.showInputDialog("Qual o nome do cliente que sera removido?");
				while (iterator.hasNext()) {
					Cliente clie = iterator.next();
					if (nomeClienteDeletado.equalsIgnoreCase(clie.getNome())) {
						iterator.remove();
					} // if
				} // while
				JOptionPane.showMessageDialog(null, "Cliente removido");

				break;

			case 4:
				int tipoProduto = 0;
				String codigoProduto = JOptionPane.showInputDialog("Qual sera o código do produto ?(***-***-***)");
				String nomeProduto = JOptionPane.showInputDialog("Qual sera o nome do produto ?");
				String descricaoproduto = JOptionPane.showInputDialog("De uma breve descrição do produto");
				String precoproduto = JOptionPane.showInputDialog("Qual o preço do produto ?");
				int opPerecivel = JOptionPane.showConfirmDialog(null, "O produto é perecivel ?");
				if (opPerecivel != 1) {
					String dataProduto = JOptionPane.showInputDialog("Qual a data de validade ? (dd/MM/yyyy)");
					Date dataP = null;
					boolean produtoComValidade = true;
					try {
						dataP = dataFormat.parse(dataProduto);
					} // try
					catch (ParseException e) {
						e.printStackTrace();
					} // catch
					produtos.add(new Produto(codigoProduto, nomeProduto, descricaoproduto,
							Double.parseDouble(precoproduto), produtoComValidade, dataP));

				} // if
				else {
					boolean alimentoNp = false;
					Date aliemntoNpData = null;
					produtos.add(new Produto(codigoProduto, nomeProduto, descricaoproduto,
							Double.parseDouble(precoproduto), alimentoNp, aliemntoNpData));

				}
				break;
			case 5:
				String nomePessoaCompra = JOptionPane.showInputDialog("Qual o nome do cliente ?");
				int idCompraM = 0;
				for (Compra co : compras) {
					if (co.getId() > 0) {
						idCompraM = co.getId();
					} // if
				} // for
				idCompraM++;
				JOptionPane.showMessageDialog(null, "produtos disponiveis");
				for (Produto prod : produtos) {
					JOptionPane.showMessageDialog(null, prod);

				} // for
				
				String opC = null;
				double auxValCompra = 1;
				double auxValItem = 1;
				String quantProd = null;

				do {
					JOptionPane.showMessageDialog(null, "Digite o nome do produto que deseja");
					String auxCompra = JOptionPane.showInputDialog("Nome do produto :");
					for (Produto prod : produtos) {
						if (auxCompra.equalsIgnoreCase(prod.getNome())) {
							quantProd = JOptionPane.showInputDialog(null, "Quantos produtos deseja comprar ?");
							auxValItem = Integer.valueOf(quantProd) * prod.getPreco();
							auxValCompra = auxValItem;
							itensCompra.add(new itemCompra(Integer.valueOf(quantProd), produto));
						} // if
					} // for
					auxValItem = 1;
					opC = JOptionPane.showInputDialog(null, "Quer adicionar mais algum produto ?(s/n)");
				} while (opC.equalsIgnoreCase("s"));
				String dataCompS = JOptionPane.showInputDialog("Qual a data da compra ?");
				Date dataComp = null;
				try {
					dataComp = dataFormat.parse(dataCompS);
				} // try
				catch (ParseException e) {
					e.printStackTrace();
				} // catch
				List<Compra> auxCompraL = new ArrayList<>();
				compra.setId(idCompraM);
				compra.setValorTotal(auxValCompra);
				compra.setDataCompra(dataComp);
				compra.setItemCompras(itensCompra);
				compra.setQntdProdutos(Integer.valueOf(quantProd));
				compra.setValorPagoAgora(0);
				compras.add(compra);
				auxCompraL.add(compra);
				for (Cliente clie : clientes) {
					if (nomePessoaCompra.equalsIgnoreCase(clie.getNome())) {
						clie.setCompras(auxCompraL);
					} // if
				} // for
				JOptionPane.showMessageDialog(null, "Sua compra ficou em " + compra.getValorTotal());
				auxCompraL.remove(compra);
				break;
			case 6:
				String idAtt = JOptionPane.showInputDialog("Qual o id da compra que deseja modificar o pagamento");
				for (Compra comp : compras) {
					if (Integer.valueOf(idAtt) == comp.getId()) {
						JOptionPane.showMessageDialog(null, "Sua compra custou :" + comp.getValorTotal()
								+ " e falta pagar " + comp.getValorPagoAgora());
						String partePagamento = JOptionPane.showInputDialog("Quanto deseja pagar da divida ?");
						comp.setValorPagoAgora((comp.getValorTotal() - Double.parseDouble(partePagamento)));
					} // if
				} // for

				break;
			case 7:

				key2 = JOptionPane.showInputDialog(
						"Escolha a opção\n 1-) Relação de todos os clientes que possuem o nome indicado por uma determinada sequencia de caracteres\n2-) Relação de todos os produtos\n3-) Busca um produto pelo nome\n4-) Relação de produtos que são pereciveis e que estão com a data de validade vencida\n5-) Relação de todas as compras\n6-) Busca de uma compra pelo numero\n7-) Relação de todas as compras que não foram pagas ainda\n8-) Relação das 10 ultimas compras pagas\n9-) Apresentação das informações da compra mais cara\n10-) Apresentação das informações da compra mais barata\n11-) Relação do valor total de compras feitas em cada mês nos ultimos 12 meses\n ");

				switch (Integer.valueOf(key2)) {

				case 1:
					for (Cliente cli : clientes) {
						JOptionPane.showMessageDialog(null, cli);
					}

					break;

				case 2:
					for (Produto prod : produtos) {
						JOptionPane.showMessageDialog(null, prod);

					} // for

					break;
				case 3:

					String produtoBuscar = JOptionPane.showInputDialog("Qual o nome do produto que deseja buscar");
					for (Produto prod : produtos) {
						if (produtoBuscar.equalsIgnoreCase(prod.getNome())) {
							JOptionPane.showMessageDialog(null, prod);
						} // if
					} // for

					break;
				case 4:
					LocalDate dataAtual = LocalDate.now();
					JOptionPane.showMessageDialog(null, "produtos pereciveis");
					for (Produto prod : produtos) {
						if (prod.isPerecivel() != false) {
							JOptionPane.showMessageDialog(null, prod);
						} // if
					} // for
					JOptionPane.showMessageDialog(null, "produtos com data de validade vencida");
					for (Produto prod : produtos) {
						try {
							if (prod.isPerecivel() != false) {
								if (dataAtual.isAfter(dataAtual)) {
									JOptionPane.showMessageDialog(null, prod);
								} // if
							} // if
						} // try
						catch (NullPointerException e) {
							e.printStackTrace();
						} // catch
					} // for

					break;
				case 5:
					for (Compra comp : compras) {
						JOptionPane.showMessageDialog(null, comp);
					} // for

					break;
				case 6:
					String idCompraBusca = JOptionPane.showInputDialog("Qual o id da compra ?");
					for (Compra comp : compras) {
						if (Integer.valueOf(idCompraBusca) == comp.getId()) {
							JOptionPane.showMessageDialog(null, comp);
						} // if
					} // for

					break;
				case 7:

					for (Compra comp : compras) {
						if (comp.getValorPagoAgora() < comp.getValorTotal()) {
							JOptionPane.showMessageDialog(null, comp);
						} // if
					} // for

					break;
				case 8:

					for (Compra comp : compras) {
						if (comp.getValorPagoAgora() == comp.getValorTotal()) {
							JOptionPane.showMessageDialog(null, comp);
						} // if
					} // for

					break;
				case 9:
					double maxVal = 0;
					for (Compra comp : compras) {
						if (comp.getValorTotal() > maxVal) {
							maxVal = comp.getValorTotal();
						} // if
					} // for

					for (Compra comp : compras) {
						if (comp.getValorTotal() == maxVal) {
							JOptionPane.showMessageDialog(null, comp);
						} // if
					} // for

					break;
				case 10:
					
					Double menorValor = 0.0;
					
					for (Compra com : compras) {
			            if (com.getValorTotal() > menorValor && menorValor != 0.0) {
			                
			            }//if
			            else {
			            	menorValor = com.getValorTotal();
			            }//else
			        }//for
					
					for (Compra c : compras) {
						if(menorValor == c.getValorTotal()) {
							JOptionPane.showMessageDialog(null, c);
						}//if
					}//for

					break;
				case 11:

					for (int mes = 1; mes <= 12; mes++) 
					{
						JOptionPane.showMessageDialog(null, "Compras do mes "+mes+" :");
						for (Compra co : compras) {
							if (arqs.getMonth(co.getDataCompra()) == mes) {
								JOptionPane.showMessageDialog(null, co);
							} // if
						} // for
					} // for

					break;
				}// switch(key2)

				break;

			}// switch(key)

			op = JOptionPane.showInputDialog("Deseja realizar mais alguma pesquisa (s/n)");

		} while (op.equalsIgnoreCase("s"));// dowhile

		boolean gravouProduto = arqs.gravarObjeto(produtos, caminhoProduto);
		boolean gravouCliente = arqs.gravarObjeto(clientes, caminhoCliente);
		boolean gravouCompra = arqs.gravarObjeto(compras, caminhoCompra);

	}// main

}// program
