package fila;

public class Pilha {
    //propriedades da classe
    private No cabeca = null;

    //metodos da classe
    public void push(int numero) {
        cabeca = new No(numero, cabeca) {
            cabeca = new No(numero, cabeca);
        }
        public void pop() {
            //caso MUITO facil: pilha vazia
        if (cabeca == null) {
            return;
        }
        //caso facil: pilha NAO vaiza
        System.out.println(cabeca.getNumero());
        cabeca = cabeca.getProximo();
        }
    }
}
