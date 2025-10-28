import java.util.Scanner;

public class Ex06 {

    public static int converteHora(int horas24, char[] amPm) {
        if (horas24 >= 0 && horas24 <= 11) {
            amPm[0] = 'A';
        } else {
            amPm[0] = 'P'; 
        }

        if (horas24 == 0) { 
            return 12;
        } else if (horas24 >= 13) { 
            return horas24 - 12;
        } else { 
            return horas24;
        }
    }

    public static void mostraResultado(int horas12, int minutos, char amPm) {
        String periodo = (amPm == 'A') ? "A.M." : "P.M.";
        System.out.printf("Hora convertida: %d:%02d %s%n", horas12, minutos, periodo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continua = 'S';

        while (continua == 'S' || continua == 's') {
            System.out.println("--- Conversor de Horas ---");
            System.out.print("Digite as horas (0-23): ");
            int horas24 = scanner.nextInt();

            System.out.print("Digite os minutos (0-59): ");
            int minutos = scanner.nextInt();

            if (horas24 < 0 || horas24 > 23 || minutos < 0 || minutos > 59) {
                System.out.println("Horário inválido. Por favor, tente novamente.");
            } else {
                char[] amPm = new char[1];
                int horas12 = converteHora(horas24, amPm);
                mostraResultado(horas12, minutos, amPm[0]);
            }

            System.out.print("Deseja converter outro horário? (S/N): ");
            continua = scanner.next().charAt(0);
        }
        
        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
