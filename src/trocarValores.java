public class trocarValores {

    //Faça um algoritmo que receba um valor A e B,
    //e troque o valor de A por B e o valor de B por A e imprima na tela os valores.

    public static void main(String[] args) {


        int a = 10, b = 5, aux;
        System.out.println("Valores antes da troca: A = " + a + " B = " + b);
        aux = a;
        a = b;
        b = aux;
        System.out.println("Valores depois da troca: A = " + a + " B = " + b);
    }
}
