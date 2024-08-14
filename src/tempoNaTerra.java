import java.util.Calendar;
import java.util.Scanner;

public class tempoNaTerra {

    //Faça um algoritmo que leia a data em que uma pessoa nasceu,
    // imprima na tela quantos anos, meses e dias essa pessoa ja viveu.
    // Leve em consideração o ano com 365 dias e o mês com 30 dias.
    //(Ex: 5 anos, 2 meses e 15 dias de vida)

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);

        int anoNascimento, dias, meses, anos, anoAtual, diaAtual, mesAtual;

        System.out.println("Informe o ano de Nascimento...");
        anoNascimento = scanner.nextInt();
        anoAtual = calendar.get(Calendar.YEAR);
        diaAtual = calendar.get(Calendar.DATE);
        mesAtual = calendar.get(Calendar.MONTH);

        System.out.println(anoAtual + " " + mesAtual + " " + diaAtual);




        System.out.println(anos + " anos, " + meses + " meses e " + dias + " dias de vida.");
    }
}
