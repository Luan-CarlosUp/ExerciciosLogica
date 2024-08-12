import java.util.Scanner;

public class lojaFormaDePagamento {

    //Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
    // pelo comprador e imprima na tela o valor final do produto a ser pago.
    // Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
    // Tabela de Código de Condições de Pagamento
    // 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
    // 2 - À Vista no cartão de crédito, recebe 10% de desconto
    // 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
    // 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int formaDePagamento;
        double valorProduto;
        double desconto;
        double valorComDesconto;

        System.out.println("Informe o valor do produto...");
        valorProduto = scanner.nextDouble();

        System.out.println("================================================================" +
                "\n||Informe a forma de pagamento...                             ||" +
                "\n||Digite 1 - Para pagamento à vista em Dinheiro ou Pix!       ||" +
                "\n||Digite 2 - Para pagamento à vista no Cartão de Crédito!     ||" +
                "\n||Digite 3 - Para pagamento Parcelado em duas vezes!          ||" +
                "\n||Digite 4 - Para pagametno Parcelado em três ou mais vezes!  ||" +
                "\n================================================================");
        formaDePagamento = scanner.nextInt();

        

        }
}
