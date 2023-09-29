package Heranca;

public class Fornecedor extends Pessoa {

    private String fornecedor, endereco, telefone, nome;
    private double valorCredito, valorDivida, saldo = 0;

    public Fornecedor(String no, String end, String tel, double sal) {
        super(no, end, tel);
        this.saldo = sal;

    }

    public void obterSaldo(String nome) {

        nome.equals(this.getNome());
        this.setSaldo(this.getValorCredito() - this.getValorDivida());
        saldo = this.getSaldo();
        System.out.println("\nSaldo atual da divida de " + nome + " e de R$ " + String.format("%.2f", saldo) + ".");

    }

    public static void main(String[] args) {

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
     * @return double return the valorCredito
     */
    public double getValorCredito() {
        return valorCredito;
    }

    /**
     * @param valorCredito the valorCredito to set
     */
    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    /**
     * @return double return the valorDivida
     */
    public double getValorDivida() {
        return valorDivida;
    }

    /**
     * @param valorDivida the valorDivida to set
     */
    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    /**
     * @return double return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return String return the fornecedor
     */
    public String getFornecedor() {
        return fornecedor;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

}
