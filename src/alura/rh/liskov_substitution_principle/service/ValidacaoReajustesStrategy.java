package alura.rh.liskov_substitution_principle.service;


import alura.rh.liskov_substitution_principle.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajustesStrategy {

    void validar(Funcionario funcionario, BigDecimal aumento);
}
