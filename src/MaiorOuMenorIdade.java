import java.util.Scanner;

public class MaiorOuMenorIdade {

    //Faça algoritmo que leia o nome e a idade de uma pessoa
    //e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Digite seu nome:");
        nome = scanner.nextLine();
        System.out.println("Digite sua idade:");
        idade = scanner.nextInt();

        if (idade < 18){
            System.out.println(nome + " tem " + idade + " anos, portanto é menor de idade.");
        }else {
            System.out.println(nome + " tem " + idade + " anos, portanto é maior de idade.");
        }
    }

}
