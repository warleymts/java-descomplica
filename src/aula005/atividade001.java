package aula005;

public class atividade001 {
    public static void main(String[] args) {

        // Uma empresa possui diversos tipos de funcionários. O cálculo do salário do professor é diferente do cálculo do salário do Coordenador.
        // O salário do administrativo possui um cálculo igual ao do RH
        // Futuramente a empresa vai criar um novo departamento de suporte e o cálculo do salário será a quantidade de atendimento multiplicado por 5.
        // Para o coordenador o cálculo do salário é quantidade de alunos *20
        // Para o professor o cálculo do salário é quantidade de horas trabalhadas * 80
        // Para os demais funcionários, não existe um cálculo específico, o salário é fixo.
        // Crie um programa que simule o cálculo do salário de cada funcionário. Usando herança e polimorfismo.

        Funcionario[] funcionarios = new Funcionario[4];
        funcionarios[0] = new Professor(40);
        funcionarios[1] = new Funcionario(100);
        funcionarios[2] = new Funcionario();
        funcionarios[3] = new Funcionario(10);

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.calcularSalario());
        }


    }

    public static class Funcionario {
        public Funcionario(int i) {

        }

        public Funcionario() {
        }

        public double calcularSalario() {
            return 1000;
        }
    }

    public static class Professor extends Funcionario {
        private int horasTrabalhadas;

        public Professor(int horasTrabalhadas) {
            this.horasTrabalhadas = horasTrabalhadas;
        }

        @Override
        public double calcularSalario() {
            return horasTrabalhadas * 80;
        }
    }

    public static class Coordenador implements aula005.Coordenador {
        private int alunos;

        public Coordenador(int alunos) {
            this.alunos = alunos;
        }

        @Override
        public double calcularSalario() {
            return alunos * 20;
        }
    }

    public static class Administrativo implements aula005.Administrativo {
        @Override
        public double calcularSalario() {
            return 1000;
        }
    }

    public static class Suporte implements aula005.Suporte {
        private int atendimentos;

        public Suporte(int atendimentos) {
            this.atendimentos = atendimentos;
        }

        @Override
        public double calcularSalario() {
            return atendimentos * 5;
        }
    }



}
