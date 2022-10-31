package alura.rh.interface_segregation_principle.service.reajuste;

import alura.rh.interface_segregation_principle.model.Funcionario;
import alura.rh.interface_segregation_principle.service.ValidacaoReajustesStrategy;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {

    // inversao de dependencia | acoplamento de ReajusteService esta com a inteface ValidacaoReajustesStrategy
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
