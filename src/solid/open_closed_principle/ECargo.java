package solid.open_closed_principle;

public enum ECargo {

    DESENVOLVEDOR {
        public FolhaPagamentoStrategy getCalcularSalarioImpl() {
            return new CalcularSalarioDesenvolvedor();
        }
    },
    TECH_LEAD {
        public FolhaPagamentoStrategy getCalcularSalarioImpl() {
            return new CalcularSalarioTechLead();
        }
    },
    TECH_RECRUITER {
        public FolhaPagamentoStrategy getCalcularSalarioImpl() {
            return new CalcularSalarioTechRecruiter();
        }
    };

    // abstract method in an enum class, it's mandatory to implement this method in each attribute
    public abstract FolhaPagamentoStrategy getCalcularSalarioImpl();
}
