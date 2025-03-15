package contabancaria;

import java.util.Scanner;
public class ContaBancaria {

/**
 * A classe ContaTerminal simula a criação de uma conta bancária
 * recebendo os dados do usuário via terminal.
 * <p>
 * Ao final, exibe uma mensagem de boas-vindas com as informações fornecidas.
 * </p>
 * 
 * @author Barreto S. O
 * @version 1.0
 */

    /**
     * Método principal que inicia a execução do programa.
     * Ele solicita ao usuário os dados da conta bancária e imprime uma mensagem personalizada.
     *
     * @param args argumentos da linha de comando (não utilizados neste programa)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        // Limpa o buffer do teclado
        scanner.nextLine();

        // Solicita o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicita o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicita o saldo inicial
        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();

        // Exibe a mensagem final com os dados inseridos
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero +
                " e seu saldo R$ " + saldo + " já está disponível para saque.");

        // Fecha o scanner
        scanner.close();
    }
}
