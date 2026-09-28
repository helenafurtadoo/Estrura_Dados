package matrizes.matrizEsparsa;

public class Diretor {
    //prorpiedades da classe
    //representa as linhas da matriz
    private int resto = 0;
    private No proximoNo = null;
    private Diretor proximoDeretor = null;

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    public int getResto() {
        return resto;
    }

    public void setResto(int resto) {
        this.resto = resto;
    }

    public Diretor getProximoDeretor() {
        return proximoDeretor;
    }

    public void setProximoDeretor(Diretor proximoDeretor) {
        this.proximoDeretor = proximoDeretor;
    }

    public Diretor(Diretor proximoDeretor, No proximoNo, int resto) {
        this.proximoDeretor = proximoDeretor;
        this.proximoNo = proximoNo;
        this.resto = resto;


    }
}