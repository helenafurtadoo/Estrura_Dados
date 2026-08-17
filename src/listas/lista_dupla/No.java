package listas.lista_dupla;

public class No {
    //prorpiedades da classe
    private int numero = 0;
    private No anterior = null;
    private No proximo = null;
    public int getNumero() {
        return numero;
    }
    public No() {
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public No(int numero, No anterior, No proximo) {
        this.numero = numero;
        this.anterior = anterior;
        this.proximo = proximo;
    }
    public No getAnterior() {
        return anterior;
    }
    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }
    public No getProximo() {
        return proximo;
    }
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

}
