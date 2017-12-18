package br.com.caelum.estoque.cliente;

public class TesteCliente {

	public static void main(String[] args) {

		EstoqueWS cliente = new EstoqueWS_Service().getEstoqueWSPort();
		System.out.println(cliente);
		Filtros filtros = new Filtros();
		Filtro filtro = new Filtro();
		filtro.setNome("iphone");
		filtro.setTipo("Livro");
		filtros.getFiltro().add(filtro);
		System.out.println(cliente.todosOsItens(filtros));
	}

}
