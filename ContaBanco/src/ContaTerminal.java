import java.util.Scanner;
import java.util.Locale;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência (ex: 0678):");
        String agenciaDigitada = scanner.nextLine();

        String numeroAgencia = agenciaDigitada.substring(0, 3) + "-" + agenciaDigitada.substring(3);

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine().toUpperCase();

        System.out.println("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("------------------------------");


        System.out.println("Olá " + nomeCliente +
         ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta +
         " e seu saldo R$" + saldo + " já está disponível para saque.");


    }
}
