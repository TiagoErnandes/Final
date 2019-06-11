import java.util.Random;
import java.util.Scanner;

public class Exer19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[10];
        Random rand = new Random();
        String resultadoTot="";
        boolean resultado = false;
        int analise;


        for(int i=0 ; i<num.length;i++){
            num[i] = rand.nextInt(100);
        }
        System.out.println("Valor Preenchido");
        for(int i=0 ; i<num.length;i++){
            System.out.print(" "+num[i]);
        }
        System.out.println();
        System.out.println("Digite um numero para analise");
        analise = scan.nextInt();
        for(int i=0 ; i<num.length;i++){
           if (analise == num[i]){
               resultadoTot += "Valor "+analise+" está na posição "+i+" no vetor \n";
               resultado = true;
           }
        }
        if(resultado){
            System.out.println(resultadoTot);
        }else{
            System.out.println("Valor "+analise+" não está presente no vetor");
        }
    }
}
