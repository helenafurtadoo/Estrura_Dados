public class No {
    private int numero = 0;
    private No proximo = null;

    public no() {
    }

    public No(int numero, no proximo) {
        this.numero = numero;
        this.proximo = proximo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(no proximo) {
        this.proximo = proximo;
    }
}