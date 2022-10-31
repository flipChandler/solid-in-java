package alura.rh.interface_segregation_principle.service.promocao;

import alura.rh.interface_segregation_principle.enums.ECargo;
import alura.rh.interface_segregation_principle.exception.ValidacaoException;
import alura.rh.interface_segregation_principle.model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario funcionario, boolean metaBatida) {
        if (!metaBatida) {
            throw new ValidacaoException("Funcionario nao bateu a meta!");
        }

        ECargo cargoAtual = funcionario.getDadosPessoais().getCargo();
        if (ECargo.GERENTE == cargoAtual) {
            throw new ValidacaoException("Gerentes nao podem ser promovidos!");
        }

        ECargo novoCargo = cargoAtual.getProximoCargo();
        funcionario.promover(novoCargo);
    }
}
