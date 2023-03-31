package Exercicio02;
public class EmpregadoTest {
    public static void main(String[] args) {
        Empregado e1 = new Empregado("José", "Rua Burtis", "(65) 99999-9999", 1, 2500, 5);
        Empregado e2 = new Empregado("Afonso", "Rua Bartaius", "(65) 98888-8888", 2, 5000, 8);

        System.out.println("Nome empregado: " + e1.getNome());
        System.out.println("Endereço empregado 1: " + e1.getEndereco());
        System.out.println("Telefone empregado 1: " + e1.getTelefone());
        System.out.println("Código do setor do funcionário 1: " + e1.getCodigoSetor());
        System.out.println("Salário base do empregado 1: " + e1.getSalarioBase());
        System.out.println("Imposto do empregado 1: " + e1.getImposto() + "%");
        System.out.println("Salário final do empregado 1: " + e1.calcularSalario());

        System.out.println("\n");

        System.out.println("Nome empregado: " + e2.getNome());
        System.out.println("Endereço empregado 2: " + e2.getEndereco());
        System.out.println("Telefone empregado 2: " + e2.getTelefone());
        System.out.println("Código do setor do funcionário 2: " + e2.getCodigoSetor());
        System.out.println("Salário base do empregado 2: " + e2.getSalarioBase());
        System.out.println("Imposto do empregado 2: " + e2.getImposto() + "%");
        System.out.println("Salário final do  2: " + e2.calcularSalario());
    }
}