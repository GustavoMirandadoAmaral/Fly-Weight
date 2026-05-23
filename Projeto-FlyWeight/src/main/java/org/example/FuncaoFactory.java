package org.example;

import java.util.HashMap;
import java.util.Map;

public class FuncaoFactory {

    private static Map<String, Funcao> funcoes = new HashMap<>();

    public static Funcao getFuncao(String nome, String setor) {
        Funcao funcao = funcoes.get(nome);
        if (funcao == null) {
            funcao = new Funcao(nome, setor);
            funcoes.put(nome, funcao);
        }
        return funcao;
    }

    public static int getTotalFuncoes() {
        return funcoes.size();
    }
}
