import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n$;
        Scanner cascata = new Scanner(System.in);
        System.out.println("Digite o limite para o programa parar de repetir.");
        n$ = cascata.nextInt();
        for(int i=1; i<=n$;i++){
        System.out.println(i+". Eu vou estudar programação.");
        }
}
}