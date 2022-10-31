package solid.open_closed_principle;

import java.math.BigDecimal;

public class Funcionario {

    private String nome;
    private ECargo cargo;
    private BigDecimal salarioHora;
    private double quantidadeHoraTrabalhada;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public ECargo getCargo() {
        return cargo;
    }

    public void setCargo(ECargo cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(BigDecimal salarioHora) {
        this.salarioHora = salarioHora;
    }

    public double getQuantidadeHoraTrabalhada() {
        return quantidadeHoraTrabalhada;
    }

    public void setQuantidadeHoraTrabalhada(double quantidadeHoraTrabalhada) {
        this.quantidadeHoraTrabalhada = quantidadeHoraTrabalhada;
    }

    public BigDecimal calcularSalario() {
        return this.salarioHora.multiply(BigDecimal.valueOf(this.quantidadeHoraTrabalhada));
    }
}
