import java.util.Scanner;
public class VetorE2 {


    public static void main(String[] args) {
        int soma = 0;
        int media = 0;
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[10];

        // Imprimindo os 10 valores do usuário
        System.out.println("Digite 10 valores");
        for (int i = 0;i < 10;i++){
            vetor[i]= entrada.nextInt();
            soma += vetor[i];
            media /= vetor[i];

        }
        media = soma / 10;
        System.out.println("A média é: "+media);

        entrada.close();
    }
}
