package Exercicio02;

public class Vendedor extends Empregado {
    double valorVendas, comissaoVendedor, salario;

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, int salarioBase, int imposto, double valorVendas, double comissaoVendedor) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissaoVendedor = comissaoVendedor;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissaoVendedor() {
        return comissaoVendedor;
    }

    public void setComissaoVendedor(double comissaoVendedor) {
        this.comissaoVendedor = comissaoVendedor;
    }

    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        salario = salarioBase + (valorVendas * (comissaoVendedor / 100));
        return salario;
    }
}
