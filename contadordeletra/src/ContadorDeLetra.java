import java.util.Scanner;

public class ContadorDeLetra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a string ao usuário
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        // Inicializa o contador
        int contador = 0;

        // Percorre a string verificando a ocorrência de 'a' ou 'A'
        for (char c : input.toCharArray()) {
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }

        // Exibe os resultados
        if (contador > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) ocorre " + contador + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não foi encontrada na string.");
        }

        scanner.close();
    }
}
