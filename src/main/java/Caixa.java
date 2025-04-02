import java.math.BigDecimal;

public class Caixa extends Funcionario {

    public Caixa(String nome, BigDecimal salario) {
        super(nome, salario);
    }

    @Override
    public BigDecimal calcularSalario() {
        return salario;
    }

}