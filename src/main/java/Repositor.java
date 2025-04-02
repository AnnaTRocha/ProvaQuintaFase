import java.math.BigDecimal;

class Repositor extends Funcionario {
    private BigDecimal valorPorHora;
    private int horasTrabalhadas;

    public Repositor(String nome, BigDecimal valorPorHora, int horasTrabalhadas) {
        super(nome, BigDecimal.ZERO);
        this.valorPorHora = validarValor(valorPorHora);
        this.horasTrabalhadas = Math.max(horasTrabalhadas, 0);
    }

    @Override
    public BigDecimal calcularSalario() {
        return valorPorHora.multiply(BigDecimal.valueOf(horasTrabalhadas));
    }
}