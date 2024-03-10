import java.util.Scanner;

public class CalPeso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();
        double pesoIdeal = (72.7 * altura) - 58;
        System.out.println("O peso ideal para a altura de " + altura + " metros é: " + pesoIdeal + " kg");
        scanner.close();
    }
}
