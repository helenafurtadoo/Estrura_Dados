package busca;

import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[1000000];

        int inicio;
        int fim;
        int meio;
        int contador;
        int parametroPesquisa;

        // Construção do vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i;
        }

        // Pesquisa
        do {

            System.out.print("Digite o parâmetro de pesquisa (-1 para sair): ");
            parametroPesquisa = leitor.nextInt();

            inicio = 0;
            fim = vetor.length - 1;
            contador = 0;

            while (inicio <= fim) {

                contador++;

                meio = (inicio + fim) / 2;

                if (parametroPesquisa == vetor[meio]) {

                    System.out.println("Achei! Na posição "
                            + meio
                            + " depois de "
                            + contador
                            + " tentativas.");

                    break;

                } else if (parametroPesquisa < vetor[meio]) {

                    fim = meio - 1;

                } else {

                    inicio = meio + 1;

                }

            }

            if (inicio > fim && parametroPesquisa != -1) {
                System.out.println("Valor não encontrado.");
            }

        } while (parametroPesquisa != -1);

        leitor.close();
    }
}
// busca binaria so funciona se a lista estiver ordenada
        // sempre vai dividir por 2 e indo assim ate achar o numero que quer | e exclui a outra metade que nao tem o numero que quer