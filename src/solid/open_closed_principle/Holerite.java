package solid.open_closed_principle;

public class Holerite {

    private Funcionario funcionario;
    private FolhaPagamentoStrategy folhaPagamento;

    public Holerite(Funcionario funcionario, FolhaPagamentoStrategy folhaPagamento) {
        this.funcionario = funcionario;
        this.folhaPagamento = folhaPagamento;
    }

    public String gerar() {

        return new StringBuilder("\n=================================")
                .append("\nHolerite Mensal\n")
                .append("\nNome : " + this.funcionario.getNome())
                .append("\nCargo: " + this.funcionario.getCargo())
                .append("\nSalario/hora: " + this.funcionario.getSalarioHora())
                .append("\nQuantidade de Horas Trabalhadas: " + this.funcionario.getQuantidadeHoraTrabalhada())
                .append("\nSalario: " + String.format("%.2f", this.folhaPagamento.calcular(funcionario)))
                .toString();
    }
}
