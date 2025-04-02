import java.math.BigDecimal;

class Faxineiro extends Funcionario {
    private BigDecimal bonusPorTurno;
    private int turnosExtras;

    public Faxineiro(String nome, BigDecimal salario, BigDecimal bonusPorTurno, int turnosExtras) {
        super(nome, salario);
        this.bonusPorTurno = validarValor(bonusPorTurno);
        this.turnosExtras = Math.max(turnosExtras, 0);
    }

    @Override
    public BigDecimal calcularSalario() {
        return salario.add(bonusPorTurno.multiply(BigDecimal.valueOf(turnosExtras)));
    }
}