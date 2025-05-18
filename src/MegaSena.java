import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MegaSena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Digite 6 números da Mega-Sena (entre 1 e 60, sem repetir):");

        while (numeros.size() < 6) {
            System.out.print("Número " + (numeros.size() + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero < 1 || numero > 60) {
                System.out.println("Número inválido! Digite um número entre 1 e 60.");
            } else if (numeros.contains(numero)) {
                System.out.println("Número repetido! Digite um número diferente.");
            } else {
                numeros.add(numero);
            }
        }

        Collections.sort(numeros);

        System.out.println("Números escolhidos em ordem crescente: " + numeros);

        scanner.close();
    }
}
