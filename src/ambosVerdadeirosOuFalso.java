public class ambosVerdadeirosOuFalso {

    //Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

    public static void main(String[] args) {

        boolean ligado = false;
        boolean tocando = true;

        if (ligado != tocando) {
            System.out.println("São diferentes");
        } else if (ligado == true && tocando == true) {
            System.out.println("Ambos são verdadeiros");
        } else {
            System.out.println("Ambos são falsos");
        }
    }
}
