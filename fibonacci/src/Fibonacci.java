import java.util.Scanner;

public class Fibonacci {

    public static boolean isFibonacci(int number) {
        if (number == 0 || number == 1) {
            return true;
        }

        int prev = 0, curr = 1, next = 0;

        while (next < number) {
            next = prev + curr;
            prev = curr;
            curr = next;
        }

        return next == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro para verificar se pertecence a sequência de Fibonacci: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
