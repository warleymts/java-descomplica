package aula003;

import java.util.Scanner;

public class exemplo002 {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Digite um número: ");
            numero = entrada.nextInt();


            switch (numero) {
                case 1:
                    System.out.println("O número é um");
                    break;
                case 2:
                    System.out.println("O número é dois");
                    break;
                case 3:
                    System.out.println("O número é três");
                    break;
                case 4:
                    System.out.println("O número é quatro");
                    break;
                case 5:
                    System.out.println("O número é cinco");
                    break;
                default:
                    System.out.println("O número digitado é inválido, digite um número entre 1 e 5");
                    break;

            }
        }
        while (numero < 1 || numero > 5);
        entrada.close();

    }
}

