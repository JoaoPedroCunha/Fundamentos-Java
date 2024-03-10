import java.util.Scanner;

public class AreaDoQuadrado {
    public static void main (String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Digite a medida em metros: ");
            double metros = scanner.nextDouble();
            double centimetros = metros * 100;
            System.out.println(metros + " metros equivalem a " + centimetros + " centimetros.");
            scanner.close();
        }
    }
}