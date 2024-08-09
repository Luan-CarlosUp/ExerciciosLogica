import java.util.Scanner;

public class ordenacao {

    //Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int primeiro, segundo, terceiro;
        int x;

        System.out.println("Informe o primeiro número...");
        primeiro = scanner.nextInt();
        System.out.println("Informe o segundo valor...");
        segundo = scanner.nextInt();
        System.out.println("Informe o terceiro valor...");
        terceiro = scanner.nextInt();

        for (int i = 0; i < 3; i++) {
            if(primeiro <= segundo){
                x = primeiro;
                primeiro = segundo;
                segundo = x;
            } else if (segundo <= terceiro){
                x = segundo;
                segundo = terceiro;
                terceiro = x;
            }
        }
        System.out.printf("%d %d %d", primeiro, segundo, terceiro);
    }

}

