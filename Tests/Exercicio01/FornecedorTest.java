package Exercicio01;

public class FornecedorTest {
    public static void main(String[] args) {
        Fornecedor f1 = new Fornecedor("Fornecedor 1", "Rua dos Testes", "(62) 99999-9999", 4000.0, 3580.0);
        Fornecedor f2 = new Fornecedor("Fornecedor 2", "Rua dos Testadores", "(62) 98888-8888", 5000.0, 4999.0);

        System.out.println("Nome fornecedor: " + f1.getNome());
        System.out.println("Endereço fornecedor: " + f1.getEndereco());
        System.out.println("Telefone fornecedor: " + f1.getTelefone());
        System.out.println("Valor de crédito do fornecedor: " + f1.getValorCredito());
        System.out.println("Valor de dívida do fornecedor: " + f1.getValorDivida());
        System.out.println("Saldo do fornecedor: " + f1.obterSaldo());

        System.out.printf("\n");

        System.out.println("Nome fornecedor: " + f2.getNome());
        System.out.println("Endereço fornecedor: " + f2.getEndereco());
        System.out.println("Telefone fornecedor: " + f2.getTelefone());
        System.out.println("Valor de crédito do fornecedor: " + f2.getValorCredito());
        System.out.println("Valor de dívida do fornecedor: " + f2.getValorDivida());
        System.out.println("Saldo do fornecedor: " + f2.obterSaldo());
    }
}