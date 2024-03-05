package orientacaoAObjeto03;

public class RegraNegocioEmpresa {
    private Empresa[] arrayEmp = new Empresa[3];

    public void cadastrarEmpresa(Empresa emp) {
        for (int i = 0; i < arrayEmp.length; i++) {
            if (arrayEmp[i] == null) {
                arrayEmp[i] = emp;
                break;
            }
        }
    }

    public Empresa[] listarEmpresa() {
        return arrayEmp;
    }
}