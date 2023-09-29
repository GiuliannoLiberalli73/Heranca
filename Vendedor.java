package Heranca;

public class Vendedor extends Empregado {

    private String nome, endereco, telefone;
    private int codigoSetor;
    private double salarioBase, salarioCalc, salarioLiquido, desconto, valorVendas, valorComissao, comissao, imposto;

    public Vendedor(String no, String end, String tel) {
        super(no, end, tel);
        // TODO Auto-generated constructor stub
    }

    public void calcularSalario(String nome) {

        nome.equals(this.getNome());

        this.setSalarioCalc(this.getSalarioBase() + this.getValorVendas());
        this.setValorComissao(this.getSalarioCalc() * (this.getComissao() / 100));
        this.setDesconto(((this.getValorComissao()) + this.getSalarioBase()) * (this.getImposto() / 100));
        this.setSalarioLiquido((this.getSalarioBase() + this.getValorComissao()) - this.getDesconto());
        salarioLiquido = this.getSalarioLiquido();

        System.out.println("\nSalario Base Vendedor do Setor " + this.getCodigoSetor() + ": R$ "
                + String.format("%.2f", salarioBase) + " e o total de vendas de R$ "
                + String.format("%.2f", valorVendas)
                + ", a comissao de " + this.getComissao() + "% rende R$ " + String.format("%.2f", valorComissao)
                + " . " + "\n" + "Descontos: R$ "
                + String.format("%.2f", desconto) + ". O Salario Liquido de " + nome
                + " e de R$ " + String.format("%.2f", salarioLiquido) + ".");

    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return String return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return int return the codigoSetor
     */
    public int getCodigoSetor() {
        return codigoSetor;
    }

    /**
     * @param codigoSetor the codigoSetor to set
     */
    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    /**
     * @return double return the salarioBase
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * @param salarioBase the salarioBase to set
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * @return double return the salarioCalc
     */
    public double getSalarioCalc() {
        return salarioCalc;
    }

    /**
     * @param salarioCalc the salarioCalc to set
     */
    public void setSalarioCalc(double salarioCalc) {
        this.salarioCalc = salarioCalc;
    }

    /**
     * @return double return the salarioLiquido
     */
    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    /**
     * @param salarioLiquido the salarioLiquido to set
     */
    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
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

    /**
     * @return double return the valorVendas
     */
    public double getValorVendas() {
        return valorVendas;
    }

    /**
     * @param valorVendas the valorVendas to set
     */
    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    /**
     * @return double return the valorComissao
     */
    public double getValorComissao() {
        return valorComissao;
    }

    /**
     * @param valorComissao the valorComissao to set
     */
    public void setValorComissao(double valorComissao) {
        this.valorComissao = valorComissao;
    }

    /**
     * @return double return the comissao
     */
    public double getComissao() {
        return comissao;
    }

    /**
     * @param comissao the comissao to set
     */
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    /**
     * @return double return the imposto
     */
    public double getImposto() {
        return imposto;
    }

    /**
     * @param imposto the imposto to set
     */
    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

}
