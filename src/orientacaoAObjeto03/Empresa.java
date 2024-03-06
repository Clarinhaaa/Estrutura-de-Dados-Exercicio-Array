package orientacaoAObjeto03;

public class Empresa {
    private int id;
    private String cnpj;
    private String nome;
    private String telefone;

    public Empresa() {

    }

    public Empresa(int id, String cnpj, String nome, String telefone) {
        this.id = id;
        this.cnpj = cnpj;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "empresa: \n[id=" + id + ", cnpj=" + cnpj + ", nome=" + nome + ", telefone=" + telefone + "]\n";
    }

}