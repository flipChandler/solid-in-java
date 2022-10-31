package solid.open_closed_principle;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Funcionario funcionario = new Funcionario();
            System.out.println("Nome do Funcionario: ");
            funcionario.setNome(scanner.nextLine());

            System.out.println("Cargo: [1] DESENVOLVEDOR | [2] TECH LEAD | [3] TECH RECRUITER: ");
            funcionario.setCargo(ECargo.values()[scanner.nextInt() - 1]);

            System.out.println("Salario / Hora: ");
            funcionario.setSalarioHora(scanner.nextBigDecimal());

            System.out.println("Quantidade de horas trabalhadas: ");
            funcionario.setQuantidadeHoraTrabalhada(scanner.nextDouble());

            Holerite holerite = new Holerite(funcionario, funcionario.getCargo().getCalcularSalarioImpl()); // o enum vai chamar uma implementacao de FolhaPagamentoStrategy
            System.out.println(holerite.gerar());
        }
    }
}
