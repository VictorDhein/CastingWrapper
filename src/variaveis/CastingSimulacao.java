package variaveis;

/**
 * @autor Victor Dhein
 */

import java.util.Scanner;

public class CastingSimulacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Casting Implícito
        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt(); // Leitura do número inteiro

        // Conversão implícita de int para double
        double numeroDouble = numeroInteiro;
        System.out.println("Casting Implícito: " + numeroInteiro + " convertido para double: " + numeroDouble);

        // Casting Explícito
        System.out.print("Digite um número decimal: ");
        double numeroDecimal = scanner.nextDouble(); // Leitura do número decimal

        // Conversão explícita de double para int
        int numeroConversao = (int) numeroDecimal; // Casting explícito
        System.out.println("Casting Explícito: " + numeroDecimal + " convertido para int: " + numeroConversao);

        // Fechar o scanner
        scanner.close();
    }
}
