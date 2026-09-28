package deques;

public class Deque {
    //prop´riedades da classe
    private No cabeca = null;

    //metodos da classe
    public void entrarPelaEsquerda(int numero) {
        cabeca = new No(numero,cabeca);
    }

    public void entrarPelaDireita(int numero) {
        //cenario facil : deque vazio
        if (cabeca == null) {
            cabeca = new No(numero,cabeca);
            return;
        }

        //cenario dificil : deque nao vazio (LENTO)
        No ultimo = cabeca;
        while (ultimo.getProximo() != null) {
            ultimo = ultimo.getProximo();
        }
        ultimo.setProximo(new No(numero, null));
    }
    public void sairPelaEsquerda() {
        //cenario MUITO facil: deque vaizo
        if (cabeca == null) {
            return;
        }

        //cenario facil: deque NAO vazio
        System.out.println(cabeca.getNumero());
        cabeca = cabeca.getProximo();
    }

    public void sairPelaDireita() {
        //cenario MUITO facil: deque vazio
        if (cabeca == null) {
            return;
        }

        //cenario facil: deque com so UM no
        if (cabeca.getProximo() == null) {
            System.out.println(cabeca.getNumero());
            cabeca = null;
            return;
        }

        //cenario dificil : deque tem MAIS DE UM no
        No penultimo = cabeca;
        while (penultimo.getProximo().getProximo() != null) {  //o proximo do proximo == nulo
            penultimo = penultimo.getProximo();
        }
        //pegando o ultimo
        System.out.println(penultimo.getProximo().getNumero());
        penultimo.setProximo(null);

    }

    public void imprimir() {
        No ponteiro = cabeca;
        while (ponteiro != null) {
            System.out.println(ponteiro.getNumero());
            ponteiro = ponteiro.getProximo();
        }
    }
}