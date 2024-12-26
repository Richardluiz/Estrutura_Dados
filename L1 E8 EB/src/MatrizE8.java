import java.util.Scanner;
public class MatrizE8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das dimensões da primeira matriz
        System.out.println("Digite o número de linhas da primeira matriz: ");
        int linhasA = scanner.nextInt();
        System.out.println("Digite o número de colunas da primeira matriz: ");
        int colunasA = scanner.nextInt();

        // Leitura das dimensões da segunda matriz
        System.out.println("Digite o número de linhas da segunda matriz: ");
        int linhasB = scanner.nextInt();
        System.out.println("Digite o número de colunas da segunda matriz: ");
        int colunasB = scanner.nextInt();

        // Verificação se a multiplicação é possível
        if (colunasA != linhasB) {
            System.out.println("A multiplicação de matrizes não é possível.");
            return;
        }

        // Criação das matrizes
        int[][] matrizA = new int[linhasA][colunasA];
        int[][] matrizB = new int[linhasB][colunasB];
        int[][] matrizC = new int[linhasA][colunasB];

        // Leitura dos elementos da primeira matriz
        System.out.println("Digite os elementos da primeira matriz");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                matrizA[i][j] = scanner.nextInt();
            }
        }
        //leitura dos elementos da segunda matriz
        System.out.println("Digite os elementos da segunda matriz: ");
        for (int i = 0; i < linhasB; i++){
            for (int j = 0; j < colunasB; j++){
                matrizB[i][j] = scanner.nextInt();
            }
        }

        //Cálculo da multiplicação das matrizes
        for (int i = 0; i < linhasA; i++){
            for (int j = 0; j < colunasB; j++){
                for (int k = 0; k < colunasA; k++){
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        //Exibição da matriz resultante
        System.out.println("Matriz resultante da multiplicação: ");
        for (int i = 0; i < linhasA; i++){
            for (int j = 0; j < colunasB; j++){
                System.out.println(matrizC[i][j]+" ");
            }
            System.out.println();
        }
    }
}
