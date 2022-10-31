package alura.rh.interface_segregation_principle.enums;

public enum ECargo {

    ASSISTENTE {
        @Override
        public ECargo getProximoCargo() {
            return ANALISTA;
        }
    },
    ANALISTA {
        @Override
        public ECargo getProximoCargo() {
            return ESPECIALISTA;
        }
    },
    ESPECIALISTA{
        @Override
        public ECargo getProximoCargo() {
            return GERENTE;
        }
    },
    GERENTE{
        @Override
        public ECargo getProximoCargo() {
            return GERENTE;
        }
    };

    public abstract ECargo getProximoCargo();
}
