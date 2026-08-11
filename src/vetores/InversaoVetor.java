package vetores;

import java.util.Scanner;

public class InversaoVetor {

        // Método principal. É por onde todo programa Java começa a ser executado.
        public static void main(String[] args) {

            // Cria um objeto Scanner para ler dados do teclado
            Scanner leitor = new Scanner(System.in);

            // Cria um vetor (array) para armazenar os valores digitados pelo usuário
            int[] vetorOriginal = new int[5];

            // Cria outro vetor que armazenará os valores invertidos
            int[] vetorInvertido = new int[5];

            // =====================================================
            // LEITURA DOS VALORES
            // =====================================================

            // Percorre todas as posições do vetorOriginal
            for (int i = 0; i < vetorOriginal.length; i++) {

                // Solicita que o usuário informe um valor
                System.out.print("Digite o valor da posição " + i + ": ");

                // Lê o número digitado e armazena na posição i
                vetorOriginal[i] = leitor.nextInt();
            }

            // Fecha o Scanner (boa prática)
            leitor.close();

            // =====================================================
            // INVERSÃO DO VETOR
            // =====================================================

            // Percorre novamente o vetorOriginal
            for (int i = 0; i < vetorOriginal.length; i++) {

                /*
                * Fórmula utilizada:
                *
                * vetorInvertido[vetorOriginal.length - 1 - i] = vetorOriginal[i];
                *
                * Explicação:
                *
                * vetorOriginal.length = quantidade de posições do vetor
                * length - 1 = última posição do vetor
                * i = posição atual
                *
                * Dessa forma:
                *
                * i = 0  → posição 4
                * i = 1  → posição 3
                * i = 2  → posição 2
                * i = 3  → posição 1
                * i = 4  → posição 0
                *
                * Assim os elementos ficam invertidos.
                */

                vetorInvertido[vetorOriginal.length - 1 - i] = vetorOriginal[i];
            }

            // =====================================================
            // IMPRESSÃO DO VETOR INVERTIDO
            // =====================================================

            // Percorre todas as posições do vetor invertido
            for (int i = 0; i < vetorInvertido.length; i++) {

                // Exibe cada posição e seu respectivo valor
                System.out.println("VetorInvertido[" + i + "] = " + vetorInvertido[i]);
            }
        }
}