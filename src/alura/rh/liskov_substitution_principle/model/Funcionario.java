package alura.rh.liskov_substitution_principle.model;


import alura.rh.liskov_substitution_principle.enums.ECargo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

    private DadosPessoais dadosPessoais;
    private LocalDate dataUltimoReajuste;

    public Funcionario(String nome, String cpf, ECargo cargo, BigDecimal salario) {
        this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
    }

    public void atualizarSalario(BigDecimal salarioReajustado) {
        this.dadosPessoais.setSalario(salarioReajustado);
        this.dataUltimoReajuste = LocalDate.now();
    }

    public void promover(ECargo novoCargo) {
        this.dadosPessoais.setCargo(novoCargo);
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public LocalDate getDataUltimoReajuste() {
        return dataUltimoReajuste;
    }

    public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
        this.dataUltimoReajuste = dataUltimoReajuste;
    }
}
