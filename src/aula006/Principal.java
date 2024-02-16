package aula006;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        AlunoEnsinoMedio alunoEnsinoMedioaluno = new AlunoEnsinoMedio();
        AlunoEnsinoSuperior alunoEnsinoSuperioraluno = new AlunoEnsinoSuperior();
        Professor professor = new Professor();

        Scanner scanner = new Scanner(System.in);
        String nomeEnsinoMedio, nomeEnsinoSuperior = null;

        System.out.println("Digite o nome do aluno do ensino médio: ");
        nomeEnsinoMedio = scanner.nextLine();
        alunoEnsinoMedioaluno.setNome(nomeEnsinoMedio);
        System.out.println("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();
        alunoEnsinoMedioaluno.setNota(nota1, nota2, nota3);
        System.out.println("=====================================");

        System.out.println("Digite o nome do aluno do ensino superior: ");
        scanner.nextLine();
        nomeEnsinoSuperior = scanner.nextLine();
        alunoEnsinoSuperioraluno.setNome(nomeEnsinoSuperior);
        System.out.println("Digite a nota 1: ");
        double nota4 = scanner.nextDouble();
        System.out.println("Digite a nota 2: ");
        double nota5 = scanner.nextDouble();
        System.out.println("Digite a nota 3: ");
        double nota6 = scanner.nextDouble();
        System.out.println("Digite a nota 4: ");
        double nota7 = scanner.nextDouble();
        alunoEnsinoSuperioraluno.setNota(nota4, nota5, nota6, nota7);
        System.out.println("=====================================");

        System.out.println("Digite o nome do professor: ");
        scanner.nextLine();
        professor.setNome(scanner.nextLine());
        System.out.println("Digite o salário do professor: ");
        professor.setSalario(scanner.nextDouble());
        System.out.println("=====================================");


        System.out.println("Aluno do ensino médio");
        System.out.println(alunoEnsinoMedioaluno.getNome());
        System.out.println(alunoEnsinoMedioaluno.getMedia());
        System.out.println("=====================================");

        System.out.println("Aluno do ensino superior");
        System.out.println(alunoEnsinoSuperioraluno.getNome());
        System.out.println(alunoEnsinoSuperioraluno.getMedia());
        System.out.println("=====================================");

        System.out.println("Professor");
        System.out.println(professor.getNome());
        System.out.println(professor.getSalario());
        System.out.println(professor.getInss());
        System.out.println(professor.getSalarioLiquido());
        System.out.println("=====================================");

    }
}
