package alura.rh.liskov_substitution_principle.service;

import alura.rh.open_closed_principle.exception.ValidacaoException;
import alura.rh.open_closed_principle.model.Funcionario;
import alura.rh.open_closed_principle.service.ValidacaoReajustesStrategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidacaoPercentualReajuste implements ValidacaoReajustesStrategy {

    // in spring or quarkus, 'aumento' could be in a dto class with others funcionario's attributes
    @Override
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        BigDecimal salarioAtual = funcionario.getSalario();
        BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }
    }
}
