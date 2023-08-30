import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        int numero = sc.nextInt();
        System.out.println("Por favor, digite  a Agência !");
        String agencia = sc.next();
        sc.nextLine();
        System.out.println("Por favor, digite seu nome!");
        String nomeCliente = sc.nextLine();
        
        System.out.println("Por favor, digite seu saldo!");
        float saldo = sc.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia+ ", conta "+ numero+ " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
