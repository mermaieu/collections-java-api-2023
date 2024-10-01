package main.java.list.OrdenacaoEmerson;

import java.util.Scanner;
import java.util.Locale;

public class CustomScanner implements AutoCloseable {  // para usar try-with-resources

    private final Scanner scanner =  new Scanner(System.in).useLocale(Locale.US);;
    // 'final' evita que o campo scanner seja reatribuído após sua inicialiacão.

    // Captura e retorna a entrada String do usuário
    public String input(String message) {
        System.out.println(message);  // Exibe a mensagem
        return scanner.nextLine();
    }

    // Captura e retorna a entrada numérica inteira do usuário
    public int inputInt(String message) {
        System.out.println(message);  // Exibe a mensagem
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, insira um número inteiro.");
            scanner.next();  // Limpa a entrada inválida do buffer do Scanner
        }
        return scanner.nextInt();
    }

    // Captura e retorna a entrada numérica decimal do usuário
    public double inputDouble(String message) {
        System.out.println(message);  // Exibe a mensagem
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, insira um número decimal.");
            scanner.next();  // Limpa a entrada inválida do buffer do Scanner
        }
        return scanner.nextDouble();
    }

    // Captura e retorna a entrada booleana do usuário
    public boolean inputBoolean(String message) {
        System.out.println(message);  // Exibe a mensagem
        while (!scanner.hasNextBoolean()) {
            System.out.println("Por favor, insira true ou false.");
            scanner.next();  // Limpa a entrada inválida do buffer do Scanner
        }
        return scanner.nextBoolean();
    }

    // A interface AutoCloseable exige que o metodo close() seja implementado
    @Override
    public void close() {
        scanner.close();
    }

    public void next() {  //  Caso seja necessário
        scanner.next();
    }
}
