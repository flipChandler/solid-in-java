package alura.rh.open_closed_principle.service;

import alura.rh.open_closed_principle.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajustesStrategy {

    void validar(Funcionario funcionario, BigDecimal aumento);
}
