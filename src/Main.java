import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList notas = new ArrayList();

        // Variáveis
        double media;
        double soma = 0;
        int qtdNotas;

        // Input da quantidade de notas
        System.out.println("Quantas notas você deseja calcular: ");
        qtdNotas = sc.nextInt();

        // Loop para inserir notas
        for (int i = 0; i < qtdNotas; i++) {
            System.out.println("Digite sua nota "+i+":");
            notas.add(sc.nextDouble());
        }

        // Loop para ler o array e somar na variável soma
        for (int i = 0; i < notas.size(); i++) {
            soma += (double) notas.get(i);
        }

        // Calculo da média
        media = soma / notas.size();

        // Output final
        System.out.printf("Sua média final é: " + media);

    }
}
