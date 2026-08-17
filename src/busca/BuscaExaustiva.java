package busca;

import java.util.Scanner;

public class BuscaExaustiva {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[1000000];
        int parametroPesquisa;

        // Construção do vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (vetor.length * Math.random());
        }

        // Pesquisa
        do {

            System.out.print("Digite um parâmetro de pesquisa (-1 para sair): ");
            parametroPesquisa = leitor.nextInt();

            boolean encontrado = false;

            for (int i = 0; i < vetor.length; i++) {

                if (vetor[i] == parametroPesquisa) {
                    System.out.println("Achei! Na posição " + i);
                    encontrado = true;
                    break;
                }

            }

            if (!encontrado && parametroPesquisa != -1) {
                System.out.println("Valor não encontrado.");
            }

        } while (parametroPesquisa != -1);

        leitor.close();
    }
}
 