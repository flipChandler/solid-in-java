package alura.rh.open_closed_principle.service;

import alura.rh.open_closed_principle.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

// Open-Closed
public class ReajusteService {

    private List<ValidacaoReajustesStrategy> validacoes;

    public ReajusteService(List<ValidacaoReajustesStrategy> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarSalario(Funcionario funcionario, BigDecimal aumento) {
        this.validacoes.forEach(validacao -> validacao.validar(funcionario, aumento));

        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }
}
