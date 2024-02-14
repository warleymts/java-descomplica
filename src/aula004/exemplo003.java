package aula004;

import java.util.Scanner;

public class exemplo003 {
    public static void main(String[] args) {

        double nota1, nota2, nota3, media;
        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite as notas do Aluno " + i + ":");
            System.out.println("Digite a primeira nota: ");
            nota1 = entrada.nextDouble();
            System.out.println("Digite a segunda nota: ");
            nota2 = entrada.nextDouble();
            System.out.println("Digite a terceira nota: ");
            nota3 = entrada.nextDouble();

            media = (nota1 + nota2 + nota3) / 3;

            System.out.println("A média das notas é: " + media);

            if (media >= 7) {
                System.out.println("O aluno foi aprovado");
            } else {
                System.out.println("O aluno foi reprovado");
            }

        }
    }
}
