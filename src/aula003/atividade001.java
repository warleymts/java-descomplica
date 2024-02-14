package aula003;

import java.util.Scanner;

public class atividade001 {
    public static void main(String[] args) {
        float nota1, nota2, nota3, nota4, media;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextFloat();
        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextFloat();
        System.out.println("Digite a terceira nota: ");
        nota3 = entrada.nextFloat();
        System.out.println("Digite a quarta nota: ");
        nota4 = entrada.nextFloat();
        entrada.close();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}