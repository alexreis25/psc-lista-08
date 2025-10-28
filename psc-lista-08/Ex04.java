import java.util.Scanner;

public class Ex04 {
    public static char retornarPositivoFalso(int numero){
        if(numero>0){
            return 'P';
        }else{
            return 'N';
        }
    }

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        char resultado = retornarPositivoFalso(numero);
        System.out.println("Resultado da verificação: "+ resultado);

        scanner.close();
    }
    
}
