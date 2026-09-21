public class Principal {
    public static void main(String[] args) {
        MatrizEparsa objMatrizEsparsa = new MatrizEsparsa(3);

        objMatrizEsparsa.inserir(5);
        objMatrizEsparsa.inserir(10);
        objMatrizEsparsa.inserir(193);
        objMatrizEsparsa.inserir(4);
        objMatrizEsparsa.inserir(33);
        objMatrizEsparsa.inserir(21);
        objMatrizEsparsa.imprimir();

        objMstrizEsparsa = new MatrizEsparsa(16);
        for(int i = 0 ; i < 1000 ; i++) {
            objMatrizEsparsa.inserir(i);
        }
        objMatrizEsparsa.imprimir();
    }
}