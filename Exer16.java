import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Exer16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vet = new int[10];
        int[] fatorial = new int[10];
        Arrays.fill(fatorial,1);
        Random rand = new Random();
        for(int i =0;i < vet.length;i++){
           vet[i] = rand.nextInt(11);
        }



        for(int i =0; i<vet.length;i++){
            for(int j =vet[i];j>0;j--){
                fatorial[i]*=j;
            }
        }
        System.out.println("Numeros Digitados");
        for(int i =0;i < vet.length;i++){
            System.out.print(vet[i]+"  ");
        }
        System.out.println();
        System.out.println("Fatorial equivalentes");
        for(int i =0;i < vet.length;i++){
            System.out.print(fatorial[i]+" ");
        }


    }
}
