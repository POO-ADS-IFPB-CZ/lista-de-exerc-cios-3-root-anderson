import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> fibonacci = new ArrayList<>();

        System.out.print("Informe o valor de n: ");
        int n = scanner.nextInt();

        // Geração da série
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                fibonacci.add(0);
            } else if (i == 1) {
                fibonacci.add(1);
            } else {
                int novoValor = fibonacci.get(i - 1) + fibonacci.get(i - 2);
                fibonacci.add(novoValor);
            }
        }

        System.out.println("Série de Fibonacci com " + n + " números:");
        System.out.println(fibonacci);

        scanner.close();
    }
}
