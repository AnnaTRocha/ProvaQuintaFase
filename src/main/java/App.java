import java.math.BigDecimal;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n-------------CADASTRO DE FUNCIONÁRIO -------------");
            System.out.println("Tipo de funcionário:");
            System.out.println("1 - Caixa");
            System.out.println("2 - Vendedor");
            System.out.println("3 - Repositor");
            System.out.println("4 - Segurança");
            System.out.println("5 - Faxineiro");
            System.out.println("0 - Sair");
            System.out.println("\n Digite o Tipo Escolhido:");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 0) break;

            String nome = "";

            Funcionario funcionario = null;
            switch (TipoFuncionario.fromCodigo(opcao)) {
                case CAIXA:
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Salário fixo: ");
                    funcionario = new Caixa(nome, scanner.nextBigDecimal());
                    break;
                case VENDEDOR:
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Salário base: ");
                    BigDecimal salarioBase = scanner.nextBigDecimal();
                    System.out.print("Comissão por venda: ");
                    BigDecimal comissao = scanner.nextBigDecimal();
                    System.out.print("Quantidade de vendas: ");
                    int vendas = scanner.nextInt();
                    funcionario = new Vendedor(nome, salarioBase, comissao, vendas);
                    break;
                case REPOSITOR:
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Valor por hora: ");
                    BigDecimal valorHora = scanner.nextBigDecimal();
                    System.out.print("Horas trabalhadas: ");
                    int horas = scanner.nextInt();
                    funcionario = new Repositor(nome, valorHora, horas);
                    break;
                case SEGURANCA:
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Salário fixo: ");
                    BigDecimal salarioSeguranca = scanner.nextBigDecimal();
                    System.out.print("Adicional noturno: ");
                    BigDecimal adicional = scanner.nextBigDecimal();
                    System.out.print("Trabalha à noite? (true/false): ");
                    boolean noturno = scanner.nextBoolean();
                    funcionario = new Seguranca(nome, salarioSeguranca, adicional, noturno);
                    break;
                case FAXINEIRO:
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Salário fixo: ");
                    BigDecimal salarioFaxineiro = scanner.nextBigDecimal();
                    System.out.print("Bônus por turno extra: ");
                    BigDecimal bonus = scanner.nextBigDecimal();
                    System.out.print("Turnos extras: ");
                    int turnos = scanner.nextInt();
                    funcionario = new Faxineiro(nome, salarioFaxineiro, bonus, turnos);
                    break;
                case null:
                    System.out.println("Opção inválida!");
                    continue;
                default:
                    System.out.println("Opção inválida!");
                    continue;
            }
            funcionario.exibirInformacoes();
        }
        scanner.close();
    }
}
