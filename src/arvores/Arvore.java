package arvores;

public class Arvore {
    //propriedades da classe
    private No raiz = null;

    //metodos da classe
    public void inserir(int numero){
        //(arvore velha, e o numero que vou inserir) | vou pegar esse numero e jogar dentro da raiz
        raiz = inserir(raiz, numero);
    }

    private No inserir(No raiz, int numero) {
        //cenario facil -> Arvore vazia
        if (raiz == null) {
            return new No(null, null, null, null, null, numero); //cria um novo No que é apontado para a raiz
        }
        //cenario dificil -> Arvore NAO vazia --> PRIMEIR coisa a deicidir, é sortear em qual filho o novo nó vai entrar
        int sorteio = (1 + ((int) (5 * Math.random()))); // o  +1 e o int nao usa a parte fracionaria para o sorteio ficar exatamenente de 0 a 5

       if (sorteio == 1) {
           raiz.setFilho1(inserir(raiz.getFilho1(), numero));
       } else if (sorteio == 2) {
           raiz.setFilho2(inserir(raiz.getFilho2(), numero));
       }else if (sorteio == 3) {
           raiz.setFilho3(inserir(raiz.getFilho3(), numero));
       }else if (sorteio == 4) {
           raiz.setFilho4(inserir(raiz.getFilho4(), numero));
       }else {
           raiz.setFilho5(inserir(raiz.getFilho5(), numero));
       }

        return raiz;
    }

    public void imprimir() {
        imprimir(raiz, "");
    }
    private void imprimir(No raiz, String identacao){
        if (raiz == null) return;

        System.out.println(identacao + raiz.getNumero());
        imprimir(raiz.getFilho1(), identacao + "---");
        imprimir(raiz.getFilho2(), identacao + "---");
        imprimir(raiz.getFilho3(), identacao + "---");
        imprimir(raiz.getFilho4(), identacao + "---");
        imprimir(raiz.getFilho5(), identacao + "---");

    }

}

//metodo para inserir  -> na raiz | e metodo para imprimir --> preciso de uma referencia da raiz, que eu n vou ter fora da classe pq ela eh private
// metodo fake - é o privado

//quando executa a linha 20 ele vai para a 12  depois volta pra 20 dnv

// linha 7 para inserir o numero 3 no no -> via para a linha 12 (raiz é nuklar?)-> vai para a 17 (sorteia um numero) -> vai para a 20 0 ovlta para a 12  ---> cria um novo no

//na ocmputacao grafica, geralmente se imprime a arvore deitada por meio de identacao