package solid.open_closed_principle;

import java.math.BigDecimal;

public class CalcularSalarioTechRecruiter implements FolhaPagamentoStrategy{

    @Override
    public BigDecimal calcular(Funcionario funcionario) {
        BigDecimal bonus = new BigDecimal(1000.0);
        return funcionario.calcularSalario().add(bonus);
    }
}
