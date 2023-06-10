package br.com.alura.service;

import br.com.alura.teste.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BonusService {
    public BigDecimal calcularBonus(Funcionario funcionario) throws IllegalAccessException {

        BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
        if (valor.compareTo(new BigDecimal("1000")) > 0) {
             throw new IllegalAccessException("Funcionario com o salario maior que o permitido para bonus");

        }

        return valor.setScale(2, RoundingMode.HALF_UP);
    }
}
