package ordenacao;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] arg) {
        //declaracao de variaveis 
        Scanner leitor = new Scanner (System.in);
        int[] vetor = new int[7];

        //entrada de dados 
            for (int i = 0 ; i < vetor.length ; i++) {
                System.out.print("Digite o valor do inidce " + i + ":");
                vetor[i] = leitor.nextInt();

            }
            leitor.close();

            //processamento
            for (int i = 0 ; i < (vetor.length - 1) ; i++ ){ //primeiro ao penultimo
                for (int j = (i + 1); j < vetor.length ; j++) {
                    if (vetor[i] > vetor[j]){
                        int temp = vetor[j];
                        vetor[i] = vetor[i];
                        vetor[j] = temp;
                    }
                }

            }
            //saida de dados
            for (int i = 0 ; i < vetor.length ; i++) {
                System.out.println(vetor[i]);
            }
    }

}
//bubble sort(N ao quadrado quer dizer for dentro de for) - so compara com o numero que ta na frente ddele (de dois em dois):
// se for maior troca, se for menor , mantem
        // perfeito para banco de dados
// seelection sort - 