import java.util.Scanner;

public class Ex02 {
    public static void imprimirSequencia(int n){
        for (int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j + "  ");
            }
        System.out.println();
    }
    }

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro para n: ");
        int numero = scanner.nextInt();

        imprimirSequencia(numero);
        scanner.close();
}   
}
