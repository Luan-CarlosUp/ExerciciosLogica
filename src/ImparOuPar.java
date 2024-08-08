import java.util.Scanner;

public class ImparOuPar {
    //Faça um algoritmo para receber um número qualquer
    // e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valA;

        System.out.println("Digite um número...");
        valA = scanner.nextInt();

        if (valA % 2 == 0 && valA >= 0){
            System.out.println("O número é Par e Positivo.");
        }else if (valA < 0) {
            System.out.println("O número é Ímpar e Negativo.");
        }
    }
}
