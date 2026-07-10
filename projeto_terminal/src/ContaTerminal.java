import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println("digite o numero da conta");
    int numero = scanner.nextInt();
    System.out.println("digite o codigo da agência");
    String agencia = scanner.next();
    System.out.println("digite seu nome");
    String nome = scanner.next();
    System.out.println("digite seu saldo");
    double saldo = scanner.nextDouble();
    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s,conta %s e seu saldo %s já está disponível para saque \n",nome,agencia,numero,saldo);
    String saldo_teste = saldo > 300 ? "rico" : saldo == 300 ? "não tão rico" : "pobre";
     System.out.println(saldo_teste);   
    }
}