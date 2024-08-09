public class SalarioMinimo {

    //Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
    //calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado.
    //(Base para o Salário mínimo R$ 1.293,20).

    public static void main(String[] args) {

        double salarioMinimo = 1293.20;
        double salarioUsuario = 4000.00;
        double quantSalarioMinimo;

        quantSalarioMinimo = salarioUsuario/salarioMinimo;

        System.out.println("O usuário recebe " + + (int) quantSalarioMinimo + " salários mínimos." );


    }
}
