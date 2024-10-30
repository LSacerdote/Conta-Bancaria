import java.util.Scanner;
public class Desafio {

    public static void main(String[] args) {
       String nome =  "Lucas Sacerdote";
       String tipoDeConta = "Conta Corrente";
       double saldo = 2500;  
       int opcao= 0;

       System.out.println("***********************");
       System.out.println("\nNome do cliente: " + nome);
       System.out.println("Tipo conta: " + tipoDeConta);
       System.out.println("Saldo atual: " + saldo);
       System.out.println("\n***********************");

       
String menu = " \n 1. Saldo \n 2. Sacar\n 3. Transferir \n 4. Sair ";

Scanner leitura = new Scanner(System.in);

       while (opcao != 4 ) {
        System.out.println(menu);
        opcao = leitura.nextInt();
        if (opcao == 1) {
            System.out.println("O Saldo atualizado é : " + saldo);
            
        }else if (opcao == 2) {
            System.out.println("Qual valor deseja sacar?");
            double valor = leitura.nextDouble();
            if (valor > saldo) {
                System.out.println("Saldo insuficiente");
            }else {
                saldo = saldo - valor;
                System.out.println("O Saldo atualizado é : " + saldo);
       }
        } else if (opcao == 3) {
            System.out.println("Qual valor deseja transferir?");
            double valor = leitura.nextDouble();
            if (valor > saldo) {
                System.out.println("Saldo insuficiente");
            }else {
                saldo = saldo - valor;
                System.out.println("O Saldo atualizado é : " + saldo);
        
       }
    }    

       }
    }
}