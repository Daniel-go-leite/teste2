package br.com.alura.service;

import br.com.alura.teste.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void BonusZeroParaSalarioMuitoAulto() {
        BonusService service = new BonusService();
        assertThrows(IllegalArgumentException.class,
                ()->service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(),
                new BigDecimal("250000"))));{



        }
    }
    @org.junit.jupiter.api.Test
    void BonuDeveriaSer10PorCentoDoSalario() {
        BonusService service = new BonusService();
    assertThrows(IllegalArgumentException.class,
            ()-> service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(),
                 new BigDecimal("2500.00"))));

        {


        }
    }
    @org.junit.jupiter.api.Test
    void BonusDeveriaSerDezPorCentoParaSalario10000() {
        BonusService service = new BonusService();
        assertThrows(IllegalArgumentException.class,
                ()-> service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(),
                new BigDecimal("10000"))));
        {



        }
    }
}