package ordenacao;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        //declaracao de variaveis
        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[7];

        //entrada de dados
        for (int i = 0 ; i < vetor.length ; i++) {
            System.out.print("Digite o valor da posicao" + i + ":");
            vetor[i] = leitor.nextInt();
        }
        leitor.close();
        
        //processamneto
        boolean continuar = false;
        do {
            for (int i = 0; i < (vetor.length - 1) ; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    continuar = true;
                    
                }

            }
        } while(continuar);

        //saida de dados
        for (int i = 0 ; i < vetor.length ; i++) {
            System.out.println(vetor[i]);
        }
        
    }

}
