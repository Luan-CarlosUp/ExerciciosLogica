import java.util.Scanner;

public class SomaEMultiplicacao {
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
