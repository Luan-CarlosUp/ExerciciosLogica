import java.util.Scanner;

public class LerESomarValores {

    //Faça um algoritmo que leia os valores de A, B, C
    // e em seguida imprima na tela a soma entre A e B e mostre se a soma é menor que C.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double A, B, C, result;
        System.out.println("Digite o valor de A...");
        A = scanner.nextDouble();
        System.out.println("Digite o valor de B...");
        B = scanner.nextDouble();
        System.out.println("Digite o valor de C...");
        C = scanner.nextDouble();

        result = A + B;

        if (result < C){
            System.out.println("A soma entre " + A + " e " + B + " é " + result + " sendo menor que " + C);
        }else{
            System.out.println("A soma entre " + A + " e " + B + " é " + result + " sendo maior que " + C);
        }

    }
}

