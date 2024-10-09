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
        int numInt = scanner.nextInt(); // Leitura do número inteiro

        // Conversão implícita de int para double
        double numeroDouble = numInt;
        System.out.println("Casting Implícito: " + numInt + " convertido para double: " + numeroDouble);

        // Conversão de int para Integer (Wrapper)
        Integer numeroInteiroWrapper = Integer.valueOf(numInt);
        System.out.println("Conversão para Integer: " + numeroInteiroWrapper);

        // Conversão de long para int
        System.out.print("Digite um número longo de até 11 digitos (long): ");
        long numeroLong = scanner.nextLong(); // Leitura do número longo

        // Conversão de long para int (casting explícito)
        int numeroInt = (int) numeroLong; // O casting pode levar à perda de dados se o long for muito grande
        System.out.println("Número longo " + numeroLong + " convertido para int: " + numeroInt);

        // Conversão de int para short
        System.out.print("Digite um número inteiro (int): ");
        int num1 = scanner.nextInt(); // Leitura do número inteiro

        // Conversão de int para short (casting explícito)
        short numeroShort = (short) num1; // O casting pode levar à perda de dados se o int for muito grande
        System.out.println("Número inteiro " + num1 + " convertido para short: " + numeroShort);

        // Fechar o scanner
        scanner.close();
    }
}
