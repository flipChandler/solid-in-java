package alura.rh.single_responsibility.service;

import alura.rh.single_responsibility.exception.ValidacaoException;
import alura.rh.single_responsibility.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

// Single Responsibility
// Just because you can, doesn't mean you should
public class ReajusteService {

    public void reajustarSalario(Funcionario funcionario, BigDecimal aumento) {
        BigDecimal salarioAtual = funcionario.getSalario();
        BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }
        BigDecimal salarioReajustado = salarioAtual.add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }
}
