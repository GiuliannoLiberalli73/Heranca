package Heranca;

public class Empregado extends Pessoa {

    private String nome, endereco, telefone;
    private int codigoSetor;
    private double salarioBase = 5000, imposto = 10, salarioLiquido, desconto;

    public Empregado(String no, String end, String tel) {
        super(no, end, tel);
        this.nome = no;
        this.endereco = end;
        this.telefone = tel;

    }

    public void calcularSalario(String nome) {

        nome.equals(this.getNome());
        this.setDesconto((this.getSalarioBase() * (this.getImposto() / 100)));
        this.setSalarioLiquido(this.getSalarioBase() - this.getDesconto());
        salarioLiquido = this.getSalarioLiquido();

        System.out.println("\nSalario Base Empregado do Setor " + this.getCodigoSetor() + ": R$ "
                + String.format("%.2f", salarioBase) + ". Descontos: R$ "
                + String.format("%.2f", desconto) + ". O salario liquido de " + nome
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
     * @return int return the imposto
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

    /**
     * @return int return the salarioLiquido
     */
    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    /**
     * @param salarioLiquido2 the salarioLiquido to set
     */
    public void setSalarioLiquido(double salarioLiquido2) {
        this.salarioLiquido = salarioLiquido2;
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
