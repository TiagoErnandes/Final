import java.util.Random;
import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int[] vet1 = new int[10];
        int[] vet2 = new int[vet1.length];
        int[] vet3 = new int[vet1.length];

        for(int i =0 ;i < vet1.length;i++){
            System.out.println("Digite o valor do vetor 1 na posição: "+(i+1));
            vet1[i] = rand.nextInt(100);
            System.out.println("Digite o valor do vetor 2 na posição: "+(i+1));
            vet2[i] = rand.nextInt(100);
        }
        for(int i =0;i <vet1.length;i++){
            vet3[i] = vet1[i]+vet2[i];
        }
        for(int i =0;i <3;i++){
            System.out.println();
            for(int j=0;j<vet1.length;j++){
                if(i==0){
                    System.out.print(vet1[j]+"   ");
                }else if(i ==1){
                    System.out.print(vet2[j]+"   ");
                }else if (i ==2){
                    System.out.print(vet3[j]+"  ");
                }
            }
        }



    }
}
