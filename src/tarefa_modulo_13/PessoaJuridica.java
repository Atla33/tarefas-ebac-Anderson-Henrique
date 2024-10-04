package tarefa_modulo_13;

public class PessoaJuridica extends Pessoa {

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    private String CNPJ;

}
