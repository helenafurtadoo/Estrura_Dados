package listas;

public class Lista {
    //propriedades da classe (lista encadeada so tem uma unica rferencia (ponteiro) -> que é a cabeca)
    private No cabeca = null;

    //metodos da classe
    public void inserir(int numero) {

        //caso facil: lista vazia 
        if (cabeca == null) {
            cabeca = new No(numero, null);
            return;
        }
        
        //caso dificil: lista NAO vazia
        No ultimo = cabeca;
        while (ultimo.getProximo() != null) { // enquanto proximo nao for nulo, 
            ultimo = ultimo.getProximo(); // aqui que ele fica passando a lista ate achar o nulo e parar
        }
        ultimo.setProximo(new No(numero, null));



    }
    public void excluir (int numero) {
        //caso muito facil (1): lista vazia
        if (cabeca == null) {
            return;
        }
        //caso facil (2) : excluir o primeiro no da lista
        if (cabeca.getNumero() == numero) {
            cabeca = cabeca.getProximo();
            return;
        }
        
        // caso dificil (3) : excluir algum no do meio ou no final da lista | aqui, para excluir o numero, vai precisar olhar para o anterior
        No anterior = cabeca;
        while ((anterior.getProximo() != null) &&
            (anterior.getProximo().getNumero() != numero)) {
                anterior = anterior.getProximo();
            }
            if (anterior.getProximo() == null) {
                //caso em que foi tentatada a exclusao de um numero que nao existe 
                return;
            }
            //caso a exclusao propriamente dita no meio ou no fim 
            anterior.getProximo(); // o proximo do anterio = o proximo do proximo --> entao se em uma lista de 1 | 2 | 3 e eu quero excluir o 2, eu volto para o 1 anterior do 2) e pulo para o proximo do proximo (que é 3) excluindo assim o 2    }

        }
        // Saida de dados
        public void imprimir() { //apontando o ponteiro para a cabeca, imprime, e vai indo para a frente ate o nulo 
            No ponteiro = cabeca;
            while (ponteiro != null) {
                System.out.println(ponteiro.getNumero());
                ponteiro = ponteiro.getProximo();
            }
        }
}
// casos / situacoes que podem acontecer ao excluir a lista
    // 1) lista vazia
    // 2) primeiro no
    // 3) nao primeiro no (algum no do meio)
    // 4) nao existe