import java.util.Scanner;

public class mediaNotaAluno {

    //Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float nota1, nota2, nota3, media;
        System.out.println("A nota máxima deve ser 10!");
        System.out.println("Informe a primeira nota...");
        nota1 = scanner.nextFloat();
        System.out.println("Informe a segunda nota...");
        nota2 = scanner.nextFloat();
        System.out.println("Informe a terceira nota...");
        nota3 = scanner.nextFloat();

        media = (nota1 + nota2 + nota3)/3;

        if (media < 7){
            System.out.println("A sua média é: " + media);
            System.out.println("Recuperação!");
        } else {
            System.out.println("A sua média é: " + media);
            System.out.println("Aprovado!");
        }

    }
}
