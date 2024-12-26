import java.util.Scanner;

public class DeterminanteMatrizFacil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cria uma matriz 3x3 para armazenar os valores
        int[][] matriz = new int[3][3];

        System.out.println("Digite os 9 valores da matriz 3x3:");

        // Lê os valores da matriz do usuário
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Valor [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = scanner.nextInt();
            }
        }

        // Calcula o determinante da matriz
        int determinante = matriz[0][0] * ((matriz[1][1] * matriz[2][2]) - (matriz[1][2] * matriz[2][1]))
                - matriz[0][1] * ((matriz[1][0] * matriz[2][2]) - (matriz[1][2] * matriz[2][0]))
                + matriz[0][2] * ((matriz[1][0] * matriz[2][1]) - (matriz[1][1] * matriz[2][0]));

        // Exibe o determinante na tela
        System.out.println("O determinante da matriz é: " + determinante);
    }
}
//import java.util.Scanner;
//public class Matriz {
//  public static void main(String[] args) {
//      Scanner scanner = new Scanner(System.in);

//      int[][] matriz = new int[3][3];

//      System.out.println("Digite 9 valores inteiros da matriz 3x3: ");

      // Leitura dos valores da matriz
//        for (int i = 0; i <3; i++){
//          for (int j = 0; j < 3; i++){
//              System.out.println("Valor [" + i + "][" + j + "]: ");
//              matriz[i][j] = scanner.nextInt();
//          }
      //      }
      //// Cálculo do determinante
//int determinante = matriz[0][0] * ((matriz[1][1] * matriz[2][2]) - (matriz[1][2] * matriz[2][1]))
//              - matriz[0][1] * ((matriz[1][0] * matriz[2][2]) - (matriz[1][2] * matriz[2][0]))
//              + matriz[0][2] * ((matriz[1][0] * matriz[2][1]) - (matriz[1][1] * matriz[2][0]));


        // Exibição do determinante
//      System.out.println("O determinante da matriz é: "+ determinante);
//  }
//}
