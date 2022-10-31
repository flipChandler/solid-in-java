package alura.rh.interface_segregation_principle.service;


import alura.rh.interface_segregation_principle.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajustesStrategy {

    void validar(Funcionario funcionario, BigDecimal aumento);
}
