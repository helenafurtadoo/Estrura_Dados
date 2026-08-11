package matrizes;
// Importa a classe Scanner para leitura de dados do teclado
import java.util.Scanner;

public class MatrizTransposta {
    public static void main(String[] args) {

        // ======================================================
        // DECLARAÇÃO DAS VARIÁVEIS
        // ======================================================

        // Scanner utilizado para ler os valores digitados
        Scanner leitor = new Scanner(System.in);

        // Matriz original com 2 linhas e 3 colunas
        int[][] matrizOriginal = new int[2][3];

        // Matriz transposta com 3 linhas e 2 colunas
        // (linhas viram colunas)
        int[][] matrizTransposta = new int[3][2];

        // ======================================================
        // LEITURA DA MATRIZ ORIGINAL
        // ======================================================

        // Percorre todas as linhas
        for (int i = 0; i < matrizOriginal.length; i++) {

            // Percorre todas as colunas
            for (int j = 0; j < matrizOriginal[i].length; j++) {

                // Solicita um valor para a posição da matriz
                System.out.print("matrizOriginal[" + i + "][" + j + "]: ");

                // Armazena o valor informado
                matrizOriginal[i][j] = leitor.nextInt();
            }
        }

        // Fecha o Scanner
        leitor.close();

        // ======================================================
        // TRANSPOSIÇÃO DA MATRIZ
        // ======================================================

        /*
         * Fórmula:
         *
         * matrizTransposta[j][i] = matrizOriginal[i][j];
         *
         * O índice da linha passa a ser coluna.
         * O índice da coluna passa a ser linha.
         */

        for (int i = 0; i < matrizOriginal.length; i++) {

            for (int j = 0; j < matrizOriginal[i].length; j++) {

                matrizTransposta[j][i] = matrizOriginal[i][j];
            }
        }

        // ======================================================
        // IMPRIME A MATRIZ ORIGINAL
        // ======================================================

        System.out.println("Matriz Original:");

        for (int i = 0; i < matrizOriginal.length; i++) {

            for (int j = 0; j < matrizOriginal[i].length; j++) {

                System.out.print(matrizOriginal[i][j] + "\t");
            }

            System.out.println();
        }

        // ======================================================
        // IMPRIME A MATRIZ TRANSPOSTA
        // ======================================================

        System.out.println("\nMatriz Transposta:");

        for (int i = 0; i < matrizTransposta.length; i++) {

            for (int j = 0; j < matrizTransposta[i].length; j++) {

                System.out.print(matrizTransposta[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
