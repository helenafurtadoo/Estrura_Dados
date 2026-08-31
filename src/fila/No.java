package fila;

public class No {
    //prorpiedade da class
    private int numero = 0;
    private  No proximo = null;

    //metodos construtores da class
    public No(int numero , No proximo) {
    super();
    this.numero = numero;
    this.proximo = proximo;
    }

    //metodos de acesso da classe
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}