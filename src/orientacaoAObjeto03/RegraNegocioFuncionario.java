package orientacaoAObjeto03;

public class RegraNegocioFuncionario {

    private Funcionario[] arrayFun = new Funcionario[3];
    
    public void cadastrarFuncionario(Funcionario fun) {
        for (int i = 0; i < arrayFun.length; i++) {
            if (arrayFun[i] == null) {
                arrayFun[i] = fun;
                break;
            }
        }
    }

    public Funcionario[] listarFuncionario() {
        return arrayFun;
    }
}