public class Principal {
    public static void main{String[] args) {
        Deque objDeque = new Deque();

        for (int i = 0 ; i < 5 ; i++) {
            objDeque.entrarPelaEsquerda(i);
        }
        for (int = 1000 ; i < 1005 ; i++) {
            objDeque.entrarPelaDireita(i);
        }
        objDeque.imprimir();
        for (int i = 0 ; i < 10 ; i++) {
            objDeque.sairPelaDireita();
        }
    }
}
