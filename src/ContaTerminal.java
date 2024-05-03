import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String nome, agencia;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva seu nome: ");
        nome = sc.nextLine();

        System.out.print("Digite o número da agencia: ");
        agencia = sc.nextLine();

        System.out.print("Digite o número da conta: ");
        numero = sc.nextInt();

        System.out.print("Digite seu saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " +nome+ ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta " +numero+ " e seu saldo " +saldo+ " já está disponível para saque");
    }
}
