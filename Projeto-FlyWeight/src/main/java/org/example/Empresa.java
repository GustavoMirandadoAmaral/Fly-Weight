package org.example;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Funcionario> funcionarios = new ArrayList<>();

    public void contratar(String nomeFuncionario, String nomeFuncao, String setor){
        Funcao funcao = FuncaoFactory.getFuncao(nomeFuncao, setor);
        Funcionario funcionario = new Funcionario(nomeFuncionario, funcao);
        funcionarios.add(funcionario);
    }

    public List<String> obterFuncionarios(){
        List<String> saida = new ArrayList<>();
        for (Funcionario funcionario : this.funcionarios){
            saida.add(funcionario.obterFuncionario());
        }
        return saida;
    }
}
