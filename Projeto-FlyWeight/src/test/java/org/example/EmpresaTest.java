package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    void deveRetornarFuncionarios() {
        Empresa empresa = new Empresa();
        empresa.contratar("Gustavo", "Desenvolvedor", "Desenvolvimento");
        empresa.contratar("Lucas", "QA", "Desenvolvimento");
        empresa.contratar("Vítor", "Product Manager", "Desenvolvimento");
        empresa.contratar("Felipe", "Desenvolvedor", "Desenvolvimento");

        List<String> saida = Arrays.asList(
                "Funcionário{nome: 'Gustavo', Setor de trabalho: 'Desenvolvimento', Função no setor: 'Desenvolvedor'}",
                "Funcionário{nome: 'Lucas', Setor de trabalho: 'Desenvolvimento', Função no setor: 'QA'}",
                "Funcionário{nome: 'Vítor', Setor de trabalho: 'Desenvolvimento', Função no setor: 'Product Manager'}",
                "Funcionário{nome: 'Felipe', Setor de trabalho: 'Desenvolvimento', Função no setor: 'Desenvolvedor'}");

        assertEquals(saida, empresa.obterFuncionarios());
    }

    @Test
    void deveRetornarTotalSetores() {
        Empresa empresa = new Empresa();
        empresa.contratar("Gustavo", "Desenvolvedor", "Desenvolvimento");
        empresa.contratar("Lucas", "QA", "Desenvolvimento");
        empresa.contratar("Vítor", "Product Manager", "Desenvolvimento");
        empresa.contratar("Felipe", "Desenvolvedor", "Desenvolvimento");

        assertEquals(3, FuncaoFactory.getTotalFuncoes());
    }
}