package Exercicio02;

public class Operario extends Empregado {
    double valorProducao, comissaoOperario, salario;

    public Operario(String nome, String endereco, String telefone, int codigoSetor, int salarioBase, int imposto, double valorProducao, double comissaoOperario) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissaoOperario = comissaoOperario;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissaoOperario() {
        return comissaoOperario;
    }

    public void setComissaoOperario(double comissaoOperario) {
        this.comissaoOperario = comissaoOperario;
    }

    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        salario = salarioBase + (valorProducao * (comissaoOperario / 100));
        return salario;
    }
}
