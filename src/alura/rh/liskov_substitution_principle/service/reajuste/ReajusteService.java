package alura.rh.liskov_substitution_principle.service.reajuste;

import alura.rh.liskov_substitution_principle.model.Funcionario;
import alura.rh.liskov_substitution_principle.service.ValidacaoReajustesStrategy;


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

        BigDecimal salarioReajustado = funcionario.getDadosPessoais().getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }
}
