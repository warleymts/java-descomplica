package aula004;

import java.util.Scanner;

public class atividade001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String aluno, matricula, turma, situacao;
        double nota1, nota2, nota3, media;

        System.out.println("Digite a turma do aluno: ");
        turma = scanner.nextLine();

        for (int i = 0; i < 10; i++) {

            System.out.println("Digite o nome do aluno: ");
            aluno = scanner.nextLine();
            System.out.println("Digite a matrícula do aluno: ");
            matricula = scanner.nextLine();
            System.out.println("Digite a primeira nota do aluno: ");
            nota1 = scanner.nextDouble();
            System.out.println("Digite a segunda nota do aluno: ");
            nota2 = scanner.nextDouble();
            System.out.println("Digite a terceira nota do aluno: ");
            nota3 = scanner.nextDouble();

            media = (nota1 + nota2 + nota3) / 3;
            situacao = media >= 7 ? "Aprovado" : "Reprovado";

            System.out.println("Aluno: " + aluno);
            System.out.println("Matrícula: " + matricula);
            System.out.println("Turma: " + turma);
            System.out.println("Média: " + media);
            System.out.println("Situação: " + situacao);
            System.out.println("====================================");
            scanner.nextLine();
        }
    }
}
