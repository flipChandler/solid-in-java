package solid.open_closed_principle;

import java.math.BigDecimal;

public interface FolhaPagamentoStrategy {

    BigDecimal calcular(Funcionario funcionario);
}
