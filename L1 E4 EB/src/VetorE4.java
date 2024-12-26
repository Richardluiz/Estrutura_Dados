import java.util.Scanner;
public class VetorE4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = entrada.nextInt();

        int[] vetorN = new int[100];

        // Preenche a prmeira posição com o valor lido

        vetorN[0] = valor;
        // Preenche as posições subsequentes com a metade do valor anterior
        for (int i = 1; i < vetorN.length;i++){
          vetorN[i] = vetorN[i - 1] / 2;

        }
        for (int i = 0;i < vetorN.length;i++) {
            System.out.println(vetorN[i] + "");
        }
    }

}
