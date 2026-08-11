package listas;

public class Principal {

    public static void main(String[] args) {

        Lista objLista = new Lista();

        objLista.imprimir(); // não imprime nada -> lista está vazia

        objLista.inserir(1);
        objLista.inserir(2);
        objLista.inserir(3);
        objLista.inserir(4);
        objLista.inserir(5);

        objLista.imprimir();

        objLista.excluir(1);
        objLista.excluir(3);
        objLista.excluir(5);
        objLista.excluir(10); // não existe

        objLista.imprimir();

        // segundo teste
        for (int i = 0; i < 1000000; i++) {
            objLista.inserir(i);
            System.out.println(i);
        }
    }
}