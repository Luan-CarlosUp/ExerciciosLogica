import java.util.Scanner;

public class IMC {

    //Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa,
    //leia o seu peso e sua altura e imprima na tela sua condição.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double peso, altura, imc;
        System.out.println("Informe o seu peso...");
        peso = scanner.nextFloat();
        System.out.println("Informe a sua altura...");
        altura = scanner.nextFloat();

        imc = peso / (altura * altura);
        System.out.printf("Seu IMC é de: %.2f", imc);

        if (imc <= 18.5){
            System.out.println("\nAbaixo do Peso!");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso Ideal!");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Levemente Acima do Peso!");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade Grau I!");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade Grau II!");
        } else {
            System.out.println("Obesidade Grau III!");
        }
    }
}
