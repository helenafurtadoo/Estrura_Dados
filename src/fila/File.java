package fila;

public class File {
    //propriedades da classe
    private No cabeca = null;

    //metodos da classe
    public void entrar(int numero) {
        cabeca = new No(numero, cabeca);
    }

    public void sair() {

        //caso facil -> lista vazia
        if (cabeca == null) {
            System.out.println("A fila esta vazia");
            return;
       }
        //caso medio -> fila so tem um unico no
        if (cabeca.getProximo() == null) {
            System.out.println(cabeca.getNumero());
            return;
        }
        // caso dificil -> fila tem mais de um no (vai precisar procurar o ultimo| ou seja, parar no penultimo para excluir o proximo (o proximo do proximo == null)
        No ponteiro = cabeca;
        while (ponteiro.getProximo().getProximo() != null) {
            ponteiro = ponteiro.getProximo();
        }
        System.out.println(ponteiro.getProximo().getNumero());
        ponteiro.setProximo(null);
}
}
