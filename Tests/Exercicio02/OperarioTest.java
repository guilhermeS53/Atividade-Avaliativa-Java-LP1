package Exercicio02;

public class OperarioTest {
    public static void main(String[] args) {
        Operario o1 = new Operario("Joaquim", "Rua Bernabeu", "(70) 90000-1111", 9, 7000, 3, 800, 100);
        Operario o2 = new Operario("Jairo", "Rua Barnabeu", "(71) 90000-2222", 10, 8000, 4, 950, 300);

        System.out.println("Nome Operário 1: " + o1.getNome());
        System.out.println("Endereço Operário 1: " + o1.getEndereco());
        System.out.println("Telefone Operário 1: " + o1.getTelefone());
        System.out.println("Código do setor do Operário 1: " + o1.getCodigoSetor());
        System.out.println("Salário base do Operário 1: " + o1.getSalarioBase());
        System.out.println("Imposto do Operário 1: " + o1.getImposto() + "%");
        System.out.println("Valor de produção do Operário 1: " + o1.getValorProducao());
        System.out.println("Valor da comissão Operário 1: " + o1.getComissaoOperario());
        System.out.println("Salário final do Operário 1: " + o1.calcularSalario());

        System.out.println("\n");

        System.out.println("Nome Operário 2: " + o2.getNome());
        System.out.println("Endereço Operário 2: " + o2.getEndereco());
        System.out.println("Telefone Operário 2:  " + o2.getTelefone());
        System.out.println("Código do setor do Operário 2: " + o2.getCodigoSetor());
        System.out.println("Salário base do Operário 2: " + o2.getSalarioBase());
        System.out.println("Imposto do Operário 2: " + o2.getImposto() + "%");
        System.out.println("Valor de produção do Operário 2: " + o2.getValorProducao());
        System.out.println("Valor da comissão Operário 2: " + o2.getComissaoOperario());
        System.out.println("Salário final do Operário 2: " + o2.calcularSalario());
    }
}