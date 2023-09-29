package Heranca;

public class Administrador extends Empregado {

	private String nome, endereco, telefone;
	private int codigoSetor;
	private double salarioBase, imposto = 10, salarioLiquido, ajudaDeCusto = 850, desconto;

	public Administrador(String noAd, String endAd, String telAd) {
		super(noAd, endAd, telAd);
		this.nome = noAd;
		this.endereco = endAd;
		this.telefone = telAd;
	}

	public void calcularSalario(String nome) {

		nome.equals(this.getNome());
		this.setDesconto((this.getSalarioBase() * (this.getImposto() / 100)));
		this.setSalarioLiquido(this.getSalarioBase() - this.getDesconto());
		salarioLiquido = (this.getSalarioLiquido() + this.getAjudaDeCusto());

		System.out.println("\nSalario Base Administrador: R$ " + String.format("%.2f", salarioBase)
				+ " com Ajuda de Custo de R$ " + String.format("%.2f", ajudaDeCusto) + ". Descontos: R$ "
				+ String.format("%.2f", desconto) + ". O salario liquido de " + nome
				+ " e de R$ " + String.format("%.2f", salarioLiquido) + ".");

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	/**
	 * @return double return the desconto
	 */
	public double getDesconto() {
		return desconto;
	}

	/**
	 * @param desconto the desconto to set
	 */
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

}
