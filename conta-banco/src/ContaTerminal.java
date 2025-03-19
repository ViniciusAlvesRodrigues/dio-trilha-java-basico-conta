import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numeroConta;
        String agenciaConta;
        String nomeClienteConta;
        double saldoConta;

        System.out.println("***Bem vindo a criação da conta***");

        System.out.println("Por favor, digite o nome do cliente: ");
        nomeClienteConta = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da agência: ");
        agenciaConta = scanner.next();

        System.out.println("Por favor, digite o número da conta: ");
        numeroConta = scanner.nextInt();        

        System.out.println("Por favor, digite o saldo do cliente: ");
        saldoConta = scanner.nextDouble();

        System.out.println("Olá "+nomeClienteConta+", obrigado por criar uma conta em nosso banco, sua agência é "+agenciaConta+", conta "+numeroConta+" e seu saldo "+saldoConta+" já está disponível para saque");

        scanner.close();
    }
    
}
