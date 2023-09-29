package Heranca;

public class testeHeranca extends Pessoa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(null, null, null);
		p1.setNome("Manoel");
		p1.setEndereco("Rua A, casa 10");
		p1.setTelefone("(21) 99999-8888");

		Fornecedor f1 = new Fornecedor(null, null, null, 0);
		f1.setFornecedor("Rex");
		f1.setEndereco("Avenida C, casa 05");
		f1.setTelefone("(21) 96677-5544");
		f1.setValorCredito(10000);
		f1.setValorDivida(7000);

		Empregado e1 = new Empregado(null, null, null);
		e1.setCodigoSetor(101);

		Administrador a1 = new Administrador(null, null, null);
		a1.setNome("Joaquim");
		a1.setEndereco("Rua C, casa 12");
		a1.setTelefone("(21) 95544-0001");
		a1.setSalarioBase(e1.getSalarioBase());

		Operario op1 = new Operario(null, null, null);
		op1.setNome("Cabral");
		op1.setEndereco("Rua das Ameixas, 25 - apto 103");
		op1.setTelefone("(21) 98080-7799");
		op1.setCodigoSetor(202);
		op1.setSalarioBase(e1.getSalarioBase());
		op1.setValorProducao(1000);
		op1.setImposto(9.5);
		op1.setComissao(7.5);

		Vendedor ve1 = new Vendedor(null, null, null);
		ve1.setNome("Jhonny");
		ve1.setEndereco("Rua General Dureza, 100 - apto 404");
		ve1.setTelefone("(21) 96745-0606");
		ve1.setCodigoSetor(515);
		ve1.setSalarioBase(e1.getSalarioBase());
		ve1.setValorVendas(40000);
		ve1.setImposto(12);
		ve1.setComissao(5);

		System.out.println("O Cliente e " + p1.getNome() + ", mora no endereco: " + p1.getEndereco()
				+ ", seu telefone de contato e " + p1.getTelefone() + ".");

		System.out.println("O Fornecedor e " + f1.getFornecedor() + ", mora no endereco: " + f1.getEndereco()
				+ ", seu telefone de contato e " + f1.getTelefone() + ".");

		System.out.println("O Administrador e " + a1.getNome() + ", mora no endereco: " + a1.getEndereco()
				+ ", seu telefone de contato e " + a1.getTelefone() + ".");

		System.out.println("O Operario e " + op1.getNome() + ", mora no endereco: " + op1.getEndereco()
				+ ", seu telefone de contato e " + op1.getTelefone() + ".");

		System.out.println("O Vendedor e " + ve1.getNome() + ", mora no endereco: " + ve1.getEndereco()
				+ ", seu telefone de contato e " + ve1.getTelefone() + ".");

		f1.obterSaldo(p1.getNome());
		e1.calcularSalario(p1.getNome());
		a1.calcularSalario(a1.getNome());
		op1.calcularSalario(op1.getNome());
		ve1.calcularSalario(ve1.getNome());

	}

}
