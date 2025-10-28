import java.util.Scanner;
public class Ex05 {
    public static double somaImposto(double taxaImposto , double custo){
        double imposto = taxaImposto / 100;
        double valorFinal = custo +(imposto * custo);
        return valorFinal;
    }

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Taxa de imposto: ");
        double taxaImposto = scanner.nextDouble();

        System.out.println("Custo do item: ");
        double custo = scanner.nextDouble();

        double valorTotal = somaImposto(taxaImposto , custo);

        System.out.println("O valor final: "+ valorTotal);

        scanner.close();
    }
}
