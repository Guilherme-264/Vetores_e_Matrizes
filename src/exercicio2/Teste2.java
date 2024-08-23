package exercicio2;

public class Teste2 {
    public static void main(String[] args) {


       Matriz numeros = new Matriz(2,3);

       //adicionando valores na coluna 1
       numeros.adicionarValor(0, 0, 8);
       numeros.adicionarValor(0, 1, 15);
       numeros.adicionarValor(0, 2, 31);

        //adicionando valores na coluna 2
       numeros.adicionarValor(1, 0, 27);
       numeros.adicionarValor(1, 1, 8);
       numeros.adicionarValor(1, 2, 11);


       System.out.println("O maior elemento da matriz é: " + numeros.maiorElemento());
       System.out.println("O menor elemento da matriz é: " + numeros.menorElemento());
       System.out.println("A média dos valores é: " + numeros.mediaDosValores());

       numeros.somaLinha();
       numeros.somaColuna();

       System.out.println("soma total dos números: " + numeros.somaTotal());

       numeros.ocorrenciaDeValores(8);

    }
}
