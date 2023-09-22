import java.util.Scanner;
public class exercicioSoma {
    public static void main (String[] args) throws Exception{
        int num1,num2,num3;
        Scanner cascata = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        num1 = cascata.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = cascata.nextInt();
        num3 = (num1 + num2)/2;
        if(num3 <= 6){
            System.out.println("Reprovado! Nota: "+ num3);
        }else{
            System.out.println("Aprovado! Nota: "+num3);
        }
    }
}