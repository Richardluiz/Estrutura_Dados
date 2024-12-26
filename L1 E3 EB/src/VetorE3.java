import java.util.Scanner;
public class VetorE3 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valorInicial = entrada.nextInt();

        int[] vetor = new int[10];

        // Preenche a primeira posição com o valor lido
          vetor[0] = valorInicial;

          //Preenche as posições subsequentes com o dobro do valor anterior
           for (int i = 1; i < vetor.length; i++){
               vetor[i] = vetor[i - 1] * 2;

           }
        // Mostra o vetor
        System.out.println("Vetor: ");
           for (int i = 0; i < vetor.length; i++){
               System.out.println(vetor[i] + " ");
           }
       }

   }
