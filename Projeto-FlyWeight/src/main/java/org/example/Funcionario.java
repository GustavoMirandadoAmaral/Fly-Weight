package org.example;

public class Funcionario {

    private String nome;
    private Funcao funcaoNaEmpresa;

    public Funcionario(String nome, Funcao funcaoNaEmpresa) {
        this.nome = nome;
        this.funcaoNaEmpresa = funcaoNaEmpresa;
    }

    public String obterFuncionario() {
        return "Funcionário{" +
                "nome: '" + this.nome + '\'' +
                ", Setor de trabalho: '" + funcaoNaEmpresa.getSetor() + '\'' +
                ", Função no setor: '" + funcaoNaEmpresa.getNome() + '\'' +
                '}';
    }
}
