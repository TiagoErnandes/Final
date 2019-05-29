import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vet = new int[3];
        int[] produtorio = new int[3];
        int[] somatorio = new int[3];
        java.util.Arrays.fill(produtorio, 1);


        for (int i =0;i <vet.length;i++){
            System.out.println("Digite numero "+(i+1));
            vet[i] = scan.nextInt();
        }
        for (int i =0;i <vet.length;i++){
            for(int j = 1;j<vet[i]+1;j++){
                produtorio[i]*=j;
                somatorio[i]+=j;
            }
        }
        for(int i =0;i<vet.length;i++){
            System.out.print(produtorio[i]+" ");
        }
        System.out.println("Somatorio :");
        for(int i =0;i<vet.length;i++){
            System.out.print(somatorio[i]+" ");
        }

    }
}
