package aula002;

import java.util.Scanner;

public class exemplo002 {
    public static void main(String[] args) {
        double valor;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        valor = teclado.nextFloat();

        System.out.println("Valor: " + valor/2);

    }
}
