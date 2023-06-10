package br.com.alura.service;

import br.com.alura.teste.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {
    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {

            BigDecimal percentual = desempenho.percentualReajuste();
            BigDecimal reajute = funcionario.getSalario().multiply(percentual);
            funcionario.reajustarSalario(reajute);

            }
        }




