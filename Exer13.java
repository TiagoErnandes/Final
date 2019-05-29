import java.util.Scanner;

public class Exer13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int na;
        System.out.println("Digite a quantidade de numeros do vetorA");
        na = scan.nextInt();
        int[] vetorA = new int[na];

        for (int i =0 ; i < vetorA.length;i++){
            System.out.println("Digite o valor do vetor A "+(i+1));
            vetorA[i] = scan.nextInt();

        }

        int nb;
        System.out.println("Digite a quantidade de numeros do vetorB");
        nb = scan.nextInt();
        int[] vetorB = new int[nb];
        for (int i =0 ; i < vetorB.length;i++){
            System.out.println("Digite o valor do vetor B "+(i+1));
            vetorB[i] = scan.nextInt();
        }

        int[] vetorC = new int[vetorA.length+vetorB.length];
        for (int i =0;i<vetorA.length;i++){
           vetorC[i] = vetorA[i];
         }
        for (int i =0;i<vetorB.length;i++){
            vetorC[i+vetorA.length] = vetorB[i];
        }
        int aux=0;
        for (int i =0;i<vetorC.length;i++){
            for (int j =0;j < vetorC.length-1;j++){
                if(vetorC[j] > vetorC[j+1]){
                    aux = vetorC[j];
                    vetorC[j] = vetorC[1+j];
                    vetorC[j+1] = aux;
                }
            }

          }
        for(int i =0;i < vetorC.length;i++){
            System.out.print(vetorC[i]+" ");
        }


    }
}
