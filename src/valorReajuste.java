public class valorReajuste {

    //Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

    public static void main(String[] args) {

        double A = 1453;
        double reajuste = 0.05;
        double valorReajustado;

        valorReajustado = A + (A * reajuste);

        System.out.printf("Valor com reajuste: %.2f", valorReajustado);


    }
}
