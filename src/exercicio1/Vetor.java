package exercicio1;

import javax.lang.model.type.NullType;

public class Vetor {
    private String[] elementos;
    private int posicaoAtual;

    //criando lista
    public Vetor(int capacidade)
    {
        elementos = new String[capacidade];
        posicaoAtual = 0;
    }

    //adicionar item na primeira posição livre
    public void inserir(String elemento)
    {
        if (elementos.length > posicaoAtual)
        {
            elementos[posicaoAtual] = elemento;
            posicaoAtual++;
        }else {
            System.out.println("vetor cheio");
        }
    }

    //substituir alguma posição ja ocupada
    public void alterar(int indice, String elemento)
    {
        if (indice > -1 && indice < posicaoAtual)
        this.elementos[indice] = elemento;
    }

    //excluir elemento
    public void excluir(int indice)
    {
        for (int i = indice; i < posicaoAtual; i++) {
            elementos[i] = elementos[i+1];
        }
        posicaoAtual--;
    }

    //duplicar capacidade da lista
    public void aumentarCapacidade()
    {
        String[] novoVetor = new String[elementos.length * 2];
        for (int i = 0; i < elementos.length; i++) {
            novoVetor[i] = elementos[i];
        }
        elementos= novoVetor;
    }

    //adicionar elemento em posição expecifica
    public void adicionarElemento(int indice, String elemento)
    {
        int posicaoAdicionar = posicaoAtual;
        if (indice > -1 && indice < posicaoAtual) {
            for (int i = posicaoAtual; i > indice; i--) {
                elementos[posicaoAdicionar] = elementos[posicaoAdicionar -1];
                posicaoAdicionar--;
            }
            elementos[indice] = elemento;
            posicaoAtual ++;
        }
    }

    //voltar elemento expecifico da lista
    public String stringUnica(int indice)
    {
        return elementos[indice];
    }


    //remover elemento pelo conteudo
    public void removeConteudo(String conteudo)
    {
        int posicaoremover;
        for (int i = 0; i < posicaoAtual; i++) {
            if (elementos[i] == conteudo)
            {
                posicaoremover = i;
                for (int j = i; j < posicaoAtual; j++) {
                    elementos[j] = elementos[posicaoremover+1];
                }
                posicaoAtual--;
                return;
            }
        }
        System.out.println("Item não encontrado na lista");
    }

//verificando se elemento existe
    public void verificarElemento(String elemento) {
        for (int i = 0; i < posicaoAtual; i++) {
            if (elementos[i] == elemento){
                System.out.println(elemento + " existe na lista");
                return;
            }
        }
        System.out.println(elemento + " não foi encontrado na lista");
    }

    //retorna o tamanho do vetor
    public void retornaTamanho(){
        int posicaoAnterior = posicaoAtual;
        System.out.println("Tem " + posicaoAnterior-- + " elementos no vetor");
    }

    //verificando se a posição do vetor é nula
    public void verificandoSeElementoNulo(int indice){
        if(indice < posicaoAtual && indice > -1){
            System.out.println("O valor procurado não é nulo");
        }else {
            System.out.println("O valor procurado é nulo");
        }
    }

    //limpar vetor
    public void limparVetor(){
        posicaoAtual = 0;
        System.out.println("O vetor foi limpo");
    }

    @Override
    //voltar todos os elementos da lista
    public String toString () {
        String str;
        str = "[";
        for (int i = 0; i < posicaoAtual; i++) {
            if (i < posicaoAtual - 1) {
                str += elementos[i] + ", ";
            } else {
                str += elementos[i] + "]";
            }
        }
        return str;
    }
}
