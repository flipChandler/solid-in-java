package solid.open_closed_principle;

import java.math.BigDecimal;

public class CalcularSalarioTechLead implements FolhaPagamentoStrategy{

    @Override
    public BigDecimal calcular(Funcionario funcionario) {
        BigDecimal bonus = new BigDecimal(5000.0);
        return funcionario.calcularSalario().add(bonus);
    }
}
