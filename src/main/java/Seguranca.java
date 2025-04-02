import java.math.BigDecimal;

class Seguranca extends Funcionario {
    private BigDecimal adicionalNoturno;
    private boolean trabalhaNoturno;

    public Seguranca(String nome, BigDecimal salario, BigDecimal adicionalNoturno, boolean trabalhaNoturno) {
        super(nome, salario);
        this.adicionalNoturno = validarValor(adicionalNoturno);
        this.trabalhaNoturno = trabalhaNoturno;
    }

    @Override
    public BigDecimal calcularSalario() {
        return trabalhaNoturno ? salario.add(adicionalNoturno) : salario;
    }
}