package Exercicio02;

public class Empregado extends Pessoa {
    int codigoSetor, salarioBase;
    double imposto;

    public Empregado(String nome, String endereco, String telefone, int codigoSetor, int salarioBase, int imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(int imposto) {
        this.imposto = imposto;
    }

    public double calcularSalario() {
        double salario = salarioBase - (salarioBase * (imposto / 100));
        return salario;
    }
}
