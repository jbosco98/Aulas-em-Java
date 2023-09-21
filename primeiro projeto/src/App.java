import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int num1,num2,num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor");
        num1 = scanner.nextInt();
        System.out.println("Digite outro número");
        num2 = scanner.nextInt();
        num3 = num1 + num2;
        System.out.println("Resultado: "+num3);
    }
}