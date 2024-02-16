package aula004;

import java.util.Scanner;

public class exemplo004 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;

        System.out.println("Digite o seu nome: ");
        nome = entrada.nextLine();
        entrada.close();

        System.out.println("Seja bem-vindo, " + nome + "!");
    }
}
