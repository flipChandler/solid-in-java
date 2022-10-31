package solid.open_closed_principle;

import java.math.BigDecimal;

public class CalcularSalarioDesenvolvedor implements FolhaPagamentoStrategy{

    @Override
    public BigDecimal calcular(Funcionario funcionario) {
        BigDecimal bonus = new BigDecimal(2500.0);
        return funcionario.calcularSalario().add(bonus);
    }
}
