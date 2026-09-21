public class MatrizEsparsa {
    // propriedade da classe
    private Diretor cabeca = null;
    private int modulo = 0; // aceita qualquer quantidade de linhas, p isso, precisa fazer um contrutor cheio da classe
    // ou seja vai ser OBRIGATORIO passar quantas linhas ele quer na matriz

    // metodo construtor cheio da classe
    public MatrizEsparsa(int modulo) {
        this.modulo = modulo;
    }
    // metodos da classe
    private Diretor procurarDiretor(int numero){  //me diz qual numero vc quer achar, se n encontrar, ele cria esse numero na matriz
        int resto = (numero % modulo); // divide o numero pelo modulo, e pega o resto da divisao

        Diretor ponteiro = cabeca; //apomta o ponteiro para a cabeca
        // enquanto procura e nao achou || E || achou o numero q ta procurando e pega o resto (q é o numero q ta procurando)
        while((ponteiro != null0) && (ponteiro.getResto() != resto)) {
            ponteiro = ponteiro.getProximoDiretor();
        }
        //cenario de resto encontrado
        if (ponteiro != null) {
            return ponteiro;
        }
        // cenario de resto NAO encontrado (entao vai precisar criar um novo
        cabeca = new Diretor(resto, null,  cabeca) { //cria um novo,aponta o ponteiro para nulo, e para a cabeca velha | insercao no formato de pilha, pela cabeca
        return cabeca;
        }
    }
    //metodo da classe que vai inserir o numero
    public void inserir(int numero) {
        //procurar o diretor || se acha, devolve no ponteiroDiretor, se nao achar, vai cfriar um novo com esse numero q ta procurado
        Diretor ponteiroDiretor = procurarDiretor(numero);

        ponteiroDiretor.setProximoNo(new No(numero,
                                        ponteiroDiretor.getProximoNo())) ;
        }
        // exclusao de um numero cenarios: lista vazia | se eu qser excluir o primeiro | se eu qser excluir algum q esteja no meio | procurar e nao achar -> nao faz nada
        public void excluir(int numero) {
            Diretor ponteiroDiretor = procurarDiretor(numero);

            //cenario MUITO facil: lista vazia
            if (ponteiroDiretor.getProximoNo() == null) {
                return;
            }
            // cenario facil: excluir o primeiro (aponta para o proximo do no, se for igual o numero q botou, volta para o ponteiro e aponta para o reproximo (getpoximoNo.getproximo)
            if (ponteiroDiretor.getProximoNo().getNumero() == numero) {
                ponteiroDiretor.setProximoNo(ponteiroDiretor.getProximoNo()
                        .getroximo());
                return;
            }
            //casos dificeis -> vai precisar fazer uma procura do numero

            //procura do numero
            No anterior = ponteiroDiretor.getProximoNo();
            //condicoes: ou a lista acaba e eu nao achei || ou || vou parar antes do cara q estou procurando
            while ((anterior.getProximo() != null) &&
                    (anterior.getProximo().getNumero() != numero)) {
                anterior = anterior.getProximo();
            }
            //cenario dificil: o numero nao foi encontrado
            if (anterior.getProximo() == null) {
                return;
            }
            //cenario dificil: o numero foi encontrado
            anterior.setProximo(anterior.getProximo().getProximo()); //vai para o reproximo
        }
        public void imprimir() {
        System.out.println("Resto \t Números");
        Diretor ponteiroDiretor = cabeca;
        //linhas
        while (ponteiroDireto != null) {
            System.out.print(ponteiroDiretor.getResto() + "\t");
            No ponteiroNo = ponteiroDiretor.getProximo();
         //colunas
            while (ponteiroNo != null ) {
                System.out.print(ponteiroNo.getNumero() + ", ");
                ponteiroNo = ponteiroNo.getProximo();
            }
            System.out.println();
            ponteiroDiretor = ponteiroDiretor.getProximoDiretor();
        }
    }
}