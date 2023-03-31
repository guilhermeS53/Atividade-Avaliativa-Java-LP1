package Exercicio02;

import java.sql.SQLOutput;

public class Administrador extends Empregado {
    int ajudaCusto;
    double salario;

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, int salarioBase, int imposto, int ajudaCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaCusto = ajudaCusto;
    }

    public int getAjudaCusto() {
        return ajudaCusto;
    }

    public void setAjudaCusto(int ajudaCusto) {
        this.ajudaCusto = ajudaCusto;
    }

    public double calcularSalario() {
        salario = getSalarioBase() - (getSalarioBase() * (getImposto() / 100)) + getAjudaCusto();
        return salario;
    }
}
