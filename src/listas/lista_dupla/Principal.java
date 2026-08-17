
package listas.lista_dupla;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //declarao de variavies 
        Scanner leitor = new Scanner(System.in);
        Lista objLista = new Lista();
        int opcao = 0;

        //processamneto 
        while (opcao != 5) {
            System.out.println("ESCOLHA SUA OPCAO: 1- inserir, 2- excluir 3- imprimir, 4- um milhao, 5- sair");
            System.out.println("digite a sua opcao: ");
            opcao = leitor.nextInt();

            if (opcao == 1) {
                System.out.print("Digite um numero para inserir: ");
                objLista.inserir(leitor.nextInt());
            }else if (opcao == 2) {
                System.out.print("Digite um numero para excluir: ");
                objLista.excluir(leitor.nextInt());
            } else if (opcao == 4) {
                for (int i = 0 ; i < 100000 ; i++) {
                    objLista.inserir(i);
                }
            }
        }
        leitor.close();
    }
}