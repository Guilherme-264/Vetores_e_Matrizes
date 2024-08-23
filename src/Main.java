public class Main {
    public static void main(String[] args) {
        int[] inteiros = new int[10];
        inteiros[2] = 25;
        inteiros[3] = 48;

        for (int i = 0; i < inteiros.length; i++) {
            System.out.println(inteiros[i]);
        }

        int [][] matriz = new int[3][3];
        matriz[0][2]= 30;
        System.out.println(matriz[0][2]);


        int[][] matriz2 = {
                {1, 2, 4},
                {3, 5, 7},
                {6, 8, 9}
        };
        System.out.println("posição número "+ matriz2[1][1]);
    }
}
