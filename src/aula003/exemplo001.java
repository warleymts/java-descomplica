package aula003;

import java.util.Scanner;

public class exemplo001 {
    public static void main(String[] args) {

        int idade;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        idade = entrada.nextInt();
        entrada.close();


        if (idade > 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
