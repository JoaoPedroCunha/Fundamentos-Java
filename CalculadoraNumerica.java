import java.util.Scanner;

public class CalculadoraNumerica {
    public static void main(String[] args) {
        // Criando um Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário os números inteiros e reais
        System.out.print("Digite o primeiro número inteiro: ");
        int numInt1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int numInt2 = scanner.nextInt();
        
        System.out.print("Digite o número real: ");
        double numReal = scanner.nextDouble();
        double produto = (2 * numInt1) * (numInt2 / 2.0);
        System.out.println("a) O produto do dobro do primeiro com metade do segundo é: " + produto);
        double soma = (3 * numInt1) + numReal;
        System.out.println("b) A soma do triplo do primeiro com o terceiro é: " + soma);
        double cubo = Math.pow(numReal, 3);
        System.out.println("c) O terceiro elevado ao cubo é: " + cubo);
        scanner.close();
    }
}

