package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class FuncionarioTest {
    private Funcionario funcionario;

    //    @BeforeEach
//    public void inicializaCenario(){
//        funcionario = new Funcionario("Roberto",60, 15.5);
//    }
    @Test
    public void testaConstrutorValido() {
        funcionario = new Funcionario("Roberto", 35, 120.5);
        Assertions.assertEquals("Roberto", funcionario.getNome());
        Assertions.assertEquals(35, funcionario.getHorasTrabalhadas());
        Assertions.assertEquals(120.5, funcionario.getValorHora());
    }

    @Test
    public void testaConstrutorInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Funcionario("Cleber", 40, 15.5);
        });
    }

    @Test
    public void testaValorHoraValido() {
        funcionario = new Funcionario();
        funcionario.setValorHora(111);
        Assertions.assertEquals(111, funcionario.getValorHora());
    }

    @Test
    public void testaValorHoraInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            funcionario = new Funcionario();
            funcionario.setValorHora(320);
        });
    }

    @Test
    public void testaCalculoPagamentoValido() {
        funcionario = new Funcionario();
        funcionario.setHorasTrabalhadas(20);
        funcionario.setValorHora(110);
        Assertions.assertEquals(2200, funcionario.calculaPagamento());
    }

    @Test
    public void testaCalculoPagamentoInvalido() {
        funcionario = new Funcionario();
        funcionario.setHorasTrabalhadas(10);
        funcionario.setValorHora(86);
        assertThrows(IllegalArgumentException.class, () -> {
            funcionario.calculaPagamento();
        });
    }

    @Test
    public void testaHorasTrabalhadasValido() {
        funcionario = new Funcionario();
        funcionario.setHorasTrabalhadas(30);
        Assertions.assertEquals(30, funcionario.getHorasTrabalhadas());
    }

    @Test
    public void testaHorasTrabalhadasInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            funcionario = new Funcionario();
            funcionario.setHorasTrabalhadas(50);
        });
    }



}


















