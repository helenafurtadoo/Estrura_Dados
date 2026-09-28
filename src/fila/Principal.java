package fila;

public class Principal {
    public static void main(String[] args) {
        File objFila = new File();

        for (int i = 0 ; i < 1000000 ; i++) {
            objFila.entrar(i);
        }
        for (int i = 0 ; i <= 100000 ; i++) {
            objFila.sair();
        }
        Pilha objPilha = new Pilha();
        for (int i = 0 ; i < 1000000 ; i++) {
            objPilha.push(i);
        }
        for (int i = 0 ; i <= 100000 ; i++) {
            objPilha.pop();
        }
    }
}
