package orientacaoAObjeto03;

public class RegraNegocioEmpresa {
    private Empresa[] arrayEmp = new Empresa[3];
    private int index = 0;

    public void cadastrarEmpresa(Empresa emp) {
        if (index < arrayEmp.length) {
            arrayEmp[index] = emp;
            index++;
        } else {
            System.out.println("Vetor cheio!");
        }
    }

    public Empresa[] listarEmpresa() {
        return arrayEmp;
    }
}