import java.util.Scanner;
public class Tabuada {
    public static void main(String [] args) throws Exception{
        int num1,num2,num3;
        Scanner cascata = new Scanner(System.in);
        System.out.println("Digite um valor");
        num1 = cascata.nextInt();
        if(num1 >=11||num1<=0){
            System.out.println("Opção inválida.");
        }else {
        for(int i=1; i<=10; i++){
            num3 = i * num1;
            System.out.println(num1 + " x " + i + " = " + num3);
        }
    
    }
    }
}
