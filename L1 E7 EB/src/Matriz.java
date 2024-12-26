import java.util.Scanner;
public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N;
        do {
            System.out.println("Digite um número inteiro (2 ≤ N ≤ 5):");
            N = scanner.nextInt();
        } while(N < 2 || N >5);

        //Criando a matriz
        int[][] matriz = new int[N][N];

        int valor = 1;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                matriz[i][j] = valor++;
            }
        }

        // Cálculo do quadrado da matriz
        int[][] quadradoMatriz = new int[N][N];
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                for (int k = 0; k < N; k++){
                    quadradoMatriz[i][j] += matriz[i][k] * matriz[k][j];
                }
            }
        }

        // Exbição da matriz original e do quadrado da matriz
        System.out.println("Matriz original: ");
        exibirMatriz(matriz);
        System.out.println("Quadrado da matriz: " );
    }

    // Método para exibir uma matriz
    static void exibirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.println(matriz[i][j]+"");
            }
            System.out.println();
        }
    }
}
