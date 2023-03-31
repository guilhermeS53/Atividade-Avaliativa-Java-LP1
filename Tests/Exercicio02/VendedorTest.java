package Exercicio02;

public class VendedorTest {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor("João", "Rua Becadeutica", "(72) 98522-4444", 18, 11500, 10, 2500, 400);
        Vendedor v2 = new Vendedor("Domingos", "Rua Celtics", "(75) 98882-5481", 19, 11800, 11, 5000, 200);

        System.out.println("Nome Vendedor 1: " + v1.getNome());
        System.out.println("Endereço Vendedor 1: " + v1.getEndereco());
        System.out.println("Telefone Vendedor 1: " + v1.getTelefone());
        System.out.println("Código do setor do Vendedor 1: " + v1.getCodigoSetor());
        System.out.println("Salário base do Vendedor 1: " + v1.getSalarioBase());
        System.out.println("Imposto do Vendedor 1: " + v1.getImposto() + "%");
        System.out.println("Valor de vendas do Vendedor 1: " + v1.getValorVendas());
        System.out.println("Valor da comissão Vendedor 1: " + v1.getComissaoVendedor());
        System.out.println("Salário final do Vendedor 1: " + v1.calcularSalario());

        System.out.println("\n");

        System.out.println("Nome Vendedor 2: " + v2.getNome());
        System.out.println("Endereço Vendedor 2: " + v2.getEndereco());
        System.out.println("Telefone Vendedor 2: " + v2.getTelefone());
        System.out.println("Código do setor do Vendedor 2: " + v2.getCodigoSetor());
        System.out.println("Salário base do Vendedor 2: " + v2.getSalarioBase());
        System.out.println("Imposto do Vendedor 2: " + v2.getImposto() + "%");
        System.out.println("Valor de vendas do Vendedor 2: " + v2.getValorVendas());
        System.out.println("Valor da comissão Vendedor 2: " + v2.getComissaoVendedor());
        System.out.println("Salário final do Vendedor 2: " + v2.calcularSalario());
    }
}