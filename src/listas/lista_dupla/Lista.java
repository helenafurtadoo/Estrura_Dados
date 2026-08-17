package listas.lista_dupla;

public class Lista {
    //prpriedades da classe
    private No cabeca = null; //ponteiro para a cabeca

    //metodos da classe
    public void inserir(int numero) {
        //caso facil : LISTA VAZIA{
            cabeca = new No(numero, null, cabeca); // a cabeca tem duas referencias | antes da igualdade == cabeca nova | cabeca dps da igualdade == cabeca antiga
            if (cabeca.getProximo() != null) {
                cabeca.getProximo().setAnterior(cabeca);
            }

        }

        public void excluir(int numero) {
            // caso muito facil - LISTA VAZIA  (nao faz nada)
            if (cabeca == null) {
                return;
            }

            //caso facil -  EXCLUIR O PRIMEIRO NO DA LISTA (cabeca tem q ir pro proximo )
            if (cabeca.getNumero() == numero) {
                cabeca = cabeca.getProximo();
                if (cabeca != null) { //caso o proximo nao seja null
                    cabeca.setAnterior(null);
                }
                return;
            }

            // procura do numero a ser excluido 
            No ponteiro = cabeca;
            while ((ponteiro != null) && (ponteiro.getNumero() != numero)) { // enqianto o ponteiro for diferente de nulo E enquanto nao encontrar o numero q to procurnado, e vai indo para a frente ate achar
        
                ponteiro = ponteiro.getProximo();
            }

            //caso dificil - O NUMERO NAO FOI ENCONTRADO
            if (ponteiro == null) {
                return;
            }

            //caso MUITO dificil - o numero foi encontrado | aqui é como se o ponteiro fosse o 2 , e eu quisesse excluir ele 
            ponteiro.getAnterior().setProximo(ponteiro.getProximo()); 
            if (ponteiro.getProximo() != null) {
                ponteiro.getProximo().setAnterior(ponteiro.getAnterior());
            }

        }

        public void imprimir() {
            No ponteiro = cabeca;
            while (ponteiro != null) {
                    System.out.println(ponteiro.getNumero());
                    ponteiro = ponteiro.getProximo();
            }
        }
}
    

// -> quando insere numeros na lista - ele insere na ordem INVERSA | entao o ultimo numero inserido, fica logo dps da cabeca

// adicionar o 5 na lista
// add o 5 como se fosse o primeiro da lista | anterior vai ser nulo 
// caso facil -1- 
// 3 caso - 
