package listas;

public class No {
    //propriedades da classe
    private int numero = 0;
    private No proximo = null; //null pq é como se fosse o final da lista

    // contrutores/
    public No() {
        super();
    }
    
    public No(int numero, No proximo) {
        this.numero = numero;
        this.proximo = proximo;
    }

    // metodos de acesso da classe
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
