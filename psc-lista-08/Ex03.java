import java.util.Scanner;

public class Ex03 {
    public static void somarInteiros(int num1 , int num2 , int num3){
        int soma = num1 + num2 + num3;
        System.out.println("A soma dos três números é: " + soma);
    }

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite três números inteiros(separeos com espaço): ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        somarInteiros(num1 , num2 , num3);

        scanner.close();
    }
}
