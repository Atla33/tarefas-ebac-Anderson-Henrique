package tarefa_modulo_13;

public class PessoaCadastro {

    public static void main(String[] args) {
        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Empresa");
        pj.setEndereco("Rua 1, 123");
        pj.setTelefone("123456789");
        pj.setEmail("empresa@empresa.com");
        pj.setCNPJ("12345678901234");
        System.out.println(pj.getNome() + " - " + pj.getEndereco() + " - " + pj.getTelefone() + " - " + pj.getEmail() + " - " + pj.getCNPJ());

        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Fulano");
        pf.setEndereco("Rua 2, 456");
        pf.setTelefone("987654321");
        pf.setEmail("fulano@fulano.com");
        pf.setCPF("12345678901");
        System.out.println(pf.getCPF() + " - " + pf.getNome() + " - " + pf.getEndereco() + " - " + pf.getTelefone() + " - " + pf.getEmail());
    }


}
