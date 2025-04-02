import java.math.BigDecimal;

public class Funcionario {
    protected String nome;
    protected BigDecimal salario; //Salario Fixo

    public Funcionario(String nome, BigDecimal salario) {
        this.nome = nome;
        this.salario = validarValor(salario);
    }

    public BigDecimal calcularSalario() {
        return null;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        if (salario == null || salario.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("O salário não pode ser negativo.");
        }
        this.salario = salario;
    }

    protected BigDecimal validarValor(BigDecimal valor) {
        if (valor == null || valor.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Valor inválido. Definido como zero.");
            return BigDecimal.ZERO;
        }
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirInformacoes() {
        System.out.println("----------- INFORMAÇÕES DO CADASTRO ----------- ");
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + calcularSalario());
        System.out.println("-------- FIM INFORMAÇÕES DO CADASTRO --------- ");
    }
}
