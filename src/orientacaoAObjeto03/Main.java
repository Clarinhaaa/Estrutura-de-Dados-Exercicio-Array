package orientacaoAObjeto03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RegraNegocioEmpresa regNegEmp = new RegraNegocioEmpresa();
        RegraNegocioFuncionario regNegFun = new RegraNegocioFuncionario();

        //inserção dos dados

        Empresa emp1 = new Empresa(1, "00000", "Bradesco", "(82)91111-1111");
        regNegEmp.cadastrarEmpresa(emp1);
        Empresa emp2 = new Empresa(2, "11111", "Itaú", "(81)92222-2222");
        regNegEmp.cadastrarEmpresa(emp2);

        Funcionario fun1 = new Funcionario(10, "000.111.222-33", "Ana", "012345-6", "(82)93333-3333", emp1);
        regNegFun.cadastrarFuncionario(fun1);
        Funcionario fun2 = new Funcionario(11, "000.444.555-66", "Clara", "123456-7", "(82)94444-4444", emp1);
        regNegFun.cadastrarFuncionario(fun2);
        Funcionario fun3 = new Funcionario(20, "000.777.888-99", "Viviane", "234567-8", "(82)95555-5555", emp2);
        regNegFun.cadastrarFuncionario(fun3);

        //impressão dos dados na tela

        System.out.println("= EMPRESAS =");
        System.out.println(Arrays.toString(regNegEmp.listarEmpresa()));
        System.out.println();
        System.out.println("= FUNCIONÁRIOS =");
        System.out.println(Arrays.toString(regNegFun.listarFuncionario()));
    }
}