package orientacaoAObjeto03;

public class Funcionario {
    private int id;
    private String cpf;
    private String nome;
    private String rg;
    private String telefone;
    private Empresa empresa;

    public Funcionario() {

    }

    public Funcionario(int id, String cpf, String nome, String rg, String telefone, Empresa empresa) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.rg = rg;
        this.telefone = telefone;
        this.empresa = empresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

}