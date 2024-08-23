package exercicio1;

public class Teste1 {
    public static void main(String[] args) {
        Vetor frutas = new Vetor(5);
        frutas.inserir("maçã");
        frutas.inserir("abacaxi");
        frutas.inserir("kiwi");

        frutas.alterar(2, "melancia");

        frutas.excluir(0);
        //frutas.listarVetor();

        frutas.inserir("abacate");
        frutas.aumentarCapacidade();

        frutas.adicionarElemento(2, "abobora");
//        System.out.println(frutas.toString());

        frutas.removeConteudo("abobora");
        System.out.println(frutas.toString());

        frutas.verificarElemento("acacate");

        frutas.retornaTamanho();

        frutas.verificandoSeElementoNulo(2);

        frutas.limparVetor();
        frutas.toString();
    }
}
