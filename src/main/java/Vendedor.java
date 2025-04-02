import java.math.BigDecimal;

class Vendedor extends Funcionario {
    private BigDecimal comissaoPorVenda;
    private int quantidadeVendas;

    public Vendedor(String nome, BigDecimal salarioBase, BigDecimal comissaoPorVenda, int quantidadeVendas) {
        super(nome, salarioBase);
        this.comissaoPorVenda = validarValor(comissaoPorVenda);
        this.quantidadeVendas = Math.max(quantidadeVendas, 0);
    }

    @Override
    public BigDecimal calcularSalario() {
        return salario.add(comissaoPorVenda.multiply(BigDecimal.valueOf(quantidadeVendas)));
    }
}