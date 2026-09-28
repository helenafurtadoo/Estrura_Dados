package deques;

public class DequeBancario { //nao é comoportmento de pilha  APENAS de FILA
    //prorpriedades da classe
    private No filaNormal = null;
    private No filaPreferencial = null;

    //metodos da classe
    public void entrar(boolean normal, int numero){
        if (normal) {
            filaNormal = new No(numero, filaNormal);
        } else {
            filaPreferencial = new No(numero, filaPreferencial);
        }
    }

    private No sair(No fila) {
        //caso MUITO facil : fila vazia
        if (fila == null) {
            return null;
        }
        //cenario faicl: fila so tem um unico no
        if (fila.getProximo() == null) {
            System.out.println(fila.getNumero());
            return null;
        }

        // cenario dificil: fila tem mais de um no
        No penultimo = fila;
        while (penultimo.getProximo().getProximo() != null) {
            penultimo = penultimo.getProximo();
        }
        System.out.println(penultimo.getProximo().getNumero());
        penultimo.setProximo(null);
        return fila;
    }

    private int contador = 0;
    public void atender() {
        //cenario MUITO facil
        if ((filaNormal == null) && (filaPreferencial == null)) { //ambas as filas estao fechadas| n tem ninguem na agencia
            contador = 0; //contador = 0, pq so tem uma fila funcionando, logo, n precisa ficar cotando quantos ta atendendo
            return;
        }

        //cenario facil: so tem gente na fila normal --> pq a filapreferencial é nula!!
        if (filaPreferencial == null) {
            filaNormal = sair(filaNormal);
            return;
        }

        //cenario faicl: so tem gente na fila prefernecial
        if (filaNormal == null) {
        filaPreferencial = sair(filaPreferencial);
        contador = 0; //contador = 0, pq so tem uma fila funcionando, logo, n precisa ficar cotando quantos ta atendendo
        return;
        }

        //cenario MUITO dicil: ambas as filas tem gente
        if (contador < 3) {
            filaPreferencial = sair(filaPreferencial);
            contador++;
        } else {
            filaNormal = sair(filaNormal);
            contador = 0;
        }


    }
}

        /*fazer o teste desse rodando criando uma classe Principal
        DequeBancario onjDeque = new DequeBancario();

        objDeque.atender();
        for (int i = 0 ; i < 10, i++) {
            objDeque.entrar(true, i);
        }
        for (int i = 10000 ; i < 1010 ; i++) {
            objDeque.entrar(false, i);
        }
        for (int i = 0 ; i < 20 ; i++) {
            objDeque.atender();
        }
    }

}
*/