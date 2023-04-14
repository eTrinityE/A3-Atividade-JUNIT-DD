package test;

import entity.FuncionarioTercerizado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class FuncionarioTercerizadoTest {

    private FuncionarioTercerizado funcionarioTercerizado;
    @Test
    public void testaConstrutorValido() {
        funcionarioTercerizado = new FuncionarioTercerizado("Roberto", 35, 120.5, 900);
        Assertions.assertEquals("Roberto", funcionarioTercerizado.getNome());
        Assertions.assertEquals(35, funcionarioTercerizado.getHorasTrabalhadas());
        Assertions.assertEquals(120.5, funcionarioTercerizado.getValorHora());
    }

    @Test
    public void testaConstrutorInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            new FuncionarioTercerizado("Roberto", 35, 120.5, 9000);
        });
    }
}
