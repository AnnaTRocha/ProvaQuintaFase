import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestFuncionarios {
    @org.junit.jupiter.api.Test
    void testCaixa() {
        Caixa caixa = new Caixa("João", new BigDecimal("2000"));
        assertEquals(new BigDecimal("2000"), caixa.calcularSalario());
    }

    @org.junit.jupiter.api.Test
    void testVendedor() {
        Vendedor vendedor = new Vendedor("Maria", new BigDecimal("1500"), new BigDecimal("50"), 10);
        assertEquals(new BigDecimal("2000"), vendedor.calcularSalario());
    }

    @org.junit.jupiter.api.Test
    void testRepositor() {
        Repositor repositor = new Repositor("Carlos", new BigDecimal("20"), 100);
        assertEquals(new BigDecimal("2000"), repositor.calcularSalario());
    }

    @org.junit.jupiter.api.Test
    void testSegurancaSemAdicional() {
        Seguranca seguranca = new Seguranca("Paulo", new BigDecimal("2500"), new BigDecimal("500"), false);
        assertEquals(new BigDecimal("2500"), seguranca.calcularSalario());
    }

    @org.junit.jupiter.api.Test
    void testSegurancaComAdicional() {
        Seguranca seguranca = new Seguranca("Lucas", new BigDecimal("2500"), new BigDecimal("500"), true);
        assertEquals(new BigDecimal("3000"), seguranca.calcularSalario());
    }

    @org.junit.jupiter.api.Test
    void testFaxineiroSemTurnoExtra() {
        Faxineiro faxineiro = new Faxineiro("Ana", new BigDecimal("1800"), new BigDecimal("100"), 0);
        assertEquals(new BigDecimal("1800"), faxineiro.calcularSalario());
    }

    @org.junit.jupiter.api.Test
    void testFaxineiroComTurnoExtra() {
        Faxineiro faxineiro = new Faxineiro("Beatriz", new BigDecimal("1800"), new BigDecimal("100"), 5);
        assertEquals(new BigDecimal("2300"), faxineiro.calcularSalario());
    }

    @org.junit.jupiter.api.Test
    void testValoresNegativos() {
        Caixa caixa = new Caixa("Erro", new BigDecimal("-2000"));
        assertEquals(new BigDecimal("0"), caixa.calcularSalario());

        Vendedor vendedor = new Vendedor("Erro", new BigDecimal("-1500"), new BigDecimal("-50"), -10);
        assertEquals(new BigDecimal("0"), vendedor.calcularSalario());

        Repositor repositor = new Repositor("Erro", new BigDecimal("-20"), -100);
        assertEquals(new BigDecimal("0"), repositor.calcularSalario());

        Seguranca seguranca = new Seguranca("Erro", new BigDecimal("-2500"), new BigDecimal("-500"), true);
        assertEquals(new BigDecimal("0"), seguranca.calcularSalario());

        Faxineiro faxineiro = new Faxineiro("Erro", new BigDecimal("-1800"), new BigDecimal("-100"), -5);
        assertEquals(new BigDecimal("0"), faxineiro.calcularSalario());
    }
}
