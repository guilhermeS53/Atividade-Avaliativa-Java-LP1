package Exercicio02;

public class AdministradorTest {
    public static void main(String[] args) {
        Administrador a1 = new Administrador("André", "Rua Báutica", "(67) 97777-7777", 8, 10000, 9, 2500);

        System.out.println("Nome Administrador: " + a1.getNome());
        System.out.println("Endereço Administrador: " + a1.getEndereco());
        System.out.println("Telefone Administrador: " + a1.getTelefone());
        System.out.println("Código do setor do Administrador: " + a1.getCodigoSetor());
        System.out.println("Salário base do Administrador: " + a1.getSalarioBase());
        System.out.println("Imposto do Administrador: " + a1.getImposto() + "%");
        System.out.println("Ajuda de custo do Administrador: " + a1.getAjudaCusto());
        System.out.println("Salário final do Administrador: " + a1.calcularSalario());
    }
}