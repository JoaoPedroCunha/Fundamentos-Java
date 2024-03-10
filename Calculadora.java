import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe quanto você ganha por hora: ");
        double salarioPorHora = scanner.nextDouble();
        System.out.print("Informe o número de horas trabalhadas no mês: ");
        double horasTrabalhadasNoMes = scanner.nextDouble();
        double salarioMensal = salarioPorHora * horasTrabalhadasNoMes;
        System.out.println("O total do seu salário no referido mês é: " + salarioMensal);
        scanner.close();
    }
}
