import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Insira o número da agência:");
        String agencia = scanner.nextLine();
        System.out.println("Insira o número da conta:");
        int numeroConta = scanner.nextInt();
        System.out.println("Qual o valor do depósito inicial?");
        double saldo = scanner.nextDouble();
        scanner.close();

        String mensagemFinal = escreverMensagemFinal(nomeCliente, agencia, numeroConta, saldo);

        System.out.println(mensagemFinal);
    }

    private static String escreverMensagemFinal(String nomeCliente, String agencia, int numeroConta, double saldo) {
        return "Olá "
            .concat(nomeCliente)
            .concat("! Obrigado por criar uma conta em nosso banco. Sua agência é ")
            .concat(agencia)
            .concat(", conta ")
            .concat(Integer.toString(numeroConta))
            .concat(", e seu saldo de R$")
            .concat(String.format("%.2f", saldo))
            .concat(" já está disponível para saque.");
    }
}
