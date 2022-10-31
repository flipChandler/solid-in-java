package alura.rh.interface_segregation_principle.model;

import alura.rh.interface_segregation_principle.enums.ECargo;

import java.math.BigDecimal;
// terceirizado eh um funcionario ? Herda tudo
// if it looks like a duck, quacks like a duck, but it needs batteries, you probably have the wrong abstraction.
public class Terceirizado {

    // Terceirizado tem Dados Pessoais, melhor que Terceirizado eh um Funcionario (Henranca incorreta)
    private DadosPessoais dadosPessoais;
    private String empresa;

    public Terceirizado(String nome, String cpf, ECargo cargo, BigDecimal salario) {
        this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
