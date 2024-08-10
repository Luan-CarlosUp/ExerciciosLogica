import java.util.Scanner;

public class mediaAluno {

    //Faça um algoritmo que leia quatro notas obtidas por um aluno,
    //calcule a média das nota obtidas, imprima na tela o nome do aluno e
    //se o aluno foi aprovado ou reprovado.
    //Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nomeAluno;
        float nota1, nota2, nota3, nota4, media;

        System.out.println("Informe o nome do aluno...");
        nomeAluno = scanner.nextLine();
        System.out.println("Informe a primeira nota...");
        nota1 = scanner.nextFloat();
        System.out.println("Informe a segunda nota...");
        nota2 = scanner.nextFloat();
        System.out.println("Informe a terceira nota...");
        nota3 = scanner.nextFloat();
        System.out.println("Informe a quarta nota...");
        nota4 = scanner.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4)/4;

        if(media < 7){
            System.out.println("A média do aluno, " + nomeAluno + " é " + media);
            System.out.println("Reprovado!");
        } else {
            System.out.println("A média do aluno, " + nomeAluno + " é " + media);
            System.out.println("Aprovado!");
        }
    }
}
