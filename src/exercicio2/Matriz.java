package exercicio2;

public class Matriz {
    private int[][] matriz;
    private int maiorValorX;
    private int maiorValorY;

    //Construtor:
    public Matriz(int valorX, int valorY){
        matriz = new int [valorX][valorY];
        maiorValorX = valorX;
        maiorValorY = valorY;
    }

    //preencher matriz
    public void adicionarValor(int posicaoX, int posicaoY, int valor){
        matriz[posicaoX][posicaoY] = valor;
        System.out.println("valor salvo");
    }

    //Obter Maior Elemento:
    public int maiorElemento(){
        int maiorValor = 0;
        for (int i = 0; i < maiorValorX; i++) {
            for (int j = 0; j < maiorValorY; j++) {
                if (matriz[i][j] >= maiorValor){
                    maiorValor = matriz[i][j];
                }
            }
        }
        return maiorValor;
    }

    //Obter Menor Elemento:
    public int menorElemento(){
        int menorValor = 9999999;
        for (int i = 0; i < maiorValorX; i++) {
            for (int j = 0; j < maiorValorY; j++) {
                if (matriz[i][j] <= menorValor){
                    menorValor = matriz[i][j];
                }
            }
        }
        return menorValor;
    }

    //Calcular Média dos Elementos:
    public float mediaDosValores(){
        int acumulador = 0;
        int soma = 0;
        float media;
        for (int i = 0; i < maiorValorX; i++) {
            for (int j = 0; j < maiorValorY; j++) {
                soma += matriz[i][j];
                acumulador++;
            }
        }
        media = soma / acumulador;
        return media;
    }

    //Somar Elementos por Linha:
    public void somaLinha(){
        String str = "[";
        for (int i = 0; i < maiorValorX; i++) {
            int soma = 0;
            for (int j = 0; j < maiorValorY; j++) {
                soma += matriz[i][j];
            }
            if (i < maiorValorX -1) {
                str += soma + ", ";
            }else {
                str += soma + "]";
            }
        }
        System.out.println("A soma das linhas é: " + str);
    }



    //Somar Elementos por Coluna:
    public void somaColuna(){
        String str = "[";
        for (int i = 0; i < maiorValorY; i++) {
            int soma = 0;
            for (int j = 0; j < maiorValorX; j++) {
                soma += matriz[j][i];
            }
            if (i < maiorValorY-1) {
                str += soma + ", ";
            }else {
                str += soma + "]";
            }
        }
        System.out.println("A soma das colunas é: " + str);

    }

    //Calcular Soma Total:
    public int somaTotal(){
        int soma = 0;
        for (int i = 0; i < maiorValorX; i++) {
            for (int j = 0; j < maiorValorY; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }

    //Contar Ocorrências de um Valor:
    public void ocorrenciaDeValores (int valor){
        int contador = 0;
        for (int i = 0; i < maiorValorX; i++) {
            for (int j = 0; j < maiorValorY; j++) {
                if (valor == matriz[i][j]){
                    contador++;
                }
            }
        }
        System.out.println("O valor " + valor + " aparece " + contador + " vezes");
    }

}
    