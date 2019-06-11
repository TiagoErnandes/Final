import java.util.Random;

public class Exer18 {
    public static void main(String[] args) {
        int[] latas = new int[20];
        Random rand = new Random();
        int soma=0;
        double media=0;
        double solucao =0;
        double resultado =0;

        for(int i =0 ; i < latas.length;i++){
           latas[i] = rand.nextInt(11)+385;
            soma += latas[i];
        }

        System.out.println("Soma "+soma);
        System.out.println("Total do vetor: "+latas.length);
        media =(double) soma/latas.length;

        System.out.println("Media: "+media);

        for(int i =0 ; i < latas.length;i++){
            solucao += Math.pow((latas[i]-media),2);
        }
        resultado = solucao/(latas.length-1);
        resultado = Math.sqrt(resultado);
        System.out.println("A media de variação na lata é "+media+" ml");
        System.out.println("O padrão de desvio é :"+resultado);
        if (resultado > 5 || resultado < -5){
            System.out.println("O processo dever ser revisado");
        }else{
            System.out.println("O processo não deve ser revisado");
        }
    }
}
