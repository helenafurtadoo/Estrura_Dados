package matrizes;

import java.util.Scanner;

public class MultiplicacaoMatrizes {
    public static void main(String[] args) {

        // ======================================================
        // DECLARAÇÃO DAS VARIÁVEIS
        // ======================================================

        Scanner leitor = new Scanner(System.in);

        // Primeira matriz (2x3)
        int[][] operando1 = new int[2][3];

        // Segunda matriz (3x2)
        int[][] operando2 = new int[3][2];

        // Resultado (2x2)
        int[][] resultado = new int[2][2];

        // ======================================================
        // LEITURA DA PRIMEIRA MATRIZ
        // ======================================================

        for (int i = 0; i < operando1.length; i++) {

            for (int j = 0; j < operando1[i].length; j++) {

                operando1[i][j] = leitor.nextInt();
            }
        }

        // ======================================================
        // LEITURA DA SEGUNDA MATRIZ
        // ======================================================

        for (int i = 0; i < operando2.length; i++) {

            for (int j = 0; j < operando2[i].length; j++) {

                operando2[i][j] = leitor.nextInt();
            }
        }

        leitor.close();

        // ======================================================
        // MULTIPLICAÇÃO DAS MATRIZES
        // ======================================================

        /*
         *
         * i = linha do resultado
         * j = coluna do resultado
         * k = quantidade de multiplicações (somatório)
         *
         */

        for (int i = 0; i < resultado.length; i++) {

            for (int j = 0; j < resultado[i].length; j++) {

                for (int k = 0; k < operando2.length; k++) {

                    resultado[i][j] += operando1[i][k] * operando2[k][j];

                }

            }

        }

        // ======================================================
        // SAÍDA DOS DADOS
        // ======================================================

        System.out.println("Resultado:");

        for (int i = 0; i < resultado.length; i++) {

            for (int j = 0; j < resultado[i].length; j++) {

                System.out.print(resultado[i][j] + "\t");

            }

            System.out.println();

        }

    }
}
