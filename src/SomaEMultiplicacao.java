import java.util.Scanner;

public class SomaEMultiplicacao {

    //Faça um algoritmo que leia dois valores inteiros A e B,
    //se os valores de A e B forem iguais, deverá somar os dois valores,
    //caso contrário devera multiplicar A por B.
    //Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A, B, C;
        System.out.println("Digite o valor de A:");
        A = scanner.nextInt();
        System.out.println("Digite o valor de B:");
        B = scanner.nextInt();

        if (A == B){
            C = A + B;
            System.out.println(A + " + " + B + " = " + C);
        } else {
            C = A * B;
            System.out.println(A + " * " + B + " = " + C);
        }
    }
}
