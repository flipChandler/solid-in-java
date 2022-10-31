package alura.rh.interface_segregation_principle.model;

import alura.rh.interface_segregation_principle.enums.ECargo;

import java.math.BigDecimal;

public class DadosPessoais {

    private String nome;
    private String cpf;
    private ECargo cargo;
    private BigDecimal salario;

    public DadosPessoais(String nome, String cpf, ECargo cargo, BigDecimal salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ECargo getCargo() {
        return cargo;
    }

    public void setCargo(ECargo cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
