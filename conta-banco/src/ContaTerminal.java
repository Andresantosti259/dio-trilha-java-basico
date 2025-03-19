import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
       
        System.out.println("Olá, seja bem vindo(a)!");
        
        System.out.println("Digite o número de sua conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número de sua agencia");
        int numeroAgencia = scanner.nextInt();
        
        System.out.println("Por favor digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next(); 

        System.out.println("Digite o seu saldo");
        double saldo = scanner.nextDouble();
      
           
      

        //imprimindo os dados obtidos pelo usuário
        System.out.println("Olá, " + nome + " " + sobrenome);
        System.out.println("Obrigado por criar uma conta em nosso banco, sua agencia é " + numeroAgencia +", conta " + numeroConta + ", e seu saldo " + saldo + " já está disponível para saque");
        
    
    }
}
